package org.aleejo.metier;


public interface OperationsMetier {
	public Boolean Verser(String codeCompte, double mnt, Long codeEmp);
	public Boolean Retire(String codeCompte, double mnt, Long codeEmp);
	public Boolean Virment(String codeCompte,String codeCompte2, double mnt, Long codeEmp);
}
