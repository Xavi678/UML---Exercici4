import java.util.*;

public class Metge {

	Collection<Atès> Atessos;
	private int codi_metge;
	private string nom;
	private string cognoms;

	public int getCodi_metge() {
		return this.codi_metge;
	}

	public void setCodi_metge(int codi_metge) {
		this.codi_metge = codi_metge;
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

	public List<Diagnostic> obtenirDiagnostic() {
		// TODO - implement Metge.obtenirDiagnostic
		throw new UnsupportedOperationException();
	}

}