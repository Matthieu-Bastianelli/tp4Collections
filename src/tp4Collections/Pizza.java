package tp4Collections;

public class Pizza {
	
	/**
	 * Attributs
	 */
	private String code = null;
	private String nom = null;
	private float prix = Float.MIN_VALUE;
	//--------------------------------------------------------------------------------------
	/**
	 * Création de constructeurs :
	 * @param code
	 * @param nom
	 * @param prix
	 */
	public Pizza(String code, String nom, float prix) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
	}
	

	//Constructeur par défaut :
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * Méthode toString : génère une chaine de caractères présentant les attributs de l'objet.
	 */
	@Override
	public String toString() {
		return "Pizza [code=" + code + ", nom=" + nom + ", prix=" + prix + "\u20ac ]\n";
	}
	

	//--------------------------------------------------------------------------------------
	// Getter et Setter :
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	//--------------------------------------------------------------------------------------

	
	

}
