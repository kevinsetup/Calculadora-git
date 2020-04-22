package app;

import Utils.Lectura;
import Variables.Operaciones;
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

}
public static void multi(){

}
public static void division()
{

}


public static void menu(){
System.out.println("*-*-*-Calculadora*-*-*");
System.out.println("1.- SUMA ");
System.out.println("2.- RESTA");
System.out.println("3.- MULTIPLICACION");
System.out.println("4.- DIVISION");


}




}