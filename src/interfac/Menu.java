package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import objetos.Dados;
import java.util.ArrayList;
import objetos.Imoveis;


public class Menu {
	
	JButton criar = new JButton("Criar conta");
	JButton cadastrar = new JButton("Cadastrar novo imovel");
	JButton deletar = new JButton("Deletar Conta");
	Dados dados = new Dados();
	ScrollPane listaScroll = new ScrollPane();
	
	
	
	
		public void menu() {
			 JFrame jfrm = new JFrame("Aluguel Por Temporada");
			 jfrm.setLayout(new BorderLayout());
			 
			 ArrayList <String> titul = new ArrayList<String>();	//recebe os titulos do anuncio
			 
			 
			 dados.titulo(titul); 		//adiciona os titulos ao array
			 
			 String [] str = new String[titul.size()];
			 
			 JList <String> list = new JList<> (titul.toArray(str));
			 
			 
			 JPanel panel1 = new JPanel();		//usado para adicionar mais de um elementos a uma regiao
			 
			 panel1.setLayout(new FlowLayout());
			 
			 panel1.add(criar);		//adiciona botao ao panel1
			 panel1.add(cadastrar);		//adiciona botao ao panel1
			 panel1.add(deletar);
			 
			 JScrollPane scroll = new JScrollPane(list);
			 
			 
			 jfrm.add(panel1, BorderLayout.NORTH);
			 jfrm.add(scroll, BorderLayout.CENTER);
			 

			 jfrm.setSize(900,500);			//tamanho jframe
			 
			 

			 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 jfrm.setVisible(true); 
			 
		}
		
		public Menu(){
			
		}
}
