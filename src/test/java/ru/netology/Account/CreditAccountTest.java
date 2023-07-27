package ru.netology.Account;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {


    @org.junit.jupiter.api.Test
    public void add() {
        CreditAccount creditAccount = new CreditAccount(-100, -500);
        assertEquals(false, creditAccount.add(500));
        assertFalse(creditAccount.add(200));
        assertTrue(creditAccount.add(-50));
    }

    @org.junit.jupiter.api.Test
    void pay() {
        CreditAccount creditAccount = new CreditAccount(-100, -500);
        assertEquals(true, creditAccount.pay(400));
        assertFalse(creditAccount.pay(200));
        assertTrue(creditAccount.pay(-50));
    }

    @org.junit.jupiter.api.Test
    public void result() {
        CreditAccount creditAccount = new CreditAccount(-100, -500);
        long actual = creditAccount.result(-200);
        long expected = -300;
        assertEquals(expected, actual);
    }
}
