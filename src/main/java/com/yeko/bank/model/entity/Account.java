package com.yeko.bank.model.entity;

public class Account {

    int id;
    int client;
    double cash_sum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public double getSum() {
        return cash_sum;
    }

    public void setSum(double cash_sum) {
        this.cash_sum = cash_sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        if (id != account.id) {
            return false;
        }
        if (client != account.client) {
            return false;
        }
        return Double.compare(account.cash_sum, cash_sum) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + client;
        temp = Double.doubleToLongBits(cash_sum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
