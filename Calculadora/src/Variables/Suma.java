package Variables;

public class Suma extends Operaciones{
private double suma;
public Suma(double numero1, double numero2)
{
super(numero1, numero2, '+');
this.suma = numero1 + numero2;
this.setResultado(this.suma);



}
    
}