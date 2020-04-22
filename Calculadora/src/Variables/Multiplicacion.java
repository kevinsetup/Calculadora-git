package Variables;

public class Multiplicacion extends Operaciones{
    private double multi;

    public Multiplicacion(double numero1, double numero2)
    {
    super(numero1, numero2, 'x');
    this.multi = numero1 * numero2;
    this.setResultado(this.multi);
    
    
    
    }

}