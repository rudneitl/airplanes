package DAO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import repository.PlayerRepository;
import entity.PlayerDO;

@Local
@Stateless
public class PlayerDAO extends AbstractDAO<PlayerDO, Number> implements PlayerRepository {

	public PlayerDAO() {
		super(PlayerDO.class);
	}

	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
