package tech.namas.demo.ioc.services.impl;

import org.springframework.stereotype.Service;
import tech.namas.demo.ioc.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public String hello(String message) {
        return String.format("Hello, %s", message);
    }
}
