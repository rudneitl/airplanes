package business;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.PlayerDO;
import repository.PlayerRepository;

@Local
@Stateless
public class PlayerBusinessImpl {

	@EJB
	private PlayerRepository player;
	
	public void save(PlayerDO playerDO) {
		player.save(playerDO);
	}
}
