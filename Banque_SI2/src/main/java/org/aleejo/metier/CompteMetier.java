package org.aleejo.metier;

import org.aleejo.entities.Compte;

public interface CompteMetier {
	
	public Compte saveCompte(Compte cp);
	
	public Compte getCompte(String code);

}
