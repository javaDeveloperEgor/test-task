package com.yeko.bank.model.specific_operation.impl.client;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class AllClients implements ToSQL {

    @Override
    public String toSQLQuery() {
        return QueryStore.GET_ALL_CLIENTS;
    }
}
