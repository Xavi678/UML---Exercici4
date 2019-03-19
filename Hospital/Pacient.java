public class Pacient {

	Llit llit;
	private string SS;
	private string DNI;
	private string NOM;
	private string COGNOMS;
	private Date dataNaixement;

	public string getSS() {
		return this.SS;
	}

	public void setSS(string SS) {
		this.SS = SS;
	}

	public string getDNI() {
		return this.DNI;
	}

	public void setDNI(string DNI) {
		this.DNI = DNI;
	}

	public string getNOM() {
		return this.NOM;
	}

	public void setNOM(string NOM) {
		this.NOM = NOM;
	}

	public string getCOGNOMS() {
		return this.COGNOMS;
	}

	public void setCOGNOMS(string COGNOMS) {
		this.COGNOMS = COGNOMS;
	}

	public Date getDataNaixement() {
		return this.dataNaixement;
	}

	public void setDataNaixement(Date dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

}