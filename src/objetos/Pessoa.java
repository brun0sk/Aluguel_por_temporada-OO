package objetos;

public abstract class Pessoa {
	protected String nome;
	protected String CPF;
	protected int telefone;
	
	public Pessoa(String n, String c, int t) {
		nome = n;
		CPF = c;
		telefone = t;
	}
	public Pessoa() {
		nome = "";
		CPF = "";
		telefone = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF(){
		return CPF;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
		
	}
}