package br.com.jpa.crudJPA2.services;

import br.com.jpa.crudJPA2.orm.Classe;
import br.com.jpa.crudJPA2.repository.ClasseRepository;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class ClasseCrud {

    private boolean system = true;

    private ClasseRepository classeRepository;

    public ClasseCrud(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    public void inicial(Scanner scanner) {
        while(system){
            System.out.println("Qual acao do Professor deseja executar");
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Visualizar");
            System.out.println("4 - Deletar");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    salvar(scanner);
                    break;
                case 2:
                    atualizar(scanner);
                    break;
                case 3:
                    visualizar();
                    break;
                case 4:
                    deletar(scanner);
                    break;
                default:
                    system = false;
                    break;
            }
        }
    }

    private void salvar(Scanner sc) {
        System.out.println("Digite o nome da Classe para salvar :");
        String nome = sc.next();

        System.out.println("Digite o Id :");
        Integer id = sc.nextInt();

        Classe classe = new Classe();
        classe.setCnome(nome);
        classe.setCid(id);

        classeRepository.save(classe); //chama o .save do CrudRepository para salvar os registros
        System.out.println("Professor cadastrado!");
    }
    private void atualizar (Scanner sc) {
        System.out.println("Digite o Id da Classe para atualizar :");
        Integer id = sc.nextInt();

        System.out.println("Digite o nome do professor :");
        String nome = sc.next();

        System.out.println("Digite o Assunto para atualizar :");
        String assunto = sc.next();


        Classe classe = new Classe();
        classe.setCid(id);
        classe.setCnome(nome);
        classe.setCnome(assunto);

        classeRepository.save(classe);
        System.out.println("Alterado com sucesso! ");
    }

    private void visualizar () {
        Iterable<Classe> classes = classeRepository.findAll();  // chama o findAll do CrudRepository e pega todos os registros salvos
        classes.forEach(classe -> System.out.println(classe));
    }

    private void deletar(Scanner sc) {
        System.out.println("Digite o Id da Classe para deletar :");
        int id = sc.nextInt();
        classeRepository.deleteById(id); // chama o deleteById do CrudRepository e deleta pelo id
        System.out.println("Classe deletada com sucesso!");
    }
}
