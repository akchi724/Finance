package ru.akchi724.finance;

import ru.akchi724.finance.FinanceEntity;

import java.util.List;

public class FinanceCategory {
    private String categoryName;
    List<FinanceEntity> sums;
    private boolean isSpending;

    public FinanceCategory(String categoryName, List<FinanceEntity> sums, boolean isSpending) {
        this.categoryName = categoryName;
        this.sums = sums;
        this.isSpending = isSpending;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<FinanceEntity> getSums() {
        return sums;
    }

    public void setSums(List<FinanceEntity> sums) {
        this.sums = sums;
    }

    public boolean isSpending() {
        return isSpending;
    }

    public void setSpending(boolean spending) {
        isSpending = spending;
    }

}
