package Variables;

public class Division extends Operaciones{
    private double division;

    public Division(double numero1, double numero2)
    {
    super(numero1, numero2, '/');
    if(numero2 == 0)System.out.println("No se puede dividir entre 0");
    else this.division = numero1/numero2;
    this.division = numero1 + numero2;
    this.setResultado(this.division);
    
    
    
    }
}