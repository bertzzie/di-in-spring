package tech.namas.demo.ioc.services.impl;

import tech.namas.demo.ioc.services.MessageService;
import tech.namas.demo.ioc.services.SpeakService;

public class SpeakServiceImpl implements SpeakService {

    private final MessageService messageService;

    public SpeakServiceImpl() {
        this.messageService = new MessageServiceImpl();
    }

    @Override
    public void sayHello(String message) {
        System.out.println(this.messageService.hello(message));
    }
}
