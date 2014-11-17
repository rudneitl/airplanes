package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "player")
@Entity
public class PlayerDO implements AbstractDO {

	private static final long serialVersionUID = -5608512093361227877L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private Double money;

	@Column
	private Integer level;

	@Column
	private Date creation;

	@OneToOne
	private UserDO user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public UserDO getUser() {
		return user;
	}

	public void setUser(UserDO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "PlayerDO [id=" + id + ", money=" + money + ", level=" + level
				+ ", creation=" + creation + ", user=" + user + "]";
	}

}
