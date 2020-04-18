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

        SpeakService speakService = beanFactory.getBean("speakService", SpeakService.class);
        speakService.sayHello("world");

        SpeakService speakServiceIdn = beanFactory.getBean("speakServiceIdn", SpeakService.class);
        speakServiceIdn.sayHello("dunia");

        // Next challenge for you:
        // - Ask yourself how do we get "speakService" and "speakServiceIdn" automatically?
        //   How do spring do it?
        // - What if we want to use different name?
        // - Learn about @Qualifier and Bean name
    }

}
