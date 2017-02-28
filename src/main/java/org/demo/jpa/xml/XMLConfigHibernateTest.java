package org.demo.jpa.xml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author teodora.bobirneci
 */
public class XMLConfigHibernateTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sakilaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        try {
            entityManager.createQuery("from Actor", Actor.class).getResultList().forEach(System.out::println);
        } finally {
            if (entityManagerFactory.isOpen()) {
                entityManagerFactory.close();
            }
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }
}
