package com.yeko.bank.model.entity;

public class Transaction {

    private long id;
    private int senderAcc;
    private int getterAcc;
    private double amount;
    private String add_date_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSenderAcc() {
        return senderAcc;
    }

    public void setSenderAcc(int senderAcc) {
        this.senderAcc = senderAcc;
    }

    public int getGetterAcc() {
        return getterAcc;
    }

    public void setGetterAcc(int getterAcc) {
        this.getterAcc = getterAcc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAddDate() {
        return add_date_time;
    }

    public void setAddDate(String add_date_time) {
        this.add_date_time = add_date_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Transaction that = (Transaction) o;

        if (id != that.id) {
            return false;
        }
        if (senderAcc != that.senderAcc) {
            return false;
        }
        if (getterAcc != that.getterAcc) {
            return false;
        }
        if (Double.compare(that.amount, amount) != 0) {
            return false;
        }
        return add_date_time.equals(that.add_date_time);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + senderAcc;
        result = 31 * result + getterAcc;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + add_date_time.hashCode();
        return result;
    }
}
