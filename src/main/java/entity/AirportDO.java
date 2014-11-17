package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class AirportDO implements AbstractDO {

	private static final long serialVersionUID = 78407269687521927L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id; 
	
	@Column
	private String name;
	
	@Column
	private char status;
	
	@Column
	private Date creation;
	
	@Column
	private Date update;

	@OneToOne
	private PlayerDO player;
	
	@OneToMany
	private LocateDO locate;
	
	@OneToMany
	private AirportTypeDO type;
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public PlayerDO getPlayer() {
		return player;
	}

	public void setPlayer(PlayerDO player) {
		this.player = player;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AirportDO [id=" + id + ", name=" + name + ", status=" + status
				+ ", creation=" + creation + ", update=" + update + ", player="
				+ player + "]";
	}

}
