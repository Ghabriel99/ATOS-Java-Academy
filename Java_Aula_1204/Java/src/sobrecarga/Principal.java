package sobrecarga;

public class Principal {
   public static void main(String[] args) {
      
      Soma soma = new Soma();
      soma.calcular(1, 3);
      soma.mostrarResultado();

      Multiplicacao multiplica  = new Multiplicacao();
      multiplica.multiplicar(3, 3);
      multiplica.mostrarResultado();

      Divisao divide = new Divisao();
      divide.dividir(10, 5);
      divide.mostrarResultado();

      Menos subtrai = new Menos();
      subtrai.subtrair(10, 7);
      subtrai.mostrarResultado();
   }
}
