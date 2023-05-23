package br.com.jpa.crudJPA.servicesCrud;

import br.com.jpa.crudJPA.orm.Department;
import br.com.jpa.crudJPA.orm.Employee;
import br.com.jpa.crudJPA.repository.DepartmentRepository;
import br.com.jpa.crudJPA.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service
public class CrudEmployee {

    private boolean system = true;

    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;

    public CrudEmployee(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    public void inicial(Scanner scanner) {
        while(system) {
            System.out.println("Qual acao do Funcionario deseja executar");
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

        System.out.println("Digite o cargo do Funcionário :");
        String cargo = sc.next();

        System.out.println("Digite o salário do Funcionario :");
        Double salario = sc.nextDouble();

        Employee emp = new Employee();
        emp.setNome(nome);
        emp.setCargo(cargo);
        emp.setSalario(salario);

        employeeRepository.save(emp); //chama o .save do CrudRepository para salvar os registros

        System.out.println("Funcionário cadastrado!");
    }
    private void atualizar (Scanner sc) {
        System.out.println("Digite o Id a ser atualizado :");
        Integer id = sc.nextInt();

        System.out.println("Digite o nome :");
        String nome = sc.next();

        System.out.println("Digite o Cargo :");
        String cargo = sc.next();

        System.out.println("Digite o salário :");
        Double salario = sc.nextDouble();

        System.out.println("Digite o cargoId :");
        Integer cargoId = sc.nextInt();


        Employee emp = new Employee();
        emp.setEid(id);
        emp.setNome(nome);
        emp.setCargo(cargo);
        emp.setSalario(salario);
        emp.setEid(cargoId);

        employeeRepository.save(emp); //chama o .save do CrudRepository para alterar
        System.out.println("Alterado com sucesso! ");
    }

    private void visualizar () {
        Iterable<Employee> employees = employeeRepository.findAll();  // chama o findAll do CrudRepository e pega todos os registros salvos
        employees.forEach(employee -> System.out.println(employee));
    }

    private void deletar(Scanner sc) {
        System.out.println("Digite o Id fo funcionário para deletar :");
        int id = sc.nextInt();
        employeeRepository.deleteById(id); // chama o deleteById do CrudRepository e deleta pelo id
        System.out.println("Deletado com sucesso!");
    }
}
