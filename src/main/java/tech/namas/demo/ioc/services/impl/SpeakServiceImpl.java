package tech.namas.demo.ioc.services.impl;

import org.springframework.stereotype.Service;
import tech.namas.demo.ioc.services.MessageService;
import tech.namas.demo.ioc.services.SpeakService;

@Service
public class SpeakServiceImpl implements SpeakService {

    private MessageService messageService;

    public SpeakServiceImpl(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void sayHello(String message) {
        System.out.println(this.messageService.hello(message));
    }
}
