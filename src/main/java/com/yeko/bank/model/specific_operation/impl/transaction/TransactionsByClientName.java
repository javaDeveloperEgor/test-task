package com.yeko.bank.model.specific_operation.impl.transaction;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class TransactionsByClientName implements ToSQL {

    private String name;

    public TransactionsByClientName(String name) {
        this.name = name;
    }

    @Override
    public String toSQLQuery() {
        return String.format(
                QueryStore.GET_TRANSACTIONS_BY_CLIENT_NAME,
                name
        );
    }
}
