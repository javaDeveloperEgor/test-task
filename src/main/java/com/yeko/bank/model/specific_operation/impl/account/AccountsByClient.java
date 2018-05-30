package com.yeko.bank.model.specific_operation.impl.account;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class AccountsByClient implements ToSQL {

    private int clientId;

    public AccountsByClient(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toSQLQuery() {
        return String.format(
            QueryStore.GET_ACCOUNTS_BY_CLIENT,
            clientId);
    }
}
