package Conexao;

import java.sql.*;

public class BancoDados implements interfaceBancoDados{

    static Connection conn;

    public BancoDados(){}

    @Override
    public void conectar(String db_url, String db_user, String db_password ) throws SQLException{

        try{
            conn = DriverManager.getConnection(db_url, db_user, db_password);

            System.out.println("Conexão estabelecida!");

        } catch (Exception e) {
            System.out.println(e);
            throw new SQLException("Algo deu muito errado!");
        }
    }

    @Override
    public void desconectar() throws SQLException{
        conn.close();
        System.out.println("Conexão encerrada com o banco!");
    }

    @Override
    public ResultSet consultar(String db_query) throws SQLException{
        PreparedStatement ps = conn.prepareStatement(db_query);
        ResultSet resultSet = ps.executeQuery("SELECT * FROM pessoa");
        return resultSet;
    }

    @Override
    public int inserirAlterarExcluir(String db_query) throws SQLException{
       PreparedStatement ps = conn.prepareStatement(db_query);
        int resultado = ps.executeUpdate();

        return resultado;
    }


}

