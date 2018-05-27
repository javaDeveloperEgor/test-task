package com.yeko.bank.model.repository.mapper;

import com.yeko.bank.model.entity.Client;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ClientMapper implements RowMapper<Client> {

  @Override
  public Client mapRow(ResultSet resultSet, int i) throws SQLException {
    Client client = new Client();
    client.setId(resultSet.getInt("client_id"));
    client.setName(resultSet.getString("name"));
    client.setAddress(resultSet.getString("address"));
    client.setAge(resultSet.getInt("age"));
    return client;
  }
}
