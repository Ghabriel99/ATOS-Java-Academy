package Aula_1204;

public class Pessoa {

   public String nome;
   public int idade;

   public static void main(String[] args) {

     System.out.println("Qual construtor quer utilizar?");
   }

   //constructors
   public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
   }

   public Pessoa(String nome) {
      this.nome = nome;
   }

   public Pessoa(){}

   @Override
   public String toString() {

      return "Nome da pessoa: " + this.nome;
   }

}


