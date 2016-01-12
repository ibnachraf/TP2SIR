package domain;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Person {
	private long id;
	String nom;
	String prenom;
	String mail;
	List<Residence> residences;
	List<Person> ami;
	List<ElectronicDevices> devices;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}
	
	public Person(String nom, String prenom, String mail, List<Residence> residences) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.residences = residences;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@OneToMany(mappedBy="proprio")
	public List<Residence> getResidences() {
		return residences;
	}

	public void setResidences(List<Residence> residences) {
		this.residences = residences;
	}

	@OneToMany
	public List<Person> getAmi() {
		return ami;
	}

	public void setAmi(List<Person> ami) {
		this.ami = ami;
	}

	@OneToMany(mappedBy="proprio")
	public List<ElectronicDevices> getDevices() {
		return devices;
	}

	public void setDevices(List<ElectronicDevices> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", residences="
				+ residences + ", ami=" + ami + ", devices=" + devices + "]";
	}
	
	
	

}
