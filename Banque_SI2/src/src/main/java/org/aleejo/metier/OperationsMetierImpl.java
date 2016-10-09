package org.aleejo.metier;

import java.util.Date;

import org.aleejo.dao.CompteRepository;
import org.aleejo.dao.EmployeRepository;
import org.aleejo.dao.OperationRepository;
import org.aleejo.entities.Compte;
import org.aleejo.entities.Employe;
import org.aleejo.entities.Operation;
import org.aleejo.entities.Versement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OperationsMetierImpl implements OperationsMetier{

	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	@Transactional
	public Boolean Verser(String codeCompte, double mnt, Long codeEmp) {

		Compte cp=compteRepository.findOne(codeCompte);
		Employe e=employeRepository.findOne(codeEmp);
		Operation o=new Versement();
		o.setDateOper(new Date());
		o.setMontant(mnt);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()+mnt);
		return true;
	}
	
	@Override
	@Transactional
	public Boolean Retire(String codeCompte, double mnt, Long codeEmp) {
		Compte cp=compteRepository.findOne(codeCompte);
		
		if(cp.getSolde()<mnt) throw new RuntimeException("pas de solde");
		Employe e=employeRepository.findOne(codeEmp);
		Operation o=new Versement();
		o.setDateOper(new Date());
		o.setMontant(mnt);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()-mnt);
		return true;
		
	}

	@Override
	@Transactional
	public Boolean Virment(String codeCompte, String codeCompte2, double mnt,
			Long codeEmp) {

		Retire(codeCompte, mnt, codeEmp);
		Verser(codeCompte2, mnt, codeEmp);
		return true;
		
	}
	
	

}
