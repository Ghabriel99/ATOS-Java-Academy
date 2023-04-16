package Aula_1204;

public class TestaAluno {


   public static void main(String[] args) {

      Aluno aluno1 = new Aluno("Estudante1",  2554);
      Aluno aluno2 = new Aluno("25/05/1999");
      Aluno aluno3 = new Aluno("Ghabriel", "25/05/1999", 2020);

      System.out.println("Nome Aluno do primeiro construtor: "+ aluno1.nome + ", matricula do aluno: "+ aluno1.matricula);
      System.out.println("Segundo construtor data nascimento: " + aluno2.dataNascimento);
      System.out.println("Aluno do terceiro construor: " + aluno3.nome + ", Data nascimento:" + aluno3.dataNascimento + ", Ano matricula: " + aluno3.anoMatricula);
   }
}
