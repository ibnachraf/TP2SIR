package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
@Entity
public class Residence {

	long id;
	int taille,nbPieces;
	Person proprio;
//	List<Chauffage> chauffages;
	

	
	
	
	public Residence(int taille, int nbPieces, Person proprio, List<Chauffage> chauffages
			) {
		super();
		this.taille = taille;
		this.nbPieces = nbPieces;
		this.proprio = proprio;
//		this.chauffages = chauffages;
		
	}

	public Residence(int taille, int nbPieces, List<Chauffage> chauffages) {
		super();
		this.taille = taille;
		this.nbPieces = nbPieces;
//		this.chauffages = chauffages;
		
	}
	
	public Residence() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	
//	@OneToMany(mappedBy="residence")
//	public List<Chauffage> getChauffages() {
//		return chauffages;
//	}
//
//	public void setChauffages(List<Chauffage> chauffages) {
//		this.chauffages = chauffages;
//	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Person getProprio() {
		return proprio;
	}

	public void setProprio(Person proprio) {
		this.proprio = proprio;
	}

//	@Override
//	public String toString() {
//		return "Residence [id=" + id + ", taille=" + taille + ", nbPieces=" + nbPieces + ", proprio=" + proprio
//				+ ", chauffages=" + chauffages + "]";
//	}
	
	
	
	
}
