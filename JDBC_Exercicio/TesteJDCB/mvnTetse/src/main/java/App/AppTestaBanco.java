package App;

import Conexao.BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppTestaBanco {

    public static void main(String[] args) throws SQLException {
        Connection conn;

        BancoDados bd = new BancoDados();  // instancia um novo objeto "bj" da classe BancoDados

        // parâmetros para conexão ao banco
        String db_url = "jdbc:mysql://localhost:3306/academiajdbc";
        String db_user = "dev";
        String db_password = "";

        // try catch para conectar ao banco
        try {
            bd.conectar(db_url, db_user, db_password);
            System.out.println("BD CONECTADO!");

        } catch (SQLException e) {
            System.out.println(e);
        }

        //try catch para chamar o método InserirAlterarExcluir e enviar/alterar os dados no banco
        try {
           String deletarTabela = "DROP TABLE pessoa";
           bd.inserirAlterarExcluir(deletarTabela);

            String inserir = "CREATE TABLE pessoa (nome VARCHAR(50), email VARCHAR(50), cargo VARCHAR(50))";
            bd.inserirAlterarExcluir(inserir);
            System.out.println("Table criada com sucesso!");

            String queryInsert = "INSERT INTO pessoa (nome, email, cargo) VALUES ('GHABRIEL', 'GHABRIEL@ufn', 'Aluno')";
            bd.inserirAlterarExcluir(queryInsert);
            System.out.println("Query insert1 executada!");

            String queryInsert2 = "INSERT INTO pessoa (nome, email, cargo) VALUES ('Lucas', 'Lucas@ufn', 'Professor')";
            bd.inserirAlterarExcluir(queryInsert2);
            System.out.println("Query insert2 executada!");

            String queryInsert3 = "INSERT INTO pessoa (nome, email, cargo) VALUES ('Deivisson', 'professor@ufn', 'Professor')";
            bd.inserirAlterarExcluir(queryInsert3);
            System.out.println("Query insert3 executada!");

            String deletar = "DELETE FROM pessoa WHERE cargo = 'aluno'";
            bd.inserirAlterarExcluir(deletar);
            System.out.println("Delele executado!");

//            String atualiza = "UPDATE pessoa SET nome = 'alguem' WHERE nome = teste";
//            bd.inserirAlterarExcluir(atualiza);
//            System.out.println("Query UPDATE realizada!");

            String alteraTabela = "ALTER TABLE pessoa ADD disciplina VARCHAR(50)";
            bd.inserirAlterarExcluir(alteraTabela);
            System.out.println("Foi inserido uma nova coluna de Disciplinas no banco de Dados.");

        } catch (SQLException e) {
            System.out.println(e);
        }

        //try catch para chamar o método desconectar do BancoDados
        try {
            bd.desconectar();
        } catch (SQLException e) {
            throw new RuntimeException("Falha na conexão, banco desconectado!");
        }
    }
}
