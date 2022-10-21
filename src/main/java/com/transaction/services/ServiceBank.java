package com.transaction.services;

import java.util.List;

public interface ServiceBank {

    public double depositeMoney(double value, double sum, List<String> getTransactions);
    public double withdrawalMoney(double value,double sum,List<String> getTransactions) throws Exception;
    public StringBuilder historiqueTransaction(List<String> getTransactions);

}

