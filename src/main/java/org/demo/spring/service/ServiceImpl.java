package org.demo.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author teodora.bobirneci
 */
@Service
public class ServiceImpl implements IService {
    @Override
    public void doSomething() {
        System.out.println("Implementation");
    }
}
