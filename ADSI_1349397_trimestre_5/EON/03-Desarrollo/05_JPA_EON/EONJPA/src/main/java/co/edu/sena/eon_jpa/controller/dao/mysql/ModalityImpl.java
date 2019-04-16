/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eon_jpa.controller.dao.mysql;

import co.edu.sena.eon_jpa.controller.dao.ModalityDao;
import co.edu.sena.eon_jpa.model.jpa.entities.Modality;
import java.util.List;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

/**
 *
 * @author Telegrafia01
 */
public class ModalityImpl extends AbstractDao <Modality>implements ModalityDao<Modality>{

    public ModalityImpl(Class<Modality> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Modality> findByNameModality(String name) {
try {
            this.getEntityManager();
            Query query = this.em.createNamedQuery("Modality.findByNameModality");
            query.setParameter("name", name);
            return query.getResultList();
        } catch (PersistenceException e) {
            System.out.println("Exception:" + e.getMessage());
        }
        return null;    

    }

    @Override
    public List<Modality> findByLikeNameModality(String name) {
       try {
            this.getEntityManager();
            Query query = this.em.createNamedQuery("Modality.findByLikeNameModality");
            query.setParameter("name", name);
            return query.getResultList();
        } catch (PersistenceException e) {
            System.out.println("Exception:" + e.getMessage());
        }
        return null;        }

    @Override
    public List<Modality> findByState(Boolean state) {
try {
            this.getEntityManager();
            Query query = this.em.createNamedQuery("Modality.findByState");
            query.setParameter("state", state);
            return query.getResultList();
        } catch (PersistenceException e) {
            System.out.println("Exception:" + e.getMessage());
        }
        return null;    
    }

    @Override
    public int updatePrimaryKey(String nuevoModality, String viejoModality) {

  try {
            this.getEntityManager();

            if (this.find(viejoModality) != null) {

                Query query = this.em.createNamedQuery("Modality.updatePrimaryKey");
                query.setParameter("nuevoModality",nuevoModality );
                query.setParameter("viejoModality", viejoModality );
                this.em.getTransaction().begin();
                int res = query.executeUpdate();
                this.em.getTransaction().commit();
                return res;
            } else {
                return 0;
            }

        } catch (PersistenceException e) {
            System.out.println("Exception:" + e.getMessage());
        }

        return 0;    }
    
}