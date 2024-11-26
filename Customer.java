import java.util.Vector;
import java.util.Enumeration;

public class Customer {

   private String _name;
   private Vector<Rental> _rentals = new Vector<>();  // Parametrização do tipo

   // Novo método para gerar a declaração em texto
   public String statement() {
      return new TextStatement().statement(this);
   }

   // Novo método para gerar a declaração em HTML
   public String htmlStatement() {
      return new HtmlStatement().statement(this);
   }

   // Métodos de acesso aos alugueis, charge e pontos
   public Enumeration<Rental> getRentals() {  // Parametrização do tipo
      return _rentals.elements();
   }

   public double getTotalCharge() {
      double result = 0;
      Enumeration<Rental> rentals = _rentals.elements();  // Parametrização do tipo
      while (rentals.hasMoreElements()) {
         Rental each = rentals.nextElement();
         result += each.getCharge();
      }
      return result;
   }

   public int getTotalFrequentRenterPoints() {
      int result = 0;
      Enumeration<Rental> rentals = _rentals.elements();  // Parametrização do tipo
      while (rentals.hasMoreElements()) {
         Rental each = rentals.nextElement();
         result += each.getFrequentRenterPoints();
      }
      return result;
   }

   // Método para adicionar alugueis
   public void addRental(Rental rental) {
      _rentals.addElement(rental);
   }

   // Método para definir o nome do cliente
   public String getName() {
      return _name;
   }

   public void setName(String name) {
      _name = name;
   }
}
