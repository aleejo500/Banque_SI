package org.aleejo.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.aleejo.entities.Compte;
import org.aleejo.metier.CompteMetier;
import org.aleejo.metier.OperationsMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService
public class BanqueSoapService {
	
	@Autowired
	private CompteMetier compteMetier;
	@Autowired
	private OperationsMetier operationsMetier;
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") String code) {
		return compteMetier.getCompte(code);
	}
	@WebMethod
	public Boolean Verser(@WebParam(name="codeCompte")String codeCompte,
						  @WebParam(name="mnt") double mnt, 
						  @WebParam(name="codeEmp")Long codeEmp) {
		return operationsMetier.Verser(codeCompte, mnt, codeEmp);
	}
	@WebMethod
	public Boolean Retire(@WebParam(name="codeCompte")String codeCompte,
			  			  @WebParam(name="mnt") double mnt, 
			  			  @WebParam(name="codeEmp")Long codeEmp) {
		return operationsMetier.Retire(codeCompte, mnt, codeEmp);
	}
	@WebMethod
	public Boolean Virment(@WebParam(name="codeCompte")String codeCompte,
							@WebParam(name="codeCompte2")String codeCompte2,
							@WebParam(name="mnt") double mnt, 
							@WebParam(name="codeEmp")Long codeEmp) {
		return operationsMetier.Virment(codeCompte, codeCompte2, mnt, codeEmp);
	}
	
}
