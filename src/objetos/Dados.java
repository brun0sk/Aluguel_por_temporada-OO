package objetos;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;


public class Dados {
	
	static Anfitriao anfitriao = new Anfitriao();
	static Anfitriao anfitriao2  = new Anfitriao();
	static Hospede hospede = new Hospede();
	static Hospede hospede2 = new Hospede();
	static Imoveis imovel = new Imoveis();

	
	static ArrayList<Anfitriao> listaDeAnfitriaos = new ArrayList<>();
	
	static ArrayList<Hospede> listaDeHospedes = new ArrayList<>();
	
	static ArrayList<Imoveis> listaDeImoveis = new ArrayList<>();
	
	static ArrayList<Imoveis> listaDeImoveisAlugados = new ArrayList<>();
	

	public void adicionaAn(Anfitriao a) {
		listaDeAnfitriaos.add(a);
		int nu = 0;
		for(int i = 0; i<listaDeAnfitriaos.size(); i++) {
			System.out.print(listaDeAnfitriaos.get(nu).getCPF());
			nu = nu + 1;
			System.out.print("\n");
			}
		
	}
	
	public void adicionaHos(Hospede h){
		listaDeHospedes.add(h);
		for(int i = 0; i<listaDeHospedes.size(); i++) {
			System.out.print(listaDeHospedes.get(i).getSenha());
			}
	}
	
	public void adicionarImo(Imoveis I) {
		listaDeImoveis.add(I);
		for(int i = 0; i<listaDeImoveis.size(); i++) {
			System.out.print(listaDeImoveis.get(i).getcidade());
		}
	}
	
	//utilizado para verificar login do anfitriao
	public boolean verificaLogA(String cpf, char[] senha) {
		System.out.print(listaDeAnfitriaos.size());
		for (int i = 0; i<listaDeAnfitriaos.size(); i++) {
			
			if (cpf.equals(listaDeAnfitriaos.get(i).getCPF())) {
				System.out.print("atumalaca");
				return Arrays.equals(listaDeAnfitriaos.get(i).getSenha(),senha);

			}
		}
		return false;
	}
	
	public ArrayList<String> retornaDescricao() {
		ArrayList <String> listaDescricao = new ArrayList<>();
		for (int i = 0; i<listaDeImoveis.size(); i++) {
			listaDescricao.add(listaDeImoveis.get(i).getdescricaoImovel());
		}
		return listaDescricao;
	}
	
	public String titulo(JList <String> e) {
		String resi;
		String title;
		String m = "";
		
		for (int i = 0; i<listaDeImoveis.size(); i++) {
			
			String cp = listaDeImoveis.get(i).getcidade();
			boolean bo = listaDeImoveis.get(i).getcategoriaDoImvel();
			if (bo == true) {
				resi = "apartamento";
			}
			else {
				resi = "casa";
			}
			
			int como = listaDeImoveis.get(i).getnumeroComodos();
			String num = Integer.toString(como);
			
			title = resi + " " + num + " Quartos " + cp;
			
		}
		return m;
		
	}
	
	public int criaId() {
		int id = listaDeImoveis.size();
		return id;
	}
	
}
