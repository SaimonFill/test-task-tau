package com.test.taskTau.service;

import com.test.taskTau.enums.QuantityCoinsEnum;
import com.test.taskTau.exception.NoMoreCoinsException;
import org.springframework.stereotype.Service;

@Service
public class BillsService {

    public int findMiniumCoins(int bills) throws Exception {
        int coinsCount = 0;
        double billsDouble = bills;
        QuantityCoinsEnum[] quantityCoins = QuantityCoinsEnum.values();

        for (int i = quantityCoins.length -1; i >= 0; i--) {
            while (billsDouble >= quantityCoins[i].value && quantityCoins[i].quantity >= 1) {
                billsDouble -= quantityCoins[i].value;
                quantityCoins[i].quantity--;
                coinsCount++;
            }
        }
        if (billsDouble !=  0.0) {
            throw new NoMoreCoinsException(billsDouble);
        }
        return coinsCount;
    }
}
