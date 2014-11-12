package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "usertype")
@Entity
public class UserType implements AbstractDO {

	private static final long serialVersionUID = 4743591978090313324L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String type;
	
	public Integer getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "UserType [id=" + id + ", type=" + type + "]";
	}
}
