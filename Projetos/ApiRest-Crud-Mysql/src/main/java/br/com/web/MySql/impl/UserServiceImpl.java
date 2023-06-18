package br.com.web.MySql.impl;

import br.com.web.MySql.model.User;
import br.com.web.MySql.repository.UserRepository;
import br.com.web.MySql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) { userRepository.save(user); }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID do user inválido" + id));

        //retorna o user pelo id
        return user;
    }

    @Override
    public void updateUser(Integer id, User user) {
        //verificando se user está no banco
        userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID não encontrado" + id));

        user.setId(id);

        //chama o método save do crud e atualiza o user pelo id
        userRepository.save(user);
        System.out.println("User atualizado com sucesso!");
    }

    @Override
    public void deleteUser(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID não encontrado" + id));

        //chama o método delete do crud e deleta o user pelo id
        userRepository.delete(user);
        System.out.println("User deletado com sucesso");
    }
}
