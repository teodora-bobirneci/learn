package org.demo.spribernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author teodora.bobirneci
 */
public class SpribernateTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/demo/spribernate/xml/spring-beans.xml");
        CountryDao countryDao = context.getBean(CountryDao.class);

        countryDao.list().forEach(System.out::println);
    }
}
