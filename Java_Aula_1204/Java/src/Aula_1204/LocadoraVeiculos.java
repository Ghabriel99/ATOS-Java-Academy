package Aula_1204;

import java.util.Scanner;

public class LocadoraVeiculos {
   
   public static void main(String[] args) {

      Carro carro = new Carro();
      System.out.println(" Dados do carro do ex03: " + carro.getFabricante() + " " + carro.getModelo2()); //usando get e set do private

      System.out.println("Começando o exercício 4");

      Scanner sc = new Scanner(System.in);

      System.out.println("Insira o modelo da moto: ");
      String modeloMoto = sc.nextLine();  // modeloMoto salva a leitura do scanner
      System.out.println("O modelo da moto é: " + modeloMoto);

      
      System.out.println("Insira a marca da moto");
      String marcaMoto = sc.nextLine();
      System.out.println("A marca da moto é: " + marcaMoto);


      System.out.println("Insira as cilindradas da moto");
      String cilindradas = sc.nextLine();
      System.out.println("O modelo da moto é: " + modeloMoto + " , a marca da moto é " + marcaMoto + ", e as cilindradas " + cilindradas);
      
      sc.close();
   }
}
