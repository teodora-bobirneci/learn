package org.demo.spring.annotations;

import org.demo.spring.annotations.configuration.Application;
import org.demo.spring.annotations.service.IService;
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
