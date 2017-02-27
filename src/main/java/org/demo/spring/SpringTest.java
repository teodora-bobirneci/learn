package org.demo.spring;

import org.demo.spring.configuration.Application;
import org.demo.spring.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author teodora.bobirneci
 */
@Component
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        context.getBean(IService.class).doSomething();
    }
}
