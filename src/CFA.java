import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CFA {

	//COmposition de classes avec las conteneurs Java : HashMap
	private HashMap<String, Etudiant>lesEtudiants;
	
	//Les clés sont les numéros des cartes des etudiants
	//les valeurs sont les etudiants (instances) eux-meme
	
	public CFA() {
		//insatnciation de la HashMap()
		this.lesEtudiants = new HashMap<String, Etudiant>();
	}
	
	public void ajouterEtudiant() {
		String numCarte ;
		System.out.println("Donner le numero de la carte etudiant à rechrcher : ");
		numCarte = Console.SaisirString();
		if(this.lesEtudiants.containsKey(numCarte)) {
			System.out.println("Etudiant trouve : ");
			this.lesEtudiants.put(numCarte, null).afficher();
		}
	}
	
	public void listerEtudiants() {
		//parcours par clé : les numéros des cartes
		for (String numCarte : this.lesEtudiants.keySet()) {//pour chaque clé dans toutes les clées
			//recuperer l'etudiant qui a la cle d'une carte et l'afficher
			this.lesEtudiants.get(numCarte).afficher();
			
			}
		
		//parcours pars valeur : les instances d'objets Etudiant
		for(Etudiant unEtudiant : this.lesEtudiants.values()) {
		unEtudiant.afficher();
		}
	}
	
	public void rechercherEtudiant () {
		String numCarte ;
		System.out.println("Donner le numero de la carte etudiant à rechrcher : ");
		numCarte = Console.SaisirString();
		if(this.lesEtudiants.containsKey(numCarte)) {
			System.out.println("Etudiant trouve : ");
			this.lesEtudiants.get(numCarte).afficher();
		}else {
			System.out.println("Etudiant non trouvé.");
		}
	}
	
	public void retirerEtudiant() {
		String numCarte ;
		System.out.println("Donner le numero de la carte etudiant à rechrcher : ");
		numCarte = Console.SaisirString();
		if(this.lesEtudiants.containsKey(numCarte)) {
			System.out.println("Etudiant trouve : ");
			this.lesEtudiants.remove(numCarte).afficher();
		}
	}
	
	public float totalMontants () {
		float total = 0;
		for (Etudiant unEtudiant : this.lesEtudiants.values()) {
			total = total + Etudiant.getMontant(); //static, donc passer par classe
		}
		return total;
	}
	
	public ArrayList<Etudiant> getLesEtudiants (char lettre) {
		//retourne une liste d'etudiants dont le nom commence avec cette lettre
		ArrayList<Etudiant>laListe = new ArrayList<Etudiant>();
		
		for (Etudiant unEtudiant : this.lesEtudiants.values()) {
			if (unEtudiant.getNom().charAt(0) == lettre) {
				laListe.add(unEtudiant);
			}
		}
		return laListe;
	}
	
	public void menu() {
		int choix = 0;
		do {
			System.out.println("______GESTION DES ETUDIANTS______");
			System.out.println("1 - Ajouter un étudiant");
			System.out.println("2 - Lister les étudiants");
			System.out.println("3 - Rechercher un etudiant");
			System.out.println("4 - Retirer un etudiant");
			System.out.println("5 - Total montants Scolarité");
			System.out.println("6 - Liste par lettre");
			System.out.println("0 - Quitter");
			System.out.println("Votre choix");
			
			choix = Console.SaisirInt();
			switch (choix) {
			case 1 : this.ajouterEtudiant();break;
			case 2 : this.listerEtudiants();break;
			case 3 : this.rechercherEtudiant();break;
			case 4 : this.retirerEtudiant();break;
			case 5 : System.out.println("Total Montant : " + Etudiant.montants) ; break ;
			}
		}while (choix !=0);
	}

	
	public static void main(String[] args) {
		
		/*
		 * instanciation de la Cladde Etudiant avec le premier constructeur qui n'a pas
		 * d'arguments
		 
		
		Etudiant unEtudiant = new Etudiant();


		 * instanciation de la Cladde Etudiant avec le premier constructeur qui n'a pas
		 * d'arguments
		 
		
		Etudiant unEtudiant2= new Etudiant ("001", "Adel", "AbdelHakim";)
		
		
		1. LE CFA augmente le prix de scolarite
		
		Etudiant.setMontant(6000); /*changer le prix -> static, elle fixe le montnat pour toutes 
		les insatnces de la classe, on peut l'appeler directement
		
		//Etudiant.saisir() -> non stafic, elle doit etre appelée avec une insance de classe
		 * elle a besoin d'un objet pour etre appeée
		
		
		//Quel est le diplome préparé par les etudiants
		System.out.println("Diplome : " + Etudiant.getDiplome());
		
		Etudiant un Etudiant = new Etudiant ("001");
		//Quel est le constructeur appelé ici : Le troisième, il recoit un seul argument
		
		//Cet etudiant, souahite changer de diplome, en Mastere
		unEtudiant.setDiplome("Mastere");
		sysout
		*/
		
		
	}

}
