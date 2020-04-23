package Variables2;

public class Suma extends  Operacion {
    private double suma;
    public Suma(double numero1)
    {
      
    super(numero1, '+');
    this.suma = numero1;
    System.out.println("SUMA = "  + this.suma  );
    
    
    }
   


}