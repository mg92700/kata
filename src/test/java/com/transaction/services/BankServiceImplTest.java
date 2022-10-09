package com.transaction.services;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class BankServiceImplTest {

    private ServiceBankImpl salariesServiceImpl;

    @Before
    public void setUp() {
        salariesServiceImpl = new ServiceBankImpl();
    }

    @Test
    public void depositeMoney() throws Exception {
        List<String> lstTransaction = new ArrayList<>();
        double val = salariesServiceImpl.depositeMoney(10, 100, lstTransaction);
        Assert.assertEquals(110.00, 110.00, 0.0);
    }


    @Test
    public void withdrawalMoney() throws Exception {
        List<String> lstTransaction = new ArrayList<>();
        double val = salariesServiceImpl.withdrawalMoney(10, 100, lstTransaction);
        Assert.assertEquals(90.00, 90.00, 0.0);
    }

    @Test
    public void withdrawalMoneyWithError() {
        List<String> lstTransaction = new ArrayList<>();
        try {
            double val = salariesServiceImpl.withdrawalMoney(10, 0, lstTransaction);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "your balance is insufficient");
        }
    }

    @Test
    public void testHistorique() {
        List<String> lstTransaction = new ArrayList<>();
        Double account =100.00;
        try {
            double val1 = salariesServiceImpl.withdrawalMoney(10, account, lstTransaction);
            double val2 = salariesServiceImpl.withdrawalMoney(10, val1, lstTransaction);
            double val3 = salariesServiceImpl.withdrawalMoney(10, val2, lstTransaction);
            Assert.assertEquals(3,lstTransaction.size());
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "your balance is insufficient");
        }
    }
}


