public class Main {
    public static void main(String[] args) throws Exception {
        StartAndNavigate.RunStartAndNavigate();
        Login.RunLoginNewUser();
        GiftProperties.SetGiftProperties();
        PickBusiness.SetGiftAndPrice();
        SenderRecieverName.SetSenderReceiverNameInfo();
        EventType.SetEventType();
        UploadFile.RunUploadFile();
        SendNotification.SendNotificationUponPayment();
        NotificaionType.SetNotificationTypeAndInfo();
    }
}




