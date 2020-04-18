package tech.namas.demo.ioc;

import tech.namas.demo.ioc.services.SpeakService;
import tech.namas.demo.ioc.services.impl.SpeakServiceImpl;

public class DependencyInjectionApplication {

    public static void main(String[] args) {
        SpeakService service = new SpeakServiceImpl();

        service.sayHello("world");
    }

}
