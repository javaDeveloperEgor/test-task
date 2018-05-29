package com.yeko.bank.model.repository.mapper;

import com.yeko.bank.model.entity.Transaction;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TransactionMapper implements RowMapper<Transaction> {

  @Override
  public Transaction mapRow(ResultSet resultSet, int i) throws SQLException {
    Transaction transaction = new Transaction();
    transaction.setId(resultSet.getLong("transaction_id"));
    transaction.setSenderAcc(resultSet.getInt("sender_acc_id"));
    transaction.setGetterAcc(resultSet.getInt("getter_acc_id"));
    transaction.setAmount(resultSet.getDouble("amount"));
    transaction.setAddDate(resultSet.getString("add_date_time"));
    return transaction;
  }
}
