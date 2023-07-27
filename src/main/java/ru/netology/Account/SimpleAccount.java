package ru.netology.Account;

import ru.netology.Account.Account;

public class SimpleAccount extends Account {


    public SimpleAccount(long balance) {
        super(balance);
    }
    @Override

    public long result(long amount){
        return balance+amount;
    }
    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount < 0) {
            return false;
        }
        balance -= amount;
        return true;
    }


    @Override
    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }
}


