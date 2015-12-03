package it.redhat.sia.labs.manager;

import it.redhat.sia.labs.model.entity.UtenteEntity;
import org.springframework.stereotype.Component;

import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UtenteDAO extends AbstractDAO<UtenteEntity> {

    //@PersistenceContext(name = "sialabs-pu", unitName = "sialabs-pu")
    @PersistenceContext
    private EntityManager entityManager;

    public UtenteDAO() {
        super(UtenteEntity.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public void leggiUtente(Integer id) {
        read(id);
    }

    public void inserisciUtente(UtenteEntity entity) {
        create(entity);
    }
/*
    public List<UtenteEntity> findBySess(String sesso) {
        try {
            Query q = getEntityManager().createNamedQuery("findBySesso");
            q.setParameter("", sesso);
            info(sessioneUtente, "Ritorno lista Profilo.");
            return q.getResultList();
        } catch (Exception ex) {
            throw new ProfiloManagerException("Errore durante la query Profilo.findByCfCodSoggettoConValidi", ex);
        }
    }
*/

}
