package ru.akchi724.finance;

public class FinanceEntity {
    private double sum;
    private String name;
    private Period period;

    public FinanceEntity(String name, double sum, Period period) {
        this.sum = sum;
        this.name = name;
        this.period = period;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getPeriod() {
        return period;
    }
}
