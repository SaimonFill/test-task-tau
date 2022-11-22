package com.test.taskTau.service;

import com.test.taskTau.enums.QuantityCoinsEnum;
import com.test.taskTau.exception.NoMoreCoinsException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BillsService {

    public int findMiniumCoins(BigDecimal bills) throws Exception {
        int coinsCount = 0;
        BigDecimal diff = bills;
        QuantityCoinsEnum[] quantityCoins = QuantityCoinsEnum.values();

        for (int i = quantityCoins.length -1; i >= 0; i--) {
            while (diff.compareTo(quantityCoins[i].value) >= 0 && quantityCoins[i].quantity >= 1) {
                diff = diff.subtract(quantityCoins[i].value).setScale(2);
                quantityCoins[i].quantity--;
                coinsCount++;
            }
        }
        if (diff.compareTo(BigDecimal.ZERO) > 0) {
            throw new NoMoreCoinsException();
        }
        return coinsCount;
    }
}
