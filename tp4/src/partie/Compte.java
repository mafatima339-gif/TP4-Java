package partie;

public class Compte {
	
	protected String numero;
	protected String titulaire;
	protected double solde;
	

	public Compte(String numero,String titulaire, double solde) {
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = solde;
		
	}
	
	//on a pas besoin d utiliser getters et setters car on les attribus déclarés protected 
	
	public void deposer(double montant) {
		solde+= montant;
		
	}
	public void retirer(double montant) {
		if(solde>montant) {
			solde-= montant;
		}else {
			System.out.println("solde insuffisant");
		}
	}
	
	public void afficher() {
		System.out.println("Numéro:"+numero );
		System.out.println("Titulaire:"+titulaire );
		System.out.println("Solde:"+solde );
		
	}
}
