package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import objetos.Dados;
import java.util.ArrayList;


public class Menu {
	
	JButton criar = new JButton("Criar conta");
	JButton cadastrar = new JButton("Cadastrar novo imovel");
	Dados dados = new Dados();
	ScrollPane listaScroll = new ScrollPane();
	
	
	
	
		public void menu() {
			 JFrame jfrm = new JFrame("Aluguel Por Temporada");
			 jfrm.setLayout(new BorderLayout());
			 
			 ArrayList <String> list = new ArrayList <String>();
			 
			 
			 
			 JPanel panel1 = new JPanel();		//usado para adicionar mais elementos a uma regiao
			 
			 panel1.setLayout(new FlowLayout());
			 
			 panel1.add(criar);		//adiciona botao ao panel1
			 panel1.add(cadastrar);		//adiciona botao ao panel1
			 
			 
			 
			 jfrm.add(panel1, BorderLayout.NORTH);
			 

			 jfrm.setSize(900,500);			//tamanho jframe
			 
			 

			 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 jfrm.setVisible(true); 
			 
		}
		
		public Menu(){
			
		}
}
