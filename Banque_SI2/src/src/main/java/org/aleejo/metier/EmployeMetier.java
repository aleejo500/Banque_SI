package org.aleejo.metier;

import java.util.List;

import org.aleejo.entities.Employe;

public interface EmployeMetier {
	
	public Employe employeSave(Employe e);
	
	public List<Employe> listEmpl();

}
