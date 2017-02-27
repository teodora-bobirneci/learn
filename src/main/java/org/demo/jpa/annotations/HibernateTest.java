package org.demo.jpa.annotations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author teodora.bobirneci
 */
public class HibernateTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("worldPU");
        EntityManager em = emf.createEntityManager();

        Query allCities = em.createQuery("from City", City.class);
        List resultList = allCities.getResultList();//.forEach(System.out::println);

        em.close();
        emf.close();
    }
}
