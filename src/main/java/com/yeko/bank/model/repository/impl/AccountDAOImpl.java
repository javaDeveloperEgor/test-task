package com.yeko.bank.model.repository.impl;

import com.yeko.bank.model.entity.Account;
import com.yeko.bank.model.repository.AbstractDAO;
import com.yeko.bank.model.repository.mapper.AccountMapper;
import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AbstractDAO<Account>{

  @Autowired
  JdbcTemplate template;

  public boolean add(Account item) {
    String query = QueryStore.INSERT_ACCOUNT;
    int file = template.update(query,
        item.getClient(),
        item.getSum()
    );
    return file != 0;
  }

  public boolean update(Account item) {
    String query = QueryStore.UPDATE_ACCOUNT;
    int file = template.update(query,
        item.getClient(),
        item.getSum(),
        item.getId()
    );
    return file != 0;
  }

  public boolean remove(Account item) {
    String query = QueryStore.DELETE_ACCOUNT;
    int file = template.update(query,
        item.getId()
    );
    return file != 0;
  }

  @Override
  public List<Account> query(ToSQL toSQL) {
    return template.query(toSQL.toSQLQuery(), new AccountMapper());
  }

  @Override
  public Account getById(int account_id) {
    String query = QueryStore.GET_ACCOUNT_BY_ID;
    return template.queryForObject(query, new Object[]{account_id}, new AccountMapper());
  }
}
