package org.demo.spring.xml;

import org.demo.spring.xml.service.IXMLService;
import org.demo.spring.xml.service.XMLServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author teodora.bobirneci
 */
@Component
public class SpringXMLTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        IXMLService obj = (XMLServiceImpl) context.getBean("xmlService");

        obj.doSomething();
    }
}
