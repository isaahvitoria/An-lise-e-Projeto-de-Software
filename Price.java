public abstract class Price {
    public abstract int getPriceCode();

    // Método para calcular o valor da cobrança
    public abstract double getCharge(int daysRented);
}
