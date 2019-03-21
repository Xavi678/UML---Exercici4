public class Assegurances_Automòbil extends Assegurances {

	private Date data;
	private string matrícula;
	private int recàrrecs;
	private float descompte;

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public string getMatrícula() {
		return this.matrícula;
	}

	public void setMatrícula(string matrícula) {
		this.matrícula = matrícula;
	}

	public float getDescompte() {
		return this.descompte;
	}

	public void setDescompte(float descompte) {
		this.descompte = descompte;
	}

}