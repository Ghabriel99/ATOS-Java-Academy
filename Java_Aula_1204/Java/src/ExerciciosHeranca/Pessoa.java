package ExerciciosHeranca;

public class Pessoa extends SerHumano{
    
   public Pessoa ( String nome, int idade) {
      super(nome, idade);
   }

   @Override
   public void falar() {
      super.falar();
   }
}
