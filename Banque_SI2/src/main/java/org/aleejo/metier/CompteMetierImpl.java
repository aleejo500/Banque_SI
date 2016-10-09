package org.aleejo.metier;

import java.util.Date;

import org.aleejo.dao.CompteRepository;
import org.aleejo.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements CompteMetier {

	@Autowired
	private CompteRepository compteRep;
	
	@Override
	public Compte saveCompte(Compte cp) {
		// TODO Auto-generated method stub
		cp.setDateCreation(new Date());
		return compteRep.save(cp);
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		return compteRep.findOne(code);
		//return compteRep.getOne(code);
	}

	
	
}
