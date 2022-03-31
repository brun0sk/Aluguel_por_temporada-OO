package objetos;

import java.util.Scanner;

public class Hospede extends Pessoa {
	static Scanner ler = new Scanner(System.in);
	
	
	public Hospede(String n, String c, int t) {
		nome = n;
		CPF = c;
		telefone = t;
		
	}
	
	
	public void cadastrarHospedeteste(){
		System.out.print("Digite seu nome: ");
		String n = ler.toString();
		this.setNome(n);
		

		do{
			System.out.println("Digite seu CPF: ");
			String cpf = ler.nextLine();
		
			if(cpf.length() == 11){ 

				break;
			}else{
				System.out.println();
				System.out.println("CPF Inválido!");
				System.out.println();
			}	
		}while(true);
		
		do{
			System.out.println("Digite seu CPF: ");
			String cpf = ler.nextLine();
		
			if(cpf.length() == 11){ 

				break;
			}else{
				System.out.println();
				System.out.println("CPF Inválido!");
				System.out.println();
			}	
		}while(true);
		
	
		
	}
	
	static void editar() {
		
	}
	
	static void deletar() {
		
	}
	
}
