package tech.namas.demo.ioc.services.impl;

import tech.namas.demo.ioc.services.MessageService;

public class MessageServiceImpl implements MessageService {
    @Override
    public String hello(String message) {
        return String.format("Hello, %s", message);
    }
}
