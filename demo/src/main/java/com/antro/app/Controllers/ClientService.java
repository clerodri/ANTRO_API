package com.antro.app.Controllers;

import com.antro.app.Models.Cliente;
import com.antro.app.Models.Gps;
import com.antro.app.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Cliente addClient(Cliente user){
        return clientRepository.insert(user);
    }
}
