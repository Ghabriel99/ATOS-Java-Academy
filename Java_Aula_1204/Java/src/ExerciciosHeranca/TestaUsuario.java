package ExerciciosHeranca;

public class TestaUsuario extends Usuario{
   
   public static void main(String[] args) {

      Usuario usuarioNome = new Usuario();
      usuarioNome.setNome("Ghabriel");
      System.out.println("Nome do usuário: " + usuarioNome.getNome());

      Usuario email = new Usuario();
      email.setEmail("email@gmail.com");
      System.out.println("E-mail do usuário: " + email.getEmail());

      Usuario telefone = new Usuario();
      telefone.setTelefone(991967003);
      System.out.println("Telefone do usuário: " + telefone.getTelefone());
   }
   
}
