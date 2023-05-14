package jpaConexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManager em;

    public static void conectar() {
        try {
            EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jpaHibernate");

            em = emfactory.createEntityManager();
            System.out.println("Conexao realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static EntityManager getEntityManager() {
        return em;
    }
}
