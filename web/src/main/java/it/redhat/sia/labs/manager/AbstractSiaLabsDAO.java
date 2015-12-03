package it.redhat.sia.labs.manager;

import org.springframework.stereotype.Component;

import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@TransactionManagement(TransactionManagementType.CONTAINER)
public abstract class AbstractSiaLabsDAO<T> extends AbstractDAO<T>{

    @PersistenceContext(name = "sialabs-pu", unitName = "sialabs-pu")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
