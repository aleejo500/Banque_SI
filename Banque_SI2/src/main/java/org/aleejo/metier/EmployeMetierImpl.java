package org.aleejo.metier;

import java.util.List;

import org.aleejo.dao.EmployeRepository;
import org.aleejo.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeMetierImpl implements EmployeMetier{

	@Autowired
	private EmployeRepository empRep;
	@Override
	public Employe employeSave(Employe e) {
		// TODO Auto-generated method stub
		return empRep.save(e);
	}

	@Override
	public List<Employe> listEmpl() {
		// TODO Auto-generated method stub
		return empRep.findAll();
	}

	
	
}
