package ru.akchi724.finance;

import java.util.List;

public class Report {
    private List<FinanceCategory> categories;

    public Report(List<FinanceCategory> categories) {
        this.categories = categories;
    }

    public void getReport() {
        double totalSum = 0;
        for (FinanceCategory financeCategory : categories) {
            double sum = 0;
            for (FinanceEntity financeEntity : financeCategory.getSums()) {
                sum += financeEntity.getSum()/financeEntity.getPeriod().factor;
            }
            System.out.println(financeCategory.getCategoryName() + " в месяц = " + sum);
            if (financeCategory.isSpending()){
                totalSum-=sum;
            } else {
                totalSum+=sum;
            }
        }
        System.out.println("В плюсе на "+totalSum);
        System.out.println("Свободных денег: "+totalSum*12);
    }
}
