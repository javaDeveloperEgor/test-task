package com.yeko.bank.service.impl;

import com.yeko.bank.model.entity.Account;
import com.yeko.bank.model.repository.impl.AccountDAOImpl;
import com.yeko.bank.service.AccountService;
import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.specific_operation.impl.account.AccountsByClient;
import com.yeko.bank.model.specific_operation.impl.account.AllAccounts;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAOImpl accountDAO;

    @Override
    public boolean add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public Account getById(int id) {
        return accountDAO.getById(id);
    }

    @Override
    public List<Account> getAll() {
        ToSQL getAllQuery = new AllAccounts();
        return accountDAO.query(getAllQuery);
    }

    @Override
    public List<Account> getAllByClient(int clientId) {
        ToSQL allByClientQuery = new AccountsByClient(clientId);
        return accountDAO.query(allByClientQuery);
    }
}
