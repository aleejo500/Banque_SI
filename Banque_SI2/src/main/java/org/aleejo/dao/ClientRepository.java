package org.aleejo.dao;

import org.aleejo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClientRepository extends JpaRepository<Client,Long> {

}
