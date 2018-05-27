package com.yeko.bank.service;

import com.yeko.bank.model.entity.Client;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {
    boolean add(Client client);
    Client getById(int id);
    List<Client> getAll();
}
