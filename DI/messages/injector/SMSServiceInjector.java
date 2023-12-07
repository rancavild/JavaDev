package DI.messages.injector;

import DI.messages.consumer.Consumer;
import DI.messages.service.SMSServiceImpl;
import DI.messages.consumer.Application;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new Application(new SMSServiceImpl());
    }
}
