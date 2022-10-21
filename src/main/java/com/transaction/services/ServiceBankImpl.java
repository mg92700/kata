package com.transaction.services;


import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServiceBankImpl implements ServiceBank {

    @Override
    public double depositeMoney(double value, double sum, List<String> getTransactions) {
        Double sumTotal = value + sum;
        getTransactions.add("you added " + value + " your balance is " + sumTotal + " to " + LocalDateTime.now());
        return sumTotal;
    }

    @Override
    public double withdrawalMoney(double value, double sum, List<String> getTransactions) throws Exception {
        Double sumTotal = Double.valueOf(0);
        if (sum > value) {
            sumTotal = sum - value;
            getTransactions.add("you have withdrawn " + value + " your balance is " + sumTotal + " to " + LocalDateTime.now());
            return sumTotal;
        } else {
            throw new Exception("your balance is insufficient");
        }
    }

    @Override
    public StringBuilder historiqueTransaction(List<String> getTransactions) {
        StringBuilder sb = new StringBuilder();
        for (String s : getTransactions) {
            sb.append(s);
        }
        return sb;
    }
}
