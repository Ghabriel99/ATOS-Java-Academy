package sobrecarga;

public class Multiplicacao extends Calculadora{

   double resultado;

   public void multiplicar(double v1, double v2) {
      resultado = v1 * v2;
   }

   public void mostrarResultado() {
      System.out.println("Multiplicacao : " + resultado);

   }
}
