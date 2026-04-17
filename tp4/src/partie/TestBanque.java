package partie;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] comptes = new Compte[4];
		comptes[0] = new CompteCourant("1", "fatima", 1000, 500);  
        comptes[1] = new CompteEpargne("2", "wissam", 2000, 0.03);  
        comptes[2] = new ComptePremium("3", "hassan", 5000, 1000); 
        comptes[3] = new CompteCourant("4", "ali", 300, 200);  
        
        for(Compte c: comptes) {
        	c.deposer(200);
            c.retirer(150);
            c.afficher();
        }
        System.out.println("compte épargne uniquement");
        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
        
        
     // Downcasting 
        Compte c = new CompteEpargne("5", "sara", 1500, 0.02);
        // CompteCourant cc = (CompteCourant) c;   Erreur d'exécution : ClassCastException
        // 'c' référence un objet de type CompteEpargne, qui n'est pas un CompteCourant
        // On ne peut pas forcer un type vers un type incompatible
	}
	

}
