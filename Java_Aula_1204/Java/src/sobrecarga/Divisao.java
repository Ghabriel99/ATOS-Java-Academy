package sobrecarga;

public class Divisao extends Calculadora{

   double resultado;

   public void dividir(double v1, double v2) {

      resultado = v1 / v2;
   }

   public void mostrarResultado() {
      System.out.println("Divisao: " + resultado);
   }
   
}
