package tech.namas.demo.ioc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.namas.demo.ioc.services.MessageService;
import tech.namas.demo.ioc.services.SpeakService;

@Service
public class SpeakServiceImpl implements SpeakService {

    @Autowired
    private MessageService messageService;

    @Override
    public void sayHello(String message) {
        System.out.println(this.messageService.hello(message));
    }
}
