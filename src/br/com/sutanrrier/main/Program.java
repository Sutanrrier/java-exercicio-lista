package br.com.sutanrrier.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.sutanrrier.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		//Os comandos "sc.nextLine()" servem para consumir a quebra de linha gerada pelo nextInt();
		
		int quantidade_funcionarios;
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos funcionários serão registrados: ");
		quantidade_funcionarios = sc.nextInt();
		sc.nextLine(); 
		
		//Criação dos Funcionários
		for(int i=1; i<=quantidade_funcionarios; i++) {
			System.out.println("\nFuncionário #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine(); 
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		}
		
		//Buscar funcionário para aumento
		System.out.print("\nDigite o id do empregado que terá o aumento de salário: ");
		int id_empregado = sc.nextInt();
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getId() == id_empregado) {
				System.out.print("Informe a porcentagem de aumento: ");
				double porcentagem_aumento = sc.nextDouble();
				funcionario.aumentoSalario(porcentagem_aumento);
			}
		}
		
		//Exibe todos os funcionários registrados na nossa Lista
		System.out.println("\nLista de Funcionários");
		for(Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}

}
