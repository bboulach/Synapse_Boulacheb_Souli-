package fr.synapsegaming.user.dao.impl;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import fr.synapsegaming.commons.dao.AbstractDao;
import fr.synapsegaming.user.dao.ClazzDao;
import fr.synapsegaming.user.entity.Clazz;

@Repository("ClazzDao")
public class ClazzDaoImpl extends AbstractDao<Clazz, Long> implements ClazzDao {

    /**
     * The logger
     */
    private static final Logger LOGGER = Logger.getLogger(ClazzDaoImpl.class);

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Clazz> listClassForRace(long idRace) {
        Session session = this.getSession();
        try {
        	Query query = session.createQuery("select uc from User u inner join u.clazz uc "
            		+ "group by uc.id order by count(*) desc, uc.name");
            query.setParameter("idRace", idRace);
            return query.list();
        } catch (Exception e) {
            LOGGER.warn(e);
            LOGGER.warn("Pas de race saisie");
            return Collections.emptyList();
        } finally {
            session.close();
        }

    }
    
    @SuppressWarnings("unchecked")
   	@Override
   	public List<Clazz> listMostPlayed(int nbClazz) {
   		Session session = this.getSession();
           try {
        	   Query query = session.createQuery("from Clazz c order by size(c.users) desc");
               		//+ "group by uc.id order by count(*) desc, uc.name");
               query.setMaxResults(nbClazz);
               return query.list();
           } catch (Exception e) {
               LOGGER.warn("C'est vide");
               return Collections.emptyList();
           } finally {
               session.close();
           }
   	}

    

}
