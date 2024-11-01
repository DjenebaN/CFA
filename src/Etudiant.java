
public class Etudiant {
	private String numCarte;
	private String nom, prenom;
	private static float montant;
	private static String diplome;
	public static String montants;
	
	public Etudiant() {
		this.numCarte="";
		this.nom="";
		this.prenom="";
		Etudiant.montant=0; //Ne pas mettre à 0 -> par defaut tous les etudiants paient 5000 euros
		Etudiant.diplome="BTS SIO";//Par defaut tous les etudiants preparent un BTS SIO
	}
	
	
	public Etudiant (String numCarte, String nom, String prenom) {
		this.numCarte = numCarte;
		this.nom= nom;
		this.prenom = prenom;
		Etudiant.montant = 5000;
		Etudiant.diplome = "BTS SIO";
	}
	
	
	public Etudiant(String numCarte) {
		super();
		this.numCarte = numCarte;
		this.nom = "";
		this.prenom = "";
		Etudiant.montant = 5000;
		Etudiant.diplome = "BTS SIO";
	}

	
	public void saisir() {
		System.out.println("Numero de la caret:");
		this.numCarte = Console.SaisirString();
		System.out.println("Nom Etudiant:");
		this.nom = Console.SaisirString();
		System.out.println("Prénom Etudiant:");
		this.prenom = Console.SaisirString();
		//Ne pas saisir montant et diplome car ils sont statics
	}
	
	
	public void afficher () {
		System.out.println("___Infos Etudiant");
		System.out.println("Num Carte :" + this.numCarte);
		System.out.println("Etudiant : " + this.nom + this.prenom);
		System.out.println("Montant Scolarité : "+ Etudiant.montant);
		System.out.println("L'etudiant prépare le diplome : "+ Etudiant.diplome);
	}
	

	public String getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public static float getMontant() {
		return montant;
	}

	public static void setMontant(float montant) {
		Etudiant.montant = montant;
	}

	public static String getDiplome() {
		return diplome;
	}

	public static void setDiplome(String diplome) {
		Etudiant.diplome = diplome;
	}
	
}





