package org.aleejo.services;

import org.aleejo.metier.OperationsMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationRestService {
	@Autowired
	private OperationsMetier operationMetier;

	@RequestMapping(value="/versement",method=RequestMethod.PUT)
	public Boolean Verser(@RequestParam String codeCompte, 
			@RequestParam double mnt, @RequestParam Long codeEmp) {
		return operationMetier.Verser(codeCompte, mnt, codeEmp);
	}

	@RequestMapping(value="/retrait",method=RequestMethod.PUT)
	public Boolean Retire(@RequestParam String codeCompte, 
			@RequestParam double mnt, @RequestParam Long codeEmp) {
		return operationMetier.Retire(codeCompte, mnt, codeEmp);
	}
	
	@RequestMapping(value="/virement",method=RequestMethod.PUT)
	public Boolean Virment(@RequestParam String codeCompte, 
			@RequestParam String codeCompte2, 
			@RequestParam double mnt,
			@RequestParam Long codeEmp) {
		return operationMetier.Virment(codeCompte, codeCompte2, mnt, codeEmp);
	}
	
	
	

}
