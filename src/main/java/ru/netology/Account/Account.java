package ru.netology.Account;

public abstract class Account {
    protected long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    abstract boolean add(long amount);

    abstract boolean pay(long amount);

    abstract long result(long amount);

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    abstract boolean transfer(Account account, long amount);
}

   /* boolean add(long amount) — пополнение счёта на amount, возвращает true, если пополнение успешно, и false, если иначе;
        boolean pay(long amount) — покупка со счёта на amount, возвращает true, если пукупка успешна, и false, если иначе;
        boolean transfer(Account account, long amount) — перевод денег со счёта, у которого был вызван метод, на счёт из параметра на сумму в размере amount, возвращает true, если пополнение успешно, и false, если иначе;
        long getBalance() — метод возвращает текущий баланс на счёте.*/