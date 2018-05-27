package com.yeko.bank.model.repository.mapper;

import com.yeko.bank.model.entity.Account;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AccountMapper implements RowMapper<Account> {

  @Override
  public Account mapRow(ResultSet resultSet, int i) throws SQLException {
    Account account = new Account();
    account.setId(resultSet.getInt("account_id"));
    account.setClient(resultSet.getInt("client_id"));
    account.setSum(resultSet.getInt("sum"));
    return account;
  }
}
