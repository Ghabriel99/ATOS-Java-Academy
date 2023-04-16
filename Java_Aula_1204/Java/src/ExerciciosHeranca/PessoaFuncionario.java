package ExerciciosHeranca;

public class PessoaFuncionario {
   private String nome;
   private int idade;
   private Number telefone;
   private String setor;
   private String cargo;
   private String funcao;


   //Getters and Setters
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getIdade() {
      return idade;
   }
   
   public void setIdade(int idade) {
      this.idade = idade;
   }

   public Number getTelefone() {
      return telefone;
   }

   public void setTelefone(Number telefone) {
      this.telefone = telefone;
   }

   public String getSetor() {
      return setor;
   }

   public void setSetor(String setor) {
      this.setor = setor;
   }

   public String getCargo() {
      return cargo;
   }

   public void setCargo(String cargo) {
      this.cargo = cargo;
   }

   public String getFuncao() {
      return funcao;
   }

   public void setFuncao(String funcao) {
      this.funcao = funcao;
   }


}
