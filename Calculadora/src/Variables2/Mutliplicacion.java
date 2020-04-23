package Variables2;

public class Mutliplicacion extends Operacion {
    private double Multi;
    public Mutliplicacion(double numero1)
    {
      
    super(numero1, '-');
    this.Multi = numero1;
    System.out.println("Mutiplicación = "  + this.Multi );
    
    
    }
}