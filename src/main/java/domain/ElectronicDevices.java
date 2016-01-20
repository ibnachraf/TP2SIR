package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("ElectronicDevice")
public class ElectronicDevices extends InteligentDevice {
	
	//long id;
	int consommation;
	Person proprio;
	
	
	
	public ElectronicDevices(int consommation) {
		super();
		this.consommation = consommation;
	}
	public ElectronicDevices() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	
//	@Id
//	@GeneratedValue
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public int getConsommation() {
		return consommation;
	}
	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}
	@ManyToOne
	public Person getProprio() {
		return proprio;
	}
	public void setProprio(Person proprio) {
		this.proprio = proprio;
	}
	
	
	
	
	

}
