public class Main {
    public static void main(String[] args) throws Exception {

        //main flow according to project requirement
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




