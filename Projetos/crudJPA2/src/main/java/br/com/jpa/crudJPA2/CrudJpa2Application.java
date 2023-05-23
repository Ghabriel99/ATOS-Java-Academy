package br.com.jpa.crudJPA2;

import br.com.jpa.crudJPA2.services.ClasseCrud;
import br.com.jpa.crudJPA2.services.ProfessorCrud;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CrudJpa2Application implements CommandLineRunner {

	private boolean system = true;

	private final ProfessorCrud crudProfessor;

	private final ClasseCrud crudClasse;

	public CrudJpa2Application(ProfessorCrud crudProfessor, ClasseCrud classeCrud) {
		this.crudClasse = classeCrud;
		this.crudProfessor = crudProfessor;
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudJpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		while (system) {
			System.out.println("Qual ação você quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Classe");
			System.out.println("2 - Professor");

			Integer function = sc.nextInt();

			switch (function) {
				case 1:
					crudClasse.inicial(sc);
					break;
				case 2:
					crudProfessor.inicial(sc);
					break;
				default:
					System.out.println("Finalizando");
					break;
			}
		}
	}
}
