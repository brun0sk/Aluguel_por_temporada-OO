package objetos;

import java.util.Scanner;
import interfac.Menu;
import interfac.Cadastro;
import interfac.CadastroImovel;


public class main {
	
	static Scanner ler = new Scanner(System.in);
	
	static Dados dados = new Dados();
	
	static Anfitriao anfitriao = new Anfitriao();
	static Anfitriao anfitriao2  = new Anfitriao();
	static Hospede hospede = new Hospede();
	static Hospede hospede2 = new Hospede();
	static Imoveis imovel = new Imoveis();
	
	
	static Cadastro cadastro = new Cadastro();
	static Menu principal = new Menu();
	static CadastroImovel imov = new CadastroImovel();

	public static void main(String[] args) {
		
		//criando dados pre cadastrados
		anfitriao.setNome("Guilherme");
		anfitriao.setCPF("08080808080");
		anfitriao.setTelefone("61999999999");
		char se[] = {'a','b'};
		anfitriao.setSenha(se);
		dados.adicionaAn(anfitriao);
		
		anfitriao2.setNome("Fagner");
		anfitriao2.setCPF("02002002002");
		anfitriao2.setTelefone("61888888888");
		anfitriao2.setSenha(se);
		dados.adicionaAn(anfitriao2);
		
		
		hospede.setNome("Maria");
		hospede.setCPF("12345678910");
		hospede.setTelefone("61777777777");
		hospede.setSenha(se);
		dados.adicionaHos(hospede);
		
		hospede2.setNome("Maicon");
		hospede2.setCPF("13245678911");
		hospede2.setTelefone("61000000000");
		hospede2.setSenha(se);
		dados.adicionaHos(hospede2);
		
		imovel.setcategoriaDoImovel(false);
		imovel.setcidade("Brasilia");
		imovel.setendereco("taguatinga centro");
		imovel.setcpfAnf("08080808080");
		imovel.setnumeroComodos(2);
		imovel.setvalorDiaria(150.50);
		imovel.setidImovel(1);
		
		
		cadastro.cadastro();
		principal.menu();
		System.out.print("digite 1 para cadastrar anfitrião");
		int in = ler.nextInt();
		if (in == 1) {
			anfitriao.cadastrarAnfitriaoteste();
			
			System.out.print(anfitriao.getNome());
		}

	}

}
