public class Assegurances_Vida extends Assegurances {

	private Date dataContractació;
	private string professió;
	private int cobertura;
	private string beneficiaris;

	public Date getDataContractació() {
		return this.dataContractació;
	}

	public void setDataContractació(Date dataContractació) {
		this.dataContractació = dataContractació;
	}

	public string getProfessió() {
		return this.professió;
	}

	public void setProfessió(string professió) {
		this.professió = professió;
	}

	public int getCobertura() {
		return this.cobertura;
	}

	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}

	public string getBeneficiaris() {
		return this.beneficiaris;
	}

	public void setBeneficiaris(string beneficiaris) {
		this.beneficiaris = beneficiaris;
	}

}