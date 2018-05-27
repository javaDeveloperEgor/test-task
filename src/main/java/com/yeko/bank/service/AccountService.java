package com.yeko.bank.service;

import com.yeko.bank.model.entity.Account;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    boolean add(Account account);
    Account getById(int id);
    List<Account> getAll();
    List<Account> getAllByClient(int id);
}
