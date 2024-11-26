public abstract class Statement {

    // Método abstrato que será implementado nas subclasses
    public abstract String value(Customer aCustomer);
 
    // Template Method que chama o método 'value' para gerar a declaração
    public String statement(Customer aCustomer) {
       return value(aCustomer);
    }
 }
 