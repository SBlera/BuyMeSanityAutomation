import org.openqa.selenium.By;

public class test {
    public static void main(String[] args) {
        StartAndNavigate.RunStartAndNavigate();
        SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"ember714\"]/div/ul[1]/li[2]/a")).click();
    }
}
