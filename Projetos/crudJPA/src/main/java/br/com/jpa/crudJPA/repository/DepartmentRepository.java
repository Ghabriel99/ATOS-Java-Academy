package br.com.jpa.crudJPA.repository;

import br.com.jpa.crudJPA.orm.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
