package Aula_1204;

public class Carro {
   
   private String fabricante = "VW";
   private String modelo = "Jetta";
   private String modelo2 = "GOL";

   public String getFabricante() {
      return fabricante;
   }

   public String getModelo() {
      return modelo;
   }

   public String getModelo2() {
      return modelo2;
   }


   public void ligar() {
      System.out.println("Carro ligado!");
   }

   public void desligar() {
      System.out.println("Carro desligado!");
   }

   public void exibirDados() {
      System.out.println("Dados do carro: " + fabricante + " " + modelo);
   }
   
}
