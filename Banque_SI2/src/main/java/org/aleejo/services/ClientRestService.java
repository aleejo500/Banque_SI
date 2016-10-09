package org.aleejo.services;

import java.util.List;

import org.aleejo.entities.Client;
import org.aleejo.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestService {

	@Autowired
	private ClientMetier clientMetier;

	@RequestMapping(value="/client",method=RequestMethod.POST) //json
	//@ResponseBody //implicite
	public Client saveClient(@RequestBody Client c) {  
		return clientMetier.saveClient(c);
	}
	@RequestMapping(value="/client",method=RequestMethod.GET)
	public List<Client> ListeClients() {
		return clientMetier.ListeClients();
	}
}
