package Variables;

public class Resta extends Operaciones{

    private double resta;
    public Resta(double numero1, double numero2)
    {
    super(numero1, numero2, '+');
    this.resta = numero1 + numero2;
    this.setResultado(this.resta);
    
    
    
    }


}