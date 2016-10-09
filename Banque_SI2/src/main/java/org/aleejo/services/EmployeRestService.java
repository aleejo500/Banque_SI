package org.aleejo.services;

import java.util.List;

import org.aleejo.entities.Employe;
import org.aleejo.metier.EmployeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeRestService {

	@Autowired
	private EmployeMetier employeMetier;

	@RequestMapping(value="/employe", method=RequestMethod.POST)
	public Employe employeSave(@RequestBody Employe e) {
		return employeMetier.employeSave(e);
	}
	@RequestMapping(value="/employe", method=RequestMethod.GET)
	public List<Employe> listEmpl() {
		return employeMetier.listEmpl();
	}
	
	
}
