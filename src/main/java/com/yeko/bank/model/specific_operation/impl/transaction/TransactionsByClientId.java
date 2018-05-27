package com.yeko.bank.model.specific_operation.impl.transaction;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class TransactionsByClientId implements ToSQL {

    private int id;

    public TransactionsByClientId(int id) {
        this.id = id;
    }

    @Override
    public String toSQLQuery() {
        return String.format(
                QueryStore.GET_TRANSACTIONS_BY_CLIENT_ID,
                id
        );
    }
}
