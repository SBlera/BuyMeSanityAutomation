public class Main {
    public static void main(String[] args) throws Exception {

        //main flow according to project requirement
        StartAndNavigate.RunStartAndNavigate();
        Login.RunLoginNewUser();
        GiftProperties.SetGiftProperties();
        PickBusiness.SetGiftAndPrice();
        SenderReceiverName.SetSenderReceiverNameInfo();
        EventType.SetEventType();
        UploadFile.RunUploadFile();
        Notifications.SendNotificationUponPayment();
        Notifications.SetNotificationTypeAndInfo();
    }
}




