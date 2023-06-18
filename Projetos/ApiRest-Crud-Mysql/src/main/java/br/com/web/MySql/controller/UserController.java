package br.com.web.MySql.controller;

import br.com.web.MySql.model.User;
import br.com.web.MySql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String cadastrar(@RequestBody User user) {
        userService.addUser(user);
        return "user added!";
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/get")
    public User getUser(@RequestParam Integer id) {
        return userService.getUser(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Integer id, @RequestBody User user) {
        userService.updateUser(id, user);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);

        return ResponseEntity.noContent().build();
    }
}