package com.yeko.bank.model.repository.impl;

import com.yeko.bank.model.entity.Transaction;
import com.yeko.bank.model.repository.AbstractDAO;
import com.yeko.bank.model.repository.mapper.TransactionMapper;
import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDAOImpl implements AbstractDAO<Transaction> {

  @Autowired
  private JdbcTemplate template;

  public boolean add(Transaction item) {
    String query = QueryStore.INSERT_TRANSACTION;
    int file = template.update(query,
        item.getSenderAcc(),
        item.getGetterAcc(),
        item.getAmount()
    );
    return file != 0;
  }

  public boolean update(Transaction item) {
    String query = QueryStore.UPDATE_TRANSACTION;
    int file = template.update(query,
        item.getSenderAcc(),
        item.getGetterAcc(),
        item.getAmount(),
        item.getId()
    );
    return file != 0;
  }

  public boolean remove(Transaction item) {
    String query = QueryStore.DELETE_TRANSACTION;
    int file = template.update(query,
        item.getId()
    );
    return file != 0;
  }

  @Override
  public List query(ToSQL toSQL) {
    return template.query(toSQL.toSQLQuery(), new TransactionMapper());
  }

  @Override
  public Transaction getById(int transaction_id) {
    String query = QueryStore.GET_TRANSACTION_BY_ID;
    return template.queryForObject(query, new Object[]{transaction_id}, new TransactionMapper());
  }
}
