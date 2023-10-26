package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private Village village;
	
	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur, Village village) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
		this.village = village;
	}
	

	//TODO a completer
	public boolean isVendeur(String nomVendeur) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		return etal != null;
	}

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer
		String[] donneesEtal = null;
		String[] villagois;
		String nom;
		int nbEtal;
		
		
		nom = village.getNom();
		villagois = village.donnerVillageois();
		nbEtal = village.donnerNbEtal();
		
		// A modifier
		
		
		return donneesEtal;
	}
	

}
