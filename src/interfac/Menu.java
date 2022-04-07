package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import objetos.Dados;
import java.util.ArrayList;
import objetos.Imoveis;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Menu {
	
	JButton criar = new JButton("Criar conta");
	JButton cadastrar = new JButton("Cadastrar novo imovel");
	JButton deletar = new JButton("Deletar Conta");
	JLabel label = new JLabel();
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
			 JSplitPane split = new JSplitPane();
			 
			 
			 panel1.setLayout(new FlowLayout());
			 
			 panel1.add(criar);		//adiciona botao ao panel1
			 panel1.add(cadastrar);		//adiciona botao ao panel1
			 panel1.add(deletar);
			 
			 JScrollPane scroll = new JScrollPane(list);
			 split.setLeftComponent(scroll);
			 
			 JPanel panel2 = new JPanel();
			 
			 //mostra tela de aluguel quando imovel e selecionado
			 list.addListSelectionListener(new ListSelectionListener() {
				 public void valueChanged(ListSelectionEvent e) {
					 JPanel panel3 = new JPanel();
					 panel3.setLayout(new GridLayout(4,4));
					 
					 ArrayList <Imoveis> imov = new ArrayList<Imoveis>();
					 String Selected = (String) list.getSelectedValue();
					 label.setText(Selected);
	 
					 
					 imov = dados.procuraId(Selected);
					 imov.get(0);
					 
					 
					 JLabel pr = new JLabel("Preço: " + imov.get(0).getvalorDiaria());
					 panel3.add(pr);
					 JLabel cm = new JLabel("Numero de Comodos: " + imov.get(0).getnumeroComodos());
					 panel3.add(cm);
					 JLabel des = new JLabel("Descrição: " + imov.get(0).getdescricaoImovel());
					 panel3.add(des);
					 JLabel end = new JLabel("Endereço: " + imov.get(0).getendereco());
					 panel3.add(end);
					 
					 
					 JButton al = new JButton("Alugar Imovel");
					 JButton del = new JButton("Deletar Imovel");
					 
					 panel3.add(al);
					 panel3.add(del);

					 
					 split.setRightComponent(label);
					 split.setRightComponent(panel3);
				 }
			 });
			 
			 jfrm.add(panel1, BorderLayout.NORTH);
			 jfrm.add(split, BorderLayout.CENTER);
			 

			 jfrm.setSize(1200,700);			//tamanho jframe
			 
			 

			 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 jfrm.setVisible(true); 
			 
		}
		
		 
		
		public Menu(){
			
		}
}
