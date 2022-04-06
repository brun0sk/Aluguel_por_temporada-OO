package objetos;

public class Data {
	protected int dia;
	protected int mes;
	protected int ano;
	
	public Data(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
	}
	
	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;
	}
	public int getdia() {
		return dia;
	}
	
	public void setdia(int dia) {
		this.dia = dia;
	}
	
	public int getmes() {
		return mes;
	}
	
	public void setmes(int mes) {
		this.mes = mes;
	}
	
	public int getano() {
		return ano;
	}
	
	public void setano(int ano) {
		this.ano = ano;
	}
	
}
