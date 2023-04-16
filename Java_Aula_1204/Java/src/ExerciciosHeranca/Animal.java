package ExerciciosHeranca;

public abstract class Animal {

   private String tipo = "TESTE";

   public Animal(){}

   public Animal(String tipo) {
      this.tipo = tipo;
   }

   public String getTipo() {
      return tipo;
   }

   public void andar() {
      System.out.println("Todos andam, mas o modo é variado");
   }
   
   @Override
   public String toString() {
      return ", Tipo: " + this.getTipo();
   }
}
