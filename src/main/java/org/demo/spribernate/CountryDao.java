package org.demo.spribernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author teodora.bobirneci
 */
@Repository
public class CountryDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Country> list() {
        Session session = this.sessionFactory.openSession();
        List<Country> personList = session.createQuery("from Country").list();
        session.close();
        return personList;
    }
}
