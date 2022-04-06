package objetos;

public class Aluguel extends Data{

	public Aluguel(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
	}
	
	public Aluguel() {
		
	}
	
	static void cadastrar(){
		
	}
	
	static void editar() {
		
	}
	
	static void deletar() {
		
	}
	
	static void calcular_Diaria() {
		
	}
	
	public boolean validaData(int d, int m, int a) {
		if (d>31 || d<0) {
			return false;
		}
		if (m>12 || m<0) {
			return false;
		}
		
		if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 ) {
			if(m>31) {
				return false;
			}
		}
		else {
			if(m==2) {
		        if(a % 400 == 0){
		            System.out.println(a + " é bissexto.");

		        } else if((a % 4 == 0) && (a % 100 != 0)){
		            System.out.println(a + " é bissexto.");
		        } else{
		            System.out.println(a + " não é bissexto");
		            return false;
		        }
			}
			else {
				if(d>30) {
					return false;
				}
			}
		}
		
		return true;
		
	}

}
