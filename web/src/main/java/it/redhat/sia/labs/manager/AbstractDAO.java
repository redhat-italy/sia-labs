package it.redhat.sia.labs.manager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class AbstractDAO<T> {

    protected abstract EntityManager getEntityManager();

    private Class<T> entityClass;

    public AbstractDAO() {
    }

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected Session getCurrentSession() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory.getCurrentSession();
    }

    public void create(T entity){
        System.out.println(entity.toString());
        System.out.println(getEntityManager());
        getEntityManager().persist(entity);
    }

    public T read(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public void update(T entity) {
        getEntityManager().merge(entity);
    }

    public void delete(T entity) {
        getEntityManager().merge(entity);
    }

    public List<T> all() {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        return criteria.list();
    }
}
