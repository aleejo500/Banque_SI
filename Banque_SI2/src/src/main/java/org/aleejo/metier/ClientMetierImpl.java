package org.aleejo.metier;

import java.util.List;

import org.aleejo.dao.ClientRepository;
import org.aleejo.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // couche metier  or  component
public class ClientMetierImpl implements ClientMetier {

	@Autowired
	private ClientRepository ClientRep;
	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return ClientRep.save(c);
	}

	@Override
	public List<Client> ListeClients() {
		// TODO Auto-generated method stub
		return ClientRep.findAll();
	}

	
	
}
