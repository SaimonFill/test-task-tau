package com.test.taskTau.enums;

import java.math.BigDecimal;

public enum QuantityCoinsEnum {

    ONE_CENT(0.01, 100),
    FIVE_CENTS(0.05, 100),
    TEN_CENTS(0.10, 100),
    TWENTY_FIVE_CENTS(0.25, 100);

    public final BigDecimal value;
    public int quantity;

    QuantityCoinsEnum(double value, int quantity) {
        this.value = BigDecimal.valueOf(value);
        this.quantity = quantity;
    }
}
