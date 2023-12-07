package DI.messages.injector;

import DI.messages.consumer.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}
