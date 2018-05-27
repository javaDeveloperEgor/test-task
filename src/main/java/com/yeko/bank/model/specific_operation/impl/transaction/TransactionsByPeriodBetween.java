package com.yeko.bank.model.specific_operation.impl.transaction;

import com.yeko.bank.model.specific_operation.ToSQL;
import com.yeko.bank.model.store_queries.QueryStore;

public class TransactionsByPeriodBetween implements ToSQL {
    private String start;
    private String end;

    public TransactionsByPeriodBetween(String start, String end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toSQLQuery() {
        return String.format(
                QueryStore.GET_TRANSACTIONS_BY_PERIOD,
                start, end
        );
    }
}
