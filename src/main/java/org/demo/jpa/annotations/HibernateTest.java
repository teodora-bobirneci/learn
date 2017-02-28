package org.demo.jpa.annotations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author teodora.bobirneci
 */
public class HibernateTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("worldPU");
        EntityManager em = emf.createEntityManager();

        em.createQuery("from City", City.class).getResultList().forEach(System.out::println);

        em.close();
        emf.close();
    }
}
