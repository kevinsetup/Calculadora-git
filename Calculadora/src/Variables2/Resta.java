package Variables2;

public class Resta extends Operacion{
    private double resta;
    public Resta(double numero1)
    {
      
    super(numero1, '-');
    this.resta = numero1;
    System.out.println("Resta = "  + this.resta );
    
    
    }
}