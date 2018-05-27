package com.yeko.bank.service.impl;

import com.yeko.bank.model.entity.Client;
import com.yeko.bank.model.repository.impl.ClientDAOImpl;
import com.yeko.bank.service.ClientService;
import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.specific_operation.impl.client.AllClients;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAOImpl clientDAO;

    @Override
    public boolean add(Client client) {
        return clientDAO.add(client);
    }

    @Override
    public Client getById(int id) {
        return clientDAO.getById(id);
    }

    @Override
    public List<Client> getAll() {
        ToSQL allClientsQuery = new AllClients();
        return clientDAO.query(allClientsQuery);
    }
}
