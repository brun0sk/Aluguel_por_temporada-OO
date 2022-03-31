package objetos;

import java.util.Scanner;
import interfac.Menu;
import interfac.Cadastro;


public class main {
	
	static Scanner ler = new Scanner(System.in);
	
	static Anfitriao anfitriao = new Anfitriao();
	static Cadastro principal = new Cadastro();

	public static void main(String[] args) {
		principal.cadastro();
		System.out.print("digite 1 para cadastrar anfitrião");
		int in = ler.nextInt();
		if (in == 1) {
			anfitriao.cadastrarAnfitriaoteste();
			
			System.out.print(anfitriao.getNome());
		}

	}

}
