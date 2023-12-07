package DI.messages;

import DI.messages.consumer.Consumer;
import DI.messages.injector.EmailServiceInjector;
import DI.messages.injector.MessageServiceInjector;
import DI.messages.injector.SMSServiceInjector;

public class MessageApp {
    public static void main(String[] args) {
        String message = "Hello God";
        String email = "gopher@mail.com";
        String phone = "903221112";

        MessageServiceInjector injector;
        Consumer app;

        // Sending an email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(message, email);

        // Sending a SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(message, phone);
    }
}
