package biblioteca;

public class Bliblioteca {
	int id_biblioteca;
	String nom;

	public int getId_biblioteca() {
		return id_biblioteca;
	}

	private void setId_biblioteca(int id_biblioteca) {
		this.id_biblioteca = id_biblioteca;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Bliblioteca() {
		super();
	}
}
