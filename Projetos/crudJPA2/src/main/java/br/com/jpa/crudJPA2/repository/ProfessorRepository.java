package br.com.jpa.crudJPA2.repository;

import br.com.jpa.crudJPA2.orm.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
}
