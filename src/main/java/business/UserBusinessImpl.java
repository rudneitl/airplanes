package business;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import repository.UserRepository;
import entity.UserDO;

@Local
@Stateless
public class UserBusinessImpl implements UserBusiness {

	@EJB
	private UserRepository user;
	
	public void save(UserDO userDO) {
		user.save(userDO);
	}

}
