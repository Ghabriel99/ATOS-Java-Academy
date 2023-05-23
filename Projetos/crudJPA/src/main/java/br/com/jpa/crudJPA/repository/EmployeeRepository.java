package br.com.jpa.crudJPA.repository;

import br.com.jpa.crudJPA.orm.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
