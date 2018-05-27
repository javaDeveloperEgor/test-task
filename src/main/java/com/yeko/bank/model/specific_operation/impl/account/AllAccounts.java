package com.yeko.bank.model.specific_operation.impl.account;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class AllAccounts implements ToSQL {

    @Override
    public String toSQLQuery() {
        return QueryStore.GET_ALL_ACCOUNTS;
    }
}
