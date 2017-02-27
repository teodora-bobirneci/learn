package org.demo.spring.xml.service;

import org.springframework.stereotype.Service;

/**
 * @author teodora.bobirneci
 */
@Service
public class XMLServiceImpl implements IXMLService {
    @Override
    public void doSomething() {
        System.out.println("XML Implementation");
    }
}
