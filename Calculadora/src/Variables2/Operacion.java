package Variables2;

public class Operacion {
    private double numero1;
    private double numero2;
    private double resultado;
    private char operacion;
    public Operacion(final double numero1, final char operacion){
    this.numero1 = numero1;
    this. operacion = operacion;
    
    
    }
    
    
        public double getN1() {
            return numero1;
        }
    
        public void setN1(final double numero1) {
            this.numero1 = numero1;
        }
    
        
    
        public char getOperacion() {
            return operacion;
        }
    
        public void setOperacion(final char operacion) {
            this.operacion = operacion;
        }
    
        public double getResultado() {
            return resultado;
        }
    
        public void setResultado(final double resultado) {
            this.resultado = resultado;
        }
    public  void mostrarresultado(){
        System.out.println(this.numero1 + " " + this.operacion + " = " + this.resultado);
    }



}