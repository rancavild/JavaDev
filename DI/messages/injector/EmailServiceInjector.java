package DI.messages.injector;

import DI.messages.consumer.Application;
import DI.messages.consumer.Consumer;
import DI.messages.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new Application(new EmailServiceImpl());
    }
}
