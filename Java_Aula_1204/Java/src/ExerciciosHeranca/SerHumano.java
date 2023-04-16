package ExerciciosHeranca;

public class SerHumano extends Animal{

   private String nome;
   private int idade;

   public SerHumano( String nome, int idade) {

      this.nome = nome;
      this.idade = idade;
   }

   public String getNome() {
      return nome;
   }

   public int getIdade() {
      return idade;
   }

   public void falar() {
      System.out.println("Nem todos falam");
   }

   @Override
   public String toString() {

      return "Nome: " + this.getNome() + ", Idade: " + this.idade + super.toString();
   }
}
