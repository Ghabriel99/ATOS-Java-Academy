import jpaConexao.ConnectionFactory;
import model.Servicos;
import jpaRepository.ServicosRepository;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        ConnectionFactory.conectar();
//        salvarServico();
//        listarServicos();
//        alterarServico();
        excluirServico();
    }

    static void salvarServico() {
        Servicos servico = new Servicos();
        servico.setNome("Programador");
        servico.setPreco(3000.00);
        servico.setDescricao("Programador Junior, faz aprendendo");
        servico.setProdutos("Curiosidade, Persistencia, Força de vontade");

        ServicosRepository servicosRepository = new ServicosRepository();
        servicosRepository.salvar(servico);
        System.out.println(servico);
    }

    static void alterarServico() {
        ServicosRepository servicosRepository = new ServicosRepository();
        Servicos servico = servicosRepository.buscar(1);

        servico.setNome("Jardinagem COMPLETA!");
        servico.setDescricao("Limpeza completa do seu jardim");
        servico.setPreco(190.0);

        servicosRepository.alterar(servico);
        System.out.println(servico);
    }

    static void excluirServico() {
        ServicosRepository servicosRepository = new ServicosRepository();
        servicosRepository.excluir(2);
    }

    static void listarServicos() {
        ServicosRepository servicosRepository = new ServicosRepository();

        List<Servicos> servicos = servicosRepository.listar();

        for(Servicos s: servicos) {
            System.out.println(s.getDescricao());
            System.out.println(servicos);
        }
    }
}
