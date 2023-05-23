package br.com.jpa.crudJPA2.services;

import br.com.jpa.crudJPA2.orm.Professor;
import br.com.jpa.crudJPA2.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class ProfessorCrud {

    private boolean system = true;

    private ProfessorRepository  professorRepository;

    public ProfessorCrud(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }


    public void inicial(Scanner scanner) {
        while(system) {
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
        System.out.println("Digite o nome do Professor para salvar :");
        String nome = sc.next();

        System.out.println("Digite o assunto do professor :");
        String assunto = sc.next();

        Professor professor = new Professor();
        professor.setTnome(nome);
        professor.setAssunto(assunto);

        professorRepository.save(professor); //chama o .save do CrudRepository para salvar os registros

        System.out.println("Professor cadastrado!");
    }
    private void atualizar (Scanner sc) {
        System.out.println("Digite o Id a ser atualizado :");
        Integer id = sc.nextInt();

        System.out.println("Digite o nome :");
        String nome = sc.next();

        System.out.println("Digite o Assunto :");
        String assunto = sc.next();


        Professor professor = new Professor();
        professor.setTid(id);
        professor.setTnome(nome);
        professor.setAssunto(assunto);

        professorRepository.save(professor); //chama o .save do CrudRepository para alterar
        System.out.println("Alterado com sucesso! ");
    }

    private void visualizar () {
        Iterable<Professor> employees = professorRepository.findAll();  // chama o findAll do CrudRepository e pega todos os registros salvos
        employees.forEach(employee -> System.out.println(employee));
    }

    private void deletar(Scanner sc) {
        System.out.println("Digite o Id do Professor para deletar :");
        int id = sc.nextInt();
        professorRepository.deleteById(id); // chama o deleteById do CrudRepository e deleta pelo id
        System.out.println("Professor deletado com sucesso!");
    }
}
