package DAO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import repository.UserRepository;
import entity.UserDO;

@Local
@Stateless
public class UserDAO extends AbstractDAO<UserDO, Number> implements UserRepository {

	public UserDAO() {
		super(UserDO.class);
	}

	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
