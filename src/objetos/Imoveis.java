package objetos;

public class Imoveis {
	
	String cidade;
	String endereco;
	double valorDiaria;
	int numeroComodos;
	String cpfAnfi;
	String descricaoImovel;
	String reservasCadastradas[];
	boolean categoriaImovel;	//se true apartamento se false casa
	
	public Imoveis(String cid, String end, double valor, int numero, String cpf, String descricao, boolean cat) {
		cidade = cid;
		endereco = end;
		valorDiaria = valor;
		numeroComodos = numero;
		cpfAnfi = cpf;
		descricaoImovel = descricao;
		categoriaImovel = cat;
		
	}
	
	public Imoveis() {
		
	}
	
	public String getcidade() {
		return cidade;
	}
	
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getendereco() {
		return endereco;
	}
	
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getvalorDiaria() {
		return valorDiaria;
	}
	
	public void setvalorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public int getnumeroComodos() {
		return numeroComodos;
	}
	
	public void setnumeroComodos(int numeroComodos) {
		this.numeroComodos = numeroComodos;
	}
	
	public String getcpfAnf() {
		return cpfAnfi;
	}
	
	public void setcpfAnf(String cpfAnfi) {
		this.cpfAnfi = cpfAnfi;
	}
	
	public boolean  getcategoriaDoImvel() {
		return categoriaImovel;
	}
	
	public void setcategoriaDoImovel(boolean categoriaImovel) {
		this.categoriaImovel = categoriaImovel;
	}
	
	
	static void cadastrarImoveis(){
		
	}
	
	static void editar() {
		
	}
	
	static void deletar() {
		
	}
	
}
