package com.test.taskTau.controller;

import com.test.taskTau.TaskTauApplicationTests;
import com.test.taskTau.enums.QuantityCoinsEnum;
import com.test.taskTau.service.CoinsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CoinsServiceTest extends TaskTauApplicationTests {

    @Autowired
    private CoinsService service;

    @Test
    @DisplayName("should update coin value")
    void shoudUpdateCoinValue() {

        QuantityCoinsEnum[] quantityCoins = QuantityCoinsEnum.values();

        service.changeNumberOfCoins(QuantityCoinsEnum.ONE_CENT, 10);

        Assertions.assertEquals(quantityCoins[0].quantity, 10);
    }
}
