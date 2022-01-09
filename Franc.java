public class Franc extends Money {
    private String currency;

    public Franc(int amount, String currency) {
        super(amount, currency);
    }
    String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }



}

