package com.yeko.bank.model.specific_operation.impl.account;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class AccountsByClient implements ToSQL {

    private int client;

    public AccountsByClient(int client) {
        this.client = client;
    }

    @Override
    public String toSQLQuery() {
        String query = QueryStore.GET_ACCOUNTS_BY_CLIENT + client;
        return query;
    }
}
