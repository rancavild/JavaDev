package DI.messages.consumer;

import DI.messages.service.MessageService;

public class Application implements Consumer {
    private MessageService service;

    public Application(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessage(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
