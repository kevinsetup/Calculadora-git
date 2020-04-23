package Variables2;

public class Division extends Operacion{
    private double Multi;
    public Division(double numero1)
    {
      
    super(numero1, '-');
    this.Multi = numero1;
    System.out.println("División = "  + this.Multi );
    
    
    }
}