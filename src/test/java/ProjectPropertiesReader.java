import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

//Reader of properties for the project reading from XML file (Driver type , place and desired url)
public class ProjectPropertiesReader {

    //Singelton reader
    private static  ProjectPropertiesReader instance;
    public static ProjectPropertiesReader GetInstance(){
        if (instance == null){
            instance = new  ProjectPropertiesReader();
        }
        return instance;
    }

    //enable to read from file
    private Element OpenPropertiesFile() throws Exception {
        File file = new File("C:\\Users\\Lera\\IdeaProjects\\BuyMeAutomation\\src\\test\\java\\ProjectProperties.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        var rootElement = document.getDocumentElement();
        return rootElement;
    }

    //receive attributes from file
    private String GetAttributeFromRootElement(String attributeName) {

        try {

            var rootElement = OpenPropertiesFile();
            return rootElement.getAttribute(attributeName);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return null;

    }
    //methods to get every element
    public String GetDriverType()  {
        return GetAttributeFromRootElement("DriverType");
    }

    public String GetDriverPath()  {
        return GetAttributeFromRootElement("DriverPath");
    }

    public String GetProjectUrl()  {
        return GetAttributeFromRootElement("Url");
    }
}
