package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	int id;
	String name;
	String cmpname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmpname() {
		return cmpname;
	}
	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", cmpname=" + cmpname + "]";
	}


}
