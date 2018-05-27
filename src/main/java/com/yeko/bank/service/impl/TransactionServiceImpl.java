package com.yeko.bank.service.impl;

import com.yeko.bank.model.entity.Account;
import com.yeko.bank.model.entity.Transaction;
import com.yeko.bank.model.repository.impl.AccountDAOImpl;
import com.yeko.bank.model.repository.impl.TransactionDAOImpl;
import com.yeko.bank.service.TransactionService;
import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.specific_operation.impl.transaction.AllTransactions;
import com.yeko.bank.model.specific_operation.impl.transaction.TransactionsByAccount;
import com.yeko.bank.model.specific_operation.impl.transaction.TransactionsByClientId;
import com.yeko.bank.model.specific_operation.impl.transaction.TransactionsByClientName;
import com.yeko.bank.model.specific_operation.impl.transaction.TransactionsByPeriodBetween;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private AccountDAOImpl accountDAO;

    @Autowired
    private TransactionDAOImpl transactionDAO;

    @Override
    @Transactional
    public boolean add(Transaction transaction) {
        double amountNewTr = transaction.getAmount();
        Account sender = accountDAO.getById(transaction.getSenderAcc());
        Account getter = accountDAO.getById(transaction.getGetterAcc());
        sender.setSum(sender.getSum() - amountNewTr);
        getter.setSum(getter.getSum() + amountNewTr);
        accountDAO.update(sender);
        accountDAO.update(getter);
        return transactionDAO.add(transaction);
    }

    @Override
    public Transaction getById(int id) {
        return transactionDAO.getById(id);
    }

    @Override
    public List<Transaction> getAll() {
        ToSQL allTransactionsQuery = new AllTransactions();
        return transactionDAO.query(allTransactionsQuery);
    }

    @Override
    public List<Transaction> getAllByAccountId(int account) {
        ToSQL allByAccountIdQuery = new TransactionsByAccount(account);
        return transactionDAO.query(allByAccountIdQuery);
    }

    @Override
    public List<Transaction> getAllByClientId(int client) {
        ToSQL allByClientId = new TransactionsByClientId(client);
        return transactionDAO.query(allByClientId);
    }

    @Override
    public List<Transaction> getAllByClientName(String name) {
        ToSQL allByClientName = new TransactionsByClientName(name);
        return transactionDAO.query(allByClientName);
    }

    @Override
    public List<Transaction> getAllByPeriodBetween(String start, String end) {
        ToSQL allByPeriod = new TransactionsByPeriodBetween(start, end);
        return transactionDAO.query(allByPeriod);
    }

}
