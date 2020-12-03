package fr.fl.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "restaurants")
@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(generator = "system-uuid") //par défaut uitlise type long ou Integer, generator defini "system-uuid" il nous faut donc en dessous
	//le genericGenerator => nous genere une suite de chaine de caractère qui sera unique et sera généré automatiquement
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;
	private String name;
	private String address;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
