package org.demo.designpatterns.observer;

/**
 * @author teodora.bobirneci
 */
interface Subject {

    void register(Observer o);

    void unregister(Observer o);

    void notifyObserver();

}
