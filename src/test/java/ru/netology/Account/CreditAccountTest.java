package ru.netology.Account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
    CreditAccount creditAccount;

    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach");
        creditAccount = new CreditAccount(-100, -500);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach");
        creditAccount = null;
    }

    @org.junit.jupiter.api.Test
    public void add() {
        assertFalse(creditAccount.add(200));
        assertTrue(creditAccount.add(-50));
    }

    @ParameterizedTest
    @ValueSource(longs = {100, 200, 300})
    void pay(long argument) {
        assertEquals(true, creditAccount.pay(argument));
    }

    @org.junit.jupiter.api.Test
    public void result() {
        long actual = creditAccount.result(-200);
        long expected = -300;
        assertEquals(expected, actual);
    }
}
