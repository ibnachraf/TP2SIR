package domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="InteligentDevicetype",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("InteligentDevice")
public class InteligentDevice {

	@Id
	@GeneratedValue
	long id;
	String marque;
  
	
	
	
	public InteligentDevice() {
		super();
		// TODO Auto-generated constructor stub
	}




	public InteligentDevice(String marque) {
		super();
		this.marque = marque;
	}




	public String getMarque() {
		return marque;
	}




	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
	
	
}
