package app;
import Utils.Lectura;
import Variables.Division;
import Variables.Multiplicacion;
import Variables.Resta;
import Variables.Suma;





public class Procesos {
public static Lectura leer = new Lectura();


    public static void suma(){
        System.out.println("Bienvenido a la suma");
         System.out.println("Numero 1 :");
         double numero1 = leer.entero();
         System.out.println("Numero 2 :");
         double numero2 = leer.entero();
         Suma suma = new Suma(numero1, numero2);
         suma.mostrarresultado();
    
    }

    public static void resta(){
        System.out.println("Bienvenido a la Resta");
         System.out.println("Numero 1 :");
         double numero1 = leer.entero();
         System.out.println("Numero 2 :");
         double numero2 = leer.entero();
         Resta resta = new Resta(numero1, numero2);
         resta.mostrarresultado();
    }
    public static void multi(){
        System.out.println("Bienvenido a la multiplicación");
         System.out.println("Numero 1 :");
         double numero1 = leer.entero();
         System.out.println("Numero 2 :");
         double numero2 = leer.entero();
         Multiplicacion multi = new Multiplicacion(numero1, numero2);
         multi.mostrarresultado();
    }
    public static void division()
    {
        System.out.println("Bienvenido a la Division");
        System.out.println("Numero 1 :");
        double numero1 = leer.entero();
        System.out.println("Numero 2 :");
        double numero2 = leer.entero();
        if(numero2 == 0){
            System.out.println("No se puede divir sobre 0 ");
        }else{
            Division divi = new Division(numero1, numero2);
            divi.mostrarresultado();
        }
}
}