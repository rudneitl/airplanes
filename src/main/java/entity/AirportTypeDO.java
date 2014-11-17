package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AirportTypeDO implements AbstractDO {

	private static final long serialVersionUID = -5157962557046896257L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private Integer vacancy;
	
	@Column
	private Double price;
	
	@Column
	private Date creation;
	
	@Column
	private Date update;
	
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "AirportTypeDO [id=" + id + ", name=" + name + ", vacancy="
				+ vacancy + ", price=" + price + ", creation=" + creation
				+ ", update=" + update + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVacancy() {
		return vacancy;
	}

	public void setVacancy(Integer vacancy) {
		this.vacancy = vacancy;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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

	public void setId(Integer id) {
		this.id = id;
	}

}
