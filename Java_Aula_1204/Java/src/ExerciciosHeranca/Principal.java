package ExerciciosHeranca;

import java.util.Scanner;

public class Principal{
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Informe seu nome: ");
      String nome = sc.nextLine();

      System.out.println("Informe sua idade: ");
      int idade = sc.nextInt();

      System.out.println("Informe o tipo: ");

      Pessoa pessoa = new Pessoa(nome, idade);
      System.out.println(pessoa);
      
      pessoa.andar();
      pessoa.falar();

      sc.close();
   }
}
