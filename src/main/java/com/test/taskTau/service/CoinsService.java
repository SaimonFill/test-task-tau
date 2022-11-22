package com.test.taskTau.service;

import com.test.taskTau.enums.QuantityCoinsEnum;
import org.springframework.stereotype.Service;

@Service
public class CoinsService {

    public void changeNumberOfCoins(QuantityCoinsEnum typeCoins, int newQuantity) {
        switch (typeCoins) {
            case ONE_CENT -> QuantityCoinsEnum.ONE_CENT.quantity = newQuantity;
            case FIVE_CENTS -> QuantityCoinsEnum.FIVE_CENTS.quantity = newQuantity;
            case TEN_CENTS -> QuantityCoinsEnum.TEN_CENTS.quantity = newQuantity;
            case TWENTY_FIVE_CENTS -> QuantityCoinsEnum.TWENTY_FIVE_CENTS.quantity = newQuantity;
        }
    }
}
