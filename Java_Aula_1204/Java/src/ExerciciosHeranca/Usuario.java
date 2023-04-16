package ExerciciosHeranca;

public class Usuario {
   private String nome;
   private String email;
   private Number telefone;


   public String getNome() {
      return nome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public Number getTelefone() {
      return (Number)telefone;
   }
   public void setTelefone(Number telefone) {
      this.telefone = telefone;
   }
   
}
