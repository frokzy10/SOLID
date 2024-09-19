package SOLID;

interface MessagingService {
    void sendMessage(String message);
}

class EmailService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService  {
    private MessagingService messagingService;

    public NotificationService(MessagingService messagingService) {
        this.messagingService = messagingService;
    }
    public void sendMessage(String message) {
        messagingService.sendMessage(message);
    }
}

class Main5 {
    public static void main(String[] args) {
        MessagingService smsService = new SmsService();
        NotificationService notificationService = new NotificationService(smsService);
        notificationService.sendMessage("Hello World from sms");

        MessagingService emailService = new EmailService();
        NotificationService notificationEmail = new NotificationService(emailService);
        notificationEmail.sendMessage("Hello World from email");
    }
}