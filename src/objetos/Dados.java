package objetos;

import java.util.ArrayList;

public class Dados {

	
	ArrayList<Anfitriao> listaDeAnfitriaos = new ArrayList<>();
	
	ArrayList<Hospede> listaDeHospedes = new ArrayList<>();
	
	ArrayList<Imoveis> listaDeImoveis = new ArrayList<>();
	
	ArrayList<Imoveis> listaDeImoveisAlugados = new ArrayList<>();
	
	
	
	
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
		for (int i = 0; i<listaDeAnfitriaos.size(); i++) {
			System.out.print("atumalaca");
			if (cpf.equals(listaDeAnfitriaos.get(i).getCPF())) {
				if (senha.equals(listaDeAnfitriaos.get(i).getSenha())) {
					System.out.print("atumalaca");
					return true;	//se estiver correto return true
			
				}
				
				else{
					return false;	//se errado false
				}
			}
		}
		return false;
	}
	
}
