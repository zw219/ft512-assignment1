class Money implements Expression{
    protected int amount;
    protected  String currency;

    String currency() {
        return currency;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;

    }

//    Money times(int multiplier) {
//        return new Money(amount * multiplier, currency);
//    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }



}

