package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CountryDO implements AbstractDO {

	private static final long serialVersionUID = 8598191451129589866L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String name;

	@Column
	private Date creation;

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "CountryDO [id=" + id + ", name=" + name + ", creation="
				+ creation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
