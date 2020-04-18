package tech.namas.demo.ioc.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.namas.demo.ioc.services.MessageService;
import tech.namas.demo.ioc.services.SpeakService;
import tech.namas.demo.ioc.services.impl.MessageServiceIdn;
import tech.namas.demo.ioc.services.impl.MessageServiceImpl;
import tech.namas.demo.ioc.services.impl.SpeakServiceImpl;

@Configuration
public class ServiceConfiguration {

    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }

    @Bean
    public MessageService messageServiceIdn() {
        return new MessageServiceIdn();
    }

    @Bean
    public SpeakService speakService(MessageService messageService) {
        return new SpeakServiceImpl(messageService);
    }

    @Bean
    public SpeakService speakServiceIdn(MessageService messageServiceIdn) {
        return new SpeakServiceImpl(messageServiceIdn);
    }
}
