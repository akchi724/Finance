package ru.akchi724.finance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FinanceEntity> standingPayment = new ArrayList<>();
        standingPayment.add(new FinanceEntity("Домашний интернет",850,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Квартплата",8000,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Мобильный интернет Мегафон",600,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Мобильный интернет tele2",250,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Метро",1000,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Бабушкин телефон",500,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Ютуб",200,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Стрижка",600,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Хоз траты",1000,Period.ONCE_A_MONTH));
        standingPayment.add(new FinanceEntity("Поездки домой",2000,Period.ONCE_A_MONTH));

        List<FinanceEntity> celebration = new ArrayList<>();
        celebration.add(new FinanceEntity("Дни рождения",37000,Period.ONCE_A_YEAR));
        celebration.add(new FinanceEntity("Новый год",10000,Period.ONCE_A_YEAR));
        celebration.add(new FinanceEntity("Мой день рождения",10000,Period.ONCE_A_YEAR));

        List<FinanceEntity> clothes = new ArrayList<>();
        clothes.add(new FinanceEntity("Зимняя куртка",8000,Period.ONCE_A_YEAR));
        clothes.add(new FinanceEntity("Обувь",6000,Period.ONCE_A_YEAR));
        clothes.add(new FinanceEntity("Зимняя обувь",5000,Period.ONCE_A_YEAR));
        clothes.add(new FinanceEntity("Футболки",7500,Period.ONCE_A_YEAR));
        clothes.add(new FinanceEntity("Рубашки",22500,Period.ONCE_A_YEAR));
        clothes.add(new FinanceEntity("Джинсы",18000,Period.ONCE_A_YEAR));
        clothes.add(new FinanceEntity("Трусы",4000,Period.ONCE_A_YEAR));
        clothes.add(new FinanceEntity("Носки",1500,Period.ONCE_A_YEAR));

        List<FinanceEntity> food = new ArrayList<>();
        food.add(new FinanceEntity("Еда",550*31,Period.ONCE_A_MONTH));

        List<FinanceEntity> salary = new ArrayList<>();
        salary.add(new FinanceEntity("Зарплата1",27500,Period.ONCE_A_MONTH));
        salary.add(new FinanceEntity("Зарплата2",27500,Period.ONCE_A_MONTH));

        List<FinanceCategory> categories = new ArrayList<>();
        categories.add(new FinanceCategory("Постоянные платежи",standingPayment,true));
        categories.add(new FinanceCategory("Праздники",celebration,true));
        categories.add(new FinanceCategory("Одежда",clothes,true));
        categories.add(new FinanceCategory("Еда",food,true));
        categories.add(new FinanceCategory("Зарплата",salary,false));

        new Report(categories).getReport();

    }
}
