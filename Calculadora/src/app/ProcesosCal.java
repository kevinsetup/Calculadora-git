package app;
import Utils.Lectura;
import Variables.Multiplicacion;
import Variables2.*;


public class ProcesosCal {
    public static Lectura leer = new Lectura();


    public static void suma(){
        int numero1 = 0;
        int a [] = new int[99999];
        System.out.println("Bienvenido a la suma");
        System.out.println("Tenga en cuenta que cuando presione 0, se cancelará automaticamente y le aparecerá el resultado");
for(int i = 0; i< a.length; i++){
System.out.print("numero " + i + " = " );
a[i] = leer.entero();
numero1 += a[i];

if(a[i] == 0){
    break;
}

}

Suma suma = new Suma(numero1);



     
    
    }

    public static void resta(){
        int tamaño = 99999;
        int resta = 0;
        int a [] = new int[tamaño];
        int aux = 0;
        System.out.println("Bienvenido a la resta");
        System.out.println("Tenga en cuenta que cuando presione 0, se cancelará automaticamente y le aparecerá el resultado");
for(int i = 0; i< tamaño; i++){
System.out.print("numero " + i + " = " );
a[i] = leer.entero();
if(a[i] == a[0]){
    resta = a[0];
}else{
    resta = resta - a[i];
}


if(a[i] == 0){
    break;
}

}

Resta resta2 = new Resta(resta);
    }
    public static void multi(){
        int numero1 = 1;
        int a [] = new int[99999];
        System.out.println("Bienvenido a la Multiplicación");
        System.out.println("Tenga en cuenta que cuando presione 0, se cancelará automaticamente y le aparecerá el resultado");
for(int i = 0; i< a.length; i++){
System.out.print("numero " + i + " = " );
a[i] = leer.entero();
numero1 *= a[i];

if(a[i] == 0){
    break;
}
Mutliplicacion multi = new Mutliplicacion(numero1);
}


    }
    public static void division()  
    {
        
        double numero1 = 1;
        double a [] = new double[99999];
        System.out.println("Bienvenido a la División");
        System.out.println("Tenga en cuenta que cuando presione 0, se cancelará automaticamente y le aparecerá el resultado");
for(int i = 0; i< a.length; i++){
System.out.print("numero " + i + " = " );
a[i] = leer.decimal();
numero1 /= a[i];
Division division = new Division(numero1);
if(a[i] == 0){
    break;
}

  
}
}
}