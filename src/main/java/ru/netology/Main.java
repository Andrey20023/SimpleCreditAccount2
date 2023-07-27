package ru.netology;

import ru.netology.Account.CreditAccount;
import ru.netology.Account.SimpleAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CreditAccount creditCart = new CreditAccount(-500, -10000);
        CreditAccount creditCart2 = new CreditAccount(-500, -10000);
        System.out.println("aaadd  " + creditCart.result(500));
        SimpleAccount debetCart = new SimpleAccount(500);

        System.out.println("баланс кредитной карты = " + creditCart.getBalance());
        System.out.println("лимит кредитной карты = " + creditCart.getLimit());
        System.out.println("баланс дебетовой карты = " + debetCart.getBalance());

        System.out.println(creditCart.transfer(creditCart2, 499));
        System.out.println("баланс кредитной карты = " + creditCart.getBalance());
        System.out.println("лимит кредитной карты = " + creditCart.getLimit());
        System.out.println("баланс кредитной карты 2 = " + creditCart2.getBalance());
        System.out.println("лимит кредитной карты2= " + creditCart2.getLimit());
        System.out.println("баланс дебетовой карты = " + debetCart.getBalance());
    }
}