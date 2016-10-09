package org.aleejo.dao;

import org.aleejo.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeRepository extends JpaRepository<Employe,Long> {

}
