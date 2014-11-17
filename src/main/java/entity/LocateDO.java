package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class LocateDO implements AbstractDO {

	private static final long serialVersionUID = 8423572245752413940L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String name;

	@Column
	private String latitude;

	@Column
	private String longitude;

	@Column
	private Date creation;
	
	@OneToOne
	private StateDO state;
	
	@Column
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "LocateDO [id=" + id + ", name=" + name + ", latitude="
				+ latitude + ", longitude=" + longitude + ", creation="
				+ creation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
