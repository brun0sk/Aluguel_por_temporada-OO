package objetos;

import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Aluguel extends Data{
	
	boolean valorEst;	//valor total estadia

	public Aluguel(int d, int m, int a, int df, int mf, int af, boolean v) {
		dia = d;
		mes = m;
		ano = a;
		diaf = df;
		mesf = mf;
		anof = af;
		valorEst = v;
	}
	
	public Aluguel() {
		
	}
	
	
	//calcula valor a ser pago
	public double calcular_Diaria(String d1, String d2, double valor) throws Exception{
		
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date firstDate = sdf.parse(d1);
        Date secondDate = sdf.parse(d2);

        long diff = secondDate.getTime() - firstDate.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        
        double pagamento = diffrence *valor;
        
        return pagamento;
		
		
	}
	
	public boolean bissesto(int a) {
		
	        if(a % 400 == 0){
	            return true;

	        } else if((a % 4 == 0) && (a % 100 != 0)){
	            return true;
	        } else{
	            return false;
	        }
		}
	
	public int[] stringData(String da) {
		String [] reparte = da.split("/");
		String le;
		int [] d = new int [3];
		for (int i = 0; i<reparte.length; i++) {
			le = reparte[i];
			d[i] = (Integer.parseInt(le));
		}
		return d;
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
		        boolean bi = bissesto(a);
		        if (d>29) {
		        	return false;
		        }
		        else {
		        	if (d==29 && bi == false) {
		        		return false;
		        	}
		        	else {
		        		return true;
		        	}
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
