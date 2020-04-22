package app;

import Utils.Lectura;
import Variables.Division;
import Variables.Multiplicacion;
import Variables.Operaciones;
import Variables.Resta;
import Variables.Suma;

public class App {
   public static Lectura leer = new Lectura();
    
    public static void main(String[] args) throws Exception {
  
        inicio();
}

public static void inicio()
{
 
    int opcion;
    
    do{
        menu();
        System.out.println("Elija una opción...");
        opcion = leer.entero();
    
    switch(opcion){
  case 1:
       suma();
     break;
     case 2:
     resta();
       break;
       case 3:
       multi();
       break;
      case 4:
      division();
       break;
  
  
    }
  
      }while(opcion !=4);


}

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
    Division divi = new Division(numero1, numero2);
    divi.mostrarresultado();
}


public static void menu(){
System.out.println("*-*-*-Calculadora*-*-*");
System.out.println("1.- SUMA ");
System.out.println("2.- RESTA");
System.out.println("3.- MULTIPLICACION");
System.out.println("4.- DIVISION");


}




}