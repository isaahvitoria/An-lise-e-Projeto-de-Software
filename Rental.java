public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getCharge() {
        // Delegação para o método da classe Movie
        return _movie.getCharge(_daysRented);
    }

    public int getFrequentRenterPoints() {
        if (_movie.getPriceCode() == Movie.NEW_RELEASE && _daysRented > 1) {
            return 2; // Bônus para novos lançamentos alugados por mais de 1 dia
        }
        return 1; // Padrão: 1 ponto por aluguel
    }
}
