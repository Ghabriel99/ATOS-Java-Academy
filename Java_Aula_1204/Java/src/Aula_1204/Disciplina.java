package Aula_1204;

public class Disciplina {
   
   public static void main(String[] args) {

      Professor professor =  new Professor();
      professor.setNome("Lucas Schelestein");

      Laboratorio laboratorio = new Laboratorio();
      laboratorio.setLocal("Sala 2");

      System.out.println("O nome do professor é: " + professor.getNome() + " e o local da aula é na: " + laboratorio.getLocal());
   }
}
