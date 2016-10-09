package org.aleejo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Employe implements Serializable {

	public Employe(String nomEmpl) {
		super();
		this.nomEmpl = nomEmpl;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmp;
	private String nomEmpl;
	
	@ManyToOne
	@JoinColumn(name="code_emp_sup")
	private Employe emploSup;
	
	@ManyToMany
	@JoinTable(name="EMP_GR")
	private Collection<Groupe> groupes;

	public Long getCodeEmp() {
		return codeEmp;
	}

	public void setCodeEmp(Long codeEmp) {
		this.codeEmp = codeEmp;
	}

	public String getNomEmpl() {
		return nomEmpl;
	}

	public void setNomEmpl(String nomEmpl) {
		this.nomEmpl = nomEmpl;
	}

	@JsonIgnore // ne pas reenvoyer/montrer avec les details et relations
	public Employe getEmploSup() {
		return emploSup;
	}
	@JsonSetter
	public void setEmploSup(Employe emploSup) {
		this.emploSup = emploSup;
	}

	@JsonIgnore
	public Collection<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}
	
	
	
}
