package objetos;

public abstract class Pessoa {
	protected String nome;
	protected String CPF;
	protected String telefone;
	protected char senha[];
	
	public Pessoa(String n, String c, String t, char[] s) {
		nome = n;
		CPF = c;
		telefone = t;
		senha = s;
	}
	public Pessoa() {
		nome = "";
		CPF = "";
		telefone = "";
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		
	}
	
	public char[] getSenha() {
		return senha;
	}
	
	public void setSenha(char[] senha) {
		this.senha = senha;
	}
}