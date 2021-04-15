package echecs;



public abstract class Piece {

	private String nom;
	
	private String couleur;

	
	public Piece()
	{
		this.nom=null;
		this.couleur=null;
	}
	public Piece(String nom, String couleur) {
		setNom(nom);
		setCouleur(couleur);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		if ((couleur == "noir") || (couleur == "blanc"))
			this.couleur = couleur;
	}



	
	public abstract boolean estValide(Deplacement deplacement);

}



