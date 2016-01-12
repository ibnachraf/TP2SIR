package domain;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Generated;
@Entity
@DiscriminatorValue("Chauffage")
public class Chauffage extends InteligentDevice {

//	long id;
	float conso;
//	Residence residence;
	
	
	public Chauffage(float conso) {
		super();
		this.conso = conso;
	}

	public Chauffage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Chauffage(float conso, Residence residence) {
		super();
		this.conso = conso;
//		this.residence = residence;
	}

//	@Id
//	@GeneratedValue
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public float getConso() {
		return conso;
	}

	public void setConso(float conso) {
		this.conso = conso;
	}
//	@ManyToOne(cascade=CascadeType.PERSIST)
//	public Residence getResidence() {
//		return residence;
//	}
//
//	public void setResidence(Residence residence) {
//		this.residence = residence;
//	}
	
	
}
