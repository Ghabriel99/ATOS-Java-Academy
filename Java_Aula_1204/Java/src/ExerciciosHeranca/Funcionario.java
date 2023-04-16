package ExerciciosHeranca;

public class Funcionario{

   public static void main(String[] args) {

      PessoaFuncionario pessoa1 = new PessoaFuncionario();
      pessoa1.setNome("Bob");
      pessoa1.setIdade(30);
      pessoa1.setTelefone(995522336);
      pessoa1.setSetor("TI");
      pessoa1.setCargo("Suporte");
      pessoa1.setFuncao("Ajudar");
      
      System.out.println("Imprimindo dados do primeiro funcionario:");
      System.out.println("Nome: "+ pessoa1.getNome()+ ", Idade: "+ pessoa1.getIdade()+ ", Telefone: " + pessoa1.getTelefone()
      + ", Setor: " + pessoa1.getSetor() + ", Cargo: " + pessoa1.getCargo() + ", Funcao: " + pessoa1.getFuncao());

      PessoaFuncionario pessoa2 = new PessoaFuncionario();
      pessoa2.setNome("Ghabriel");
      pessoa2.setIdade(23);
      pessoa2.setTelefone(9999999);
      pessoa2.setSetor("DEV");
      pessoa2.setCargo("Java");
      pessoa2.setFuncao("FullStack");

      System.out.println();
      System.out.println("Imprimindo dados do segundo funcionario:");
      System.out.println("Nome: "+ pessoa2.getNome()+ ", Idade: "+ pessoa2.getIdade()+ ", Telefone: " + pessoa2.getTelefone()
      + ", Setor: " + pessoa2.getSetor() + ", Cargo: " + pessoa2.getCargo() + ", Funcao: " + pessoa2.getFuncao());

      PessoaFuncionario pessoa3 = new PessoaFuncionario();
      pessoa3.setNome("Luiz");
      pessoa3.setIdade(25);
      pessoa3.setTelefone(515916518);
      pessoa3.setSetor("TI");
      pessoa3.setCargo("Analista");
      pessoa3.setFuncao("Analisar");

      System.out.println();
      System.out.println("Imprimindo dados do primeiro funcionario:");
      System.out.println("Nome: "+ pessoa3.getNome()+ ", Idade: "+ pessoa3.getIdade()+ ", Telefone: " + pessoa3.getTelefone()
      + ", Setor: " + pessoa3.getSetor() + ", Cargo: " + pessoa3.getCargo() + ", Funcao: " + pessoa3.getFuncao());
   }
   
}
