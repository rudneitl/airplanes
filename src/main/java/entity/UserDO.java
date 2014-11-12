package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table (name = "user")
@Entity
public class UserDO implements AbstractDO {

	private static final long serialVersionUID = -4754787582858894549L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@ManyToOne
	private UserType type;
	
	public Integer getId() {
		return id;
	}

	
}
