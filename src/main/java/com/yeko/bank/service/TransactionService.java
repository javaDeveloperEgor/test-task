package com.yeko.bank.service;

import com.yeko.bank.model.entity.Transaction;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    boolean add(Transaction transaction);
    Transaction getById(int id);
    List<Transaction> getAll();
    List<Transaction> getAllByClientId(int client);
    List<Transaction> getAllByClientName(String name);
    List<Transaction> getAllByPeriodBetween(String start, String end);
    List<Transaction> getAllByAccountId(int account);
}
