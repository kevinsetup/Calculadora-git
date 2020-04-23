package app;


import Utils.Lectura;



public class App {
   public static Lectura leer = new Lectura();

    public static void main(String[] args) throws Exception {

   eleccioncalc();
}
public static void eleccioncalc(){
    int opcion;
   
do{
System.out.println("1.- Calculadora básica");
System.out.println("2.- Calculadora Más Avanzada");
opcion = leer.entero();
switch (opcion) {
    case 1:
        inicio();
        break;
    case 2:
    inicio2();
    break;
    default:
        break;
}

}while(opcion != 2);
}
public static void menu2()
{
    System.out.println("*-*-*-Calculadora Avanzada*-*-*");
    System.out.println("1.- SUMA ");
    System.out.println("2.- RESTA");
    System.out.println("3.- MULTIPLICACION");
    System.out.println("4.- DIVISION");
}
public static void inicio2(){
    int opcion;   
    do{
        menu2();
        System.out.println("Elija una opción...");
        opcion = leer.entero();
    
    switch(opcion){
  case 1:
     ProcesosCal.suma();;
     break;
     case 2:
     ProcesosCal.resta();;
       break;
       case 3:
       ProcesosCal.multi();
       break;
      case 4:
      ProcesosCal.division();;
       break;
    }
  
      }while(opcion !=4);
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
      Procesos.suma();
     break;
     case 2:
     Procesos.resta();
       break;
       case 3:
       Procesos.multi();
       break;
      case 4:
      Procesos.division();;
       break;
  
  
    }
  
      }while(opcion !=4);
}





public static void menu(){
System.out.println("*-*-*-Calculadora Básica*-*-*");
System.out.println("1.- SUMA ");
System.out.println("2.- RESTA");
System.out.println("3.- MULTIPLICACION");
System.out.println("4.- DIVISION");


}




}