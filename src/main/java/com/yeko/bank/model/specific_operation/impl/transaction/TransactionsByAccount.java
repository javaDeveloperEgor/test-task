package com.yeko.bank.model.specific_operation.impl.transaction;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class TransactionsByAccount implements ToSQL {

    private int account;

    public TransactionsByAccount(int account) {
        this.account = account;
    }

    @Override
    public String toSQLQuery() {
        return String.format(
                QueryStore.GET_TRANSACTIONS_BY_ACCOUNT,
                account
        );
    }
}
