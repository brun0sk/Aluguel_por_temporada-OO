package objetos;

public class Data {
	protected int dia;
	protected int mes;
	protected int ano;
	protected int diaf;
	protected int mesf;
	protected int anof;
	
	public Data(int d, int m, int a, int df, int mf, int af) {
		dia = d;
		mes = m;
		ano = a;
		diaf = df;
		mesf = mf;
		anof = af;
	}
	
	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;
		diaf = 0;
		mesf = 0;
		anof = 0;
	}
	public int getdiaf() {
		return diaf;
	}
	
	public void setdiaf(int diaf) {
		this.diaf = diaf;
	}
	
	public int getmesf() {
		return mesf;
	}
	
	public void setmesf(int mesf) {
		this.mesf = mesf;
	}
	
	public int getanof() {
		return anof;
	}
	
	public void setanof(int anof) {
		this.anof = anof;
	}
	
	public int getdia() {
		return dia;
	}
	
	public void setdia(int diaf) {
		this.dia = diaf;
	}
	
	public int getmes() {
		return mes;
	}
	
	public void setmes(int mesf) {
		this.mes = mesf;
	}
	
	public int getano() {
		return ano;
	}
	
	public void setano(int anof) {
		this.ano = anof;
	}
	
}
