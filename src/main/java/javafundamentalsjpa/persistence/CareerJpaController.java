package javafundamentalsjpa.persistence;

import java.io.Serializable;
import java.util.List;
import javafundamentalsjpa.logic.Career;
import javafundamentalsjpa.persistence.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CareerJpaController implements Serializable {

    public CareerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CareerJpaController() {
        this.emf = Persistence.createEntityManagerFactory("JavaFundamentalsJPA_PU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Career career) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(career);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Career career) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            career = em.merge(career);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = career.getId();
                if (findCareer(id) == null) {
                    throw new NonexistentEntityException("The career with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Career career;
            try {
                career = em.getReference(Career.class, id);
                career.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The career with id " + id + " no longer exists.", enfe);
            }
            em.remove(career);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Career> findCareerEntities() {
        return findCareerEntities(true, -1, -1);
    }

    public List<Career> findCareerEntities(int maxResults, int firstResult) {
        return findCareerEntities(false, maxResults, firstResult);
    }

    private List<Career> findCareerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Career.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Career findCareer(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Career.class, id);
        } finally {
            em.close();
        }
    }

    public int getCareerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Career> rt = cq.from(Career.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
