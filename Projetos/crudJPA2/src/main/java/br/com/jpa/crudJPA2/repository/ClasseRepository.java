package br.com.jpa.crudJPA2.repository;

import br.com.jpa.crudJPA2.orm.Classe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository extends CrudRepository<Classe, Integer> {
}
