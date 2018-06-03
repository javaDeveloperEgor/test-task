package com.yeko.bank.model.store_queries;

public class QueryStore {

  public static final String GET_ALL_CLIENTS = "SELECT * FROM CLIENTS ";
  public static final String INSERT_CLIENT = " INSERT INTO CLIENTS(name, address, age) values(?,?,?) ";
  public static final String UPDATE_CLIENT = " UPDATE CLIENTS SET name = ?, address = ?, age=? WHERE client_id = ? ";
  public static final String DELETE_CLIENT = " DELETE FROM CLIENTS WHERE client_id = ? ";
  public static final String GET_CLIENT_BY_ID = " SELECT * FROM CLIENTS WHERE client_id = ? ";

  public static final String INSERT_ACCOUNT = " INSERT INTO ACCOUNTS(client_id, cash_sum) values(?,?) ";
  public static final String UPDATE_ACCOUNT =
      " UPDATE ACCOUNTS SET client_id = ?, cash_sum = ? " +
          " WHERE account_id = ? ";
  public static final String DELETE_ACCOUNT = " DELETE FROM ACCOUNTS WHERE account_id = ? ";
  public static final String GET_ALL_ACCOUNTS = " SELECT * FROM ACCOUNTS";
  public static final String GET_ACCOUNT_BY_ID = " SELECT * FROM ACCOUNTS WHERE account_id = ? ";
  public static final String GET_ACCOUNTS_BY_CLIENT = "SELECT * FROM ACCOUNTS WHERE client_id = ?";

  public static final String INSERT_TRANSACTION = "INSERT INTO TRANSACTIONS(sender_acc_id, getter_acc_id, amount, add_date_time) values(?,?,?,now()) ";
  public static final String UPDATE_TRANSACTION =
      " UPDATE TRANSACTIONS SET sender_acc_id=?, getter_acc_id = ?, amount=?, add_date_time = now() "
          +
          " WHERE transaction_id = ? ";
  public static final String DELETE_TRANSACTION = "DELETE FROM TRANSACTIONS WHERE transaction_id=? ";
  public static final String GET_ALL_TRANSACTIONS =
      " SELECT transaction_id, sender_acc_id, getter_acc_id, amount, " +
          " DATE_FORMAT(add_date_time, '%Y-%m-%d %T') add_date_time FROM TRANSACTIONS ";
  public static final String GET_TRANSACTION_BY_ID =
      " SELECT transaction_id, sender_acc_id, getter_acc_id, amount, " +
          " DATE_FORMAT(add_date_time, '%Y-%m-%d %T') add_date_time " +
          " FROM TRANSACTIONS WHERE transaction_id = ?";
  public static final String GET_TRANSACTIONS_BY_ACCOUNT =
      " SELECT transaction_id, sender_acc_id, getter_acc_id, amount, " +
          " DATE_FORMAT(add_date_time, '%Y-%m-%d %T') add_date FROM TRANSACTIONS "
          +
          " WHERE sender_acc_id = ? OR getter_acc_id = ? ";
  public static final String GET_TRANSACTIONS_BY_CLIENT_ID =
      "SELECT TRANSACTIONS.transaction_id, TRANSACTIONS.sender_acc_id, TRANSACTIONS.getter_acc_id, "
          +
          "TRANSACTIONS.amount, DATE_FORMAT(TRANSACTIONS.add_date_time, '%Y-%m-%d %T') add_date_time "
          +
          "FROM TRANSACTIONS, ACCOUNTS " +
          "WHERE ACCOUNTS.client_id = ''%1$s'' " +
          "AND ACCOUNTS.account_id=TRANSACTIONS.sender_acc_id OR ACCOUNTS.account_is=TRANSACTIONS.getter_acc_id";
  public static final String GET_TRANSACTIONS_BY_CLIENT_NAME =
      "SELECT TRANSACTIONS.transaction_id, TRANSACTIONS.sender_acc_id, TRANSACTIONS.getter_acc_id, "
          +
          "TRANSACTIONS.amount, DATE_FORMAT(TRANSACTIONS.add_date_time, '%Y-%m-%d %T') add_date_time "
          +
          "FROM TRANSACTIONS, ACCOUNTS, CLIENTS " +
          "WHERE CLIENTS.name = ''%1$s'' " +
          "AND CLIENTS.client_id=ACCOUNTS.client_id " +
          "AND ACCOUNTS.account_id=TRANSACTIONS.sender_acc_id OR ACCOUNTS.account_is=TRANSACTIONS.getter_acc_id";
  public static final String GET_TRANSACTIONS_BY_PERIOD =
      "SELECT transaction_id, sender_acc_id, getter_acc_id, amount, DATE_FORMAT(add_date_time, '%Y-%m-%d %T') add_date_time "
          +
          "FROM TRANSACTIONS WHERE add_date_time BETWEEN ''%1$s'' AND ''%2$s'' ";
}
