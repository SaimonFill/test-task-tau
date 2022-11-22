package com.test.taskTau.enums;

public enum QuantityCoinsEnum {

    ONE_CENT(0.01, 100),
    FIVE_CENTS(0.05, 100),
    TEN_CENTS(0.10, 100),
    TWENTY_FIVE_CENTS(0.25, 100);

    public final double value;
    public int quantity;

    QuantityCoinsEnum(double value, int quantity) {
        this.value = value;
        this.quantity = quantity;
    }
}
