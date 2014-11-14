package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String login;
	
	@Column
	private String password;
	
	@Column
	private char status;
	
	@Column
	private boolean changePass;
	
	@Column
	private Date creation;
	
	@Column
	private Date update;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public boolean isChangePass() {
		return changePass;
	}

	public void setChangePass(boolean changePass) {
		this.changePass = changePass;
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

	@Override
	public String toString() {
		return "UserDO [id=" + id + ", name=" + name + ", login=" + login
				+ ", password=" + password + ", status=" + status
				+ ", changePass=" + changePass + ", creation=" + creation
				+ ", update=" + update + "]";
	}
	
}
