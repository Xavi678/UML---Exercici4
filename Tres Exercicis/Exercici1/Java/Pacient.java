import java.util.*;

public class Pacient {

	Collection<Tarja_Visita> Targetes;
	Collection<Atès> Atessos;
	private string dni;
	private string nss;
	private string nom;
	private string cognoms;
	private Date dataNaixement;

	public string getDni() {
		return this.dni;
	}

	public void setDni(string dni) {
		this.dni = dni;
	}

	public string getNss() {
		return this.nss;
	}

	public void setNss(string nss) {
		this.nss = nss;
	}

	public string getNom() {
		return this.nom;
	}

	public void setNom(string nom) {
		this.nom = nom;
	}

	public string getCognoms() {
		return this.cognoms;
	}

	public void setCognoms(string cognoms) {
		this.cognoms = cognoms;
	}

	public Date getDataNaixement() {
		return this.dataNaixement;
	}

	public void setDataNaixement(Date dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	public void afegirLlit() {
		// TODO - implement Pacient.afegirLlit
		throw new UnsupportedOperationException();
	}

}