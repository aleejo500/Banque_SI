package org.aleejo.metier;

import java.util.List;

import org.aleejo.entities.Client;

public interface ClientMetier {
	
	public Client saveClient(Client c);
	public List<Client> ListeClients();
}
