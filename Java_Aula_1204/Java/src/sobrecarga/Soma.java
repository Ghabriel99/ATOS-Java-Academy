package sobrecarga;

public class Soma extends Calculadora{

   double resultado;

   public void calcular(double v1, double v2) {
      resultado = v1 + v2;
   }

   public void mostrarResultado() {
      System.out.println("Soma: " + resultado);
   }
   
}
