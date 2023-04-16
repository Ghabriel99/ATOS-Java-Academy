package Aula_1204;

public class TestePessoa {
   public static void main(String[] args) {

      Pessoa pessoa = new Pessoa("Gha", 23);
      Pessoa pessoa2 = new Pessoa("Lucas", 33);

      System.out.println("O nome da pessoa é " + pessoa.nome +  " e a idade é " + pessoa.idade);
      System.out.println("O nome da pessoa é " + pessoa2.nome +  " e a idade é " + pessoa2.idade);

      System.out.println();
   }
}
