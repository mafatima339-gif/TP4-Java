package partie;

public class ComptePremium extends Compte{
	
	private double plafondRetrait;

	public ComptePremium(String numero,String titulaire, double solde ,double plafondRetrait) {
		super(numero,titulaire,solde);
		this.plafondRetrait = plafondRetrait;
	}
	@Override
	public void retirer(double montant) {
		 if (montant > plafondRetrait) {
			 System.out.println("retrait impossible, montant supérieur au plafond");
		 }else if (solde>=montant){
			 solde -= montant;
			 
		 }else {
			 System.out.println("retrait mpossible ,solde insuffisant");
		 }
	}
	public double getPlafondRetrait() { 
		return plafondRetrait; 
		}
	
	public void setPlafondRetrait(double plafondRetrait) {
		this.plafondRetrait = plafondRetrait;
	}
	@Override
    public void afficher() {
        super.afficher();
        System.out.println("Plafond de retrait : " + plafondRetrait);
    }
	
	
	
	

}
