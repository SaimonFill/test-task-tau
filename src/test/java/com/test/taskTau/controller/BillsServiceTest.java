package com.test.taskTau.controller;

import com.test.taskTau.TaskTauApplicationTests;
import com.test.taskTau.exception.NoMoreCoinsException;
import com.test.taskTau.service.BillsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

class BillsServiceTest extends TaskTauApplicationTests {

    @Autowired
    private BillsService service;

    @Test
    @DisplayName("should return success when receiving an amount of bills to convert into coins")
    void shoudReturnSucessWhenReceiveBills() throws Exception {

        final BigDecimal bills = new BigDecimal(10);
        int expected = 40;

        int response = service.findMiniumCoins(bills);

        Assertions.assertEquals(expected, response);
    }

    @Test
    @DisplayName("should return exception when you don't have enough coins")
    void shoudReturnExceptionWhenDontHaveEnoughCoins() throws Exception {

        final BigDecimal bills = new BigDecimal(50);
        final String messageExpected = "The machine no longer has enough coins to exchange.";
        String messageReturned = "";

        try {
            service.findMiniumCoins(bills);
        } catch (NoMoreCoinsException e) {
            messageReturned = e.getMessage();
        }

        Assertions.assertEquals(messageExpected, messageReturned);
    }
}
