public class Persona {

	private int codi;
	private string nom;
	private string cognoms;
	private Date dataNaixement;
	private string correu;

	public int getCodi() {
		return this.codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
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

	public string getCorreu() {
		return this.correu;
	}

	public void setCorreu(string correu) {
		this.correu = correu;
	}

	public Músic obtenirMúsica() {
		// TODO - implement Persona.obtenirMúsica
		throw new UnsupportedOperationException();
	}

}