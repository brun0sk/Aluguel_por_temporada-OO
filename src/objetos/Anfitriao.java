package objetos; 

import java.util.Scanner;


public class Anfitriao extends Pessoa {
	static Scanner ler = new Scanner(System.in);
	//atributos
	String idAnfitri�o;
	
	public String getId() {
		return idAnfitri�o;
	}
	
	public void setId(String idAnfitri�o) {
		this.idAnfitri�o = idAnfitri�o;
	}
	
	
	public Anfitriao(String n, String c, int t) {
		nome = n;
		CPF = c;
		telefone = t;
		
	}
	
	public Anfitriao() {
		
	}
	
	public void cadastrarAnfitriaoteste(){
		System.out.print("Digite seu nome: ");
		String n = ler.nextLine();
		this.setNome(n);
		

		do{
			System.out.println("Digite seu cpf: ");
			String cpf = ler.nextLine();
		
			if(cpf.length() == 11){ 
				this.setCPF(cpf);
				break;
			}else{
				System.out.println();
				System.out.println("Cpf Inv�lido!");
				System.out.println();
			}	
		}while(true);
		
	}
	
	static void editar() {
		
	}
	
	static void deletar() {
		
	}
	
}
