package ru.akchi724.finance;

public enum Period {
    ONCE_A_YEAR(12),
    ONCE_A_MONTH(1),
    ONCE_A_DAY(31);
    public double factor;

    Period(double factor) {
        this.factor = factor;
    }
}
