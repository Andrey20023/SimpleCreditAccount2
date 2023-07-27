package ru.netology.Account;


public class CreditAccount extends Account {
    private final long limit;

    public CreditAccount(long balance, long limit) {
        super(balance > 0 ? 0 : balance);
        this.limit = limit;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount < limit) {
            return false;
        }
        balance -= amount;
        return true;
    }
    @Override

    public long result(long amount){
        balance += amount;
        return balance;
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

    public long getLimit() {
        return limit;
    }
}

