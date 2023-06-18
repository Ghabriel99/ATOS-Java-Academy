package br.com.web.MySql.repository;

import br.com.web.MySql.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
