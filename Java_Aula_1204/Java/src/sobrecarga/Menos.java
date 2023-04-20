package sobrecarga;

public class Menos extends Calculadora {

   double resultado;

   public void subtrair(double v1, double v2) {
      resultado = v1 - v2;
   }

   public void mostrarResultado() {
      System.out.println("Divisao: " + resultado);
   }
}
