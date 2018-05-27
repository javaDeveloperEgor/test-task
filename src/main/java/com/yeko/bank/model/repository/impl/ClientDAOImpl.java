package com.yeko.bank.model.repository.impl;

import com.yeko.bank.model.entity.Client;
import com.yeko.bank.model.repository.AbstractDAO;
import com.yeko.bank.model.repository.mapper.ClientMapper;
import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAOImpl implements AbstractDAO<Client> {

  @Autowired
  JdbcTemplate template;

  public boolean add(Client item) {
    String query = QueryStore.INSERT_CLIENT;
    int file = template.update(query,
        item.getName(),
        item.getAddress(),
        item.getAge()
    );
    return file != 0;
  }

  public boolean update(Client item) {
    String query = QueryStore.UPDATE_CLIENT;
    int file = template.update(query,
        item.getName(),
        item.getAddress(),
        item.getAge(),
        item.getId()
    );
    return file != 0;
  }

  public boolean remove(Client item) {
    String query = QueryStore.DELETE_CLIENT;
    int file = template.update(query,
        item.getId()
    );
    return file != 0;
  }

  @Override
  public List<Client> query(ToSQL toSQL) {
    return template.query(toSQL.toSQLQuery(), new ClientMapper());
  }

  @Override
  public Client getById(int client_id) {
    String query = QueryStore.GET_CLIENT_BY_ID;
    return template.queryForObject(query, new Object[]{client_id}, new ClientMapper());
  }
}
