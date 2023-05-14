package jpaRepository;

import jpaConexao.ConnectionFactory;
import model.Servicos;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ServicosRepository {

    private EntityManager em;

    public ServicosRepository() {
        em = ConnectionFactory.getEntityManager();
    }

    public void salvar(Servicos servico) {
        em.getTransaction().begin();
        em.persist(servico);
        em.getTransaction().commit();
    }

    public void alterar(Servicos servico) {

        em.getTransaction().begin();
        em.merge(servico);
        em.getTransaction().commit();
    }

    public void excluir(Integer id) {

        Servicos registro = buscar(id);

        if (registro != null) {
            em.getTransaction().begin();
            em.remove(registro);
            em.getTransaction().commit();
        }
    }

    public Servicos buscar(Integer id) {

        Servicos registro = em.find(Servicos.class, id);

        return registro;
    }

    public List<Servicos> listar() {

        Query query = em.createQuery("SELECT s FROM Servicos s");

        return query.getResultList();
    }
}
