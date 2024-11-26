public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    // Método genérico para retorno de pontos de locação (1 ponto por padrão)
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
