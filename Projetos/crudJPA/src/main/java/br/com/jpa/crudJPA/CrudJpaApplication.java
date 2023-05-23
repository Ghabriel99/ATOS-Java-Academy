package br.com.jpa.crudJPA;

import br.com.jpa.crudJPA.servicesCrud.CrudDepartment;
import br.com.jpa.crudJPA.servicesCrud.CrudEmployee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@SpringBootApplication
@EnableJpaRepositories
public class CrudJpaApplication implements CommandLineRunner {

	private boolean system = true;
	private final CrudEmployee crudEmployee;
	private final CrudDepartment crudDepartment;

	public CrudJpaApplication(CrudEmployee crudEmployee, CrudDepartment crudDepartment) {
		this.crudEmployee = crudEmployee;
		this.crudDepartment = crudDepartment;
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		while (system) {
			System.out.println("Qual ação você quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Funcionário");
			System.out.println("2 - Departamento");

			Integer function = sc.nextInt();

			switch (function) {
				case 1:
					crudEmployee.inicial(sc);
					break;
				case 2:
					crudDepartment.inicial(sc);
					break;
				default:
					System.out.println("Finalizando");
					break;
			}
		}
	}
}
