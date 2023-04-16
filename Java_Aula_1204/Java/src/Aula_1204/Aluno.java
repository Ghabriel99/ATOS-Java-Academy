package Aula_1204;

public class Aluno {
   
   String nome;
   Integer matricula;
   String dataNascimento;
   Integer anoMatricula;

   public Aluno(){}


   public Aluno(String nome, Integer matricula) {
      this.nome = nome;
      this.matricula = matricula;
   }

   public Aluno(String dataNascimento) {
      this.dataNascimento = dataNascimento;
   }

   public Aluno(String nome, String dataNascimento, Integer anoMatricula) {
      this.nome = nome;
      this.dataNascimento = dataNascimento;
      this.anoMatricula = anoMatricula;
   }

   
}
