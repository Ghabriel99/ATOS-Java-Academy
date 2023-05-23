package br.com.jpa.crudJPA.servicesCrud;

import br.com.jpa.crudJPA.orm.Department;
import br.com.jpa.crudJPA.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudDepartment {
    private boolean system = true;

    private DepartmentRepository departmentRepository;

    public CrudDepartment(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public void inicial(Scanner scanner) {
        while(system) {
            System.out.println("Qual acao de Funcionario deseja executar");
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
        System.out.println("Digite o nome que quer salvar :");
        String nome = sc.next();

        System.out.println("Digite o departamento do Funcionário :");
        String departamento = sc.next();

        Department department = new Department();
        department.setNome(nome);
        department.setDepartmento(departamento);
        department.getEmployees();

        departmentRepository.save(department); // chama o método save do crud repository e salva tudo
        System.out.println("Departamento cadastrado!");
    }
    private void atualizar (Scanner sc) {
        System.out.println("Digite o Id a ser atualizado :");
        Integer id = sc.nextInt();

        System.out.println("Digite o nome para atualizar :");
        String nome = sc.next();

        System.out.println("Digite o Departamento para atualizar :");
        String departamento = sc.next();

        Department department = new Department();
        department.setId(id);
        department.setNome(nome);
        department.setDepartmento(departamento);


        departmentRepository.save(department);
        System.out.println("Departamento alterado com sucesso! ");
    }

    private void visualizar () {
        Iterable<Department> departments = departmentRepository.findAll();  // find all pega todos os registros salvos
        departments.forEach(department -> System.out.println(department));
    }

    private void deletar(Scanner sc) {
        System.out.println("Digite o Id do funcionário para deletar :");
        int id = sc.nextInt();
        departmentRepository.deleteById(id);
        System.out.println("Deletado com sucesso!");
    }
}

