package tech.namas.demo.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.namas.demo.ioc.configs.ServiceConfiguration;
import tech.namas.demo.ioc.services.SpeakService;

public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(ServiceConfiguration.class);
        BeanFactory beanFactory = context.getAutowireCapableBeanFactory();

        SpeakService speakService = beanFactory.getBean(SpeakService.class);
        speakService.sayHello("world");
    }

}
