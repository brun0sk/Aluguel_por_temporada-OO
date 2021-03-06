package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import objetos.Dados;
import java.util.ArrayList;
import objetos.Imoveis;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import objetos.Aluguel;

public class Menu extends JFrame implements ActionListener{
	
	JButton criar = new JButton("Criar conta");
	JButton cadastrar = new JButton("Cadastrar novo imovel");
	JButton deletar = new JButton("Deletar Conta");
	JLabel label = new JLabel();
	Dados dados = new Dados();
	ScrollPane listaScroll = new ScrollPane();
	static CadastroImovel cada = new CadastroImovel();
	static Cadastro cr = new Cadastro();
	static Deletar del = new Deletar();
	static Alugar alu = new Alugar();
	
	
	
	
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
					 
					 //panel que sera colocado selecionar dia
					 JPanel panel4 = new JPanel();
					 panel4.setLayout(new GridLayout(2,2));
					 
					 
					 ArrayList <Imoveis> imov = new ArrayList<Imoveis>();
					 String Selected = (String) list.getSelectedValue();
					 

					 label.setText(Selected);
	 
					 
					 imov = dados.procuraId(Selected);
					 imov.get(0);
					 
					 alu.recebeD(imov);
					 
					 
					 JLabel pr = new JLabel("Pre?o: " + imov.get(0).getvalorDiaria());
					 panel3.add(pr);
					 JLabel cm = new JLabel("Numero de Comodos: " + imov.get(0).getnumeroComodos());
					 panel3.add(cm);
					 JLabel des = new JLabel("Descri??o: " + imov.get(0).getdescricaoImovel());
					 panel3.add(des);
					 JLabel end = new JLabel("Endere?o: " + imov.get(0).getendereco());
					 panel3.add(end);
					 
					 
					 JTextField data1= new JTextField();
					 JTextField data2 = new JTextField();
					 JLabel dt = new JLabel("Insira data de inicio mes/dia/ano:");
					 JLabel dtf = new JLabel("Insira data final mes/dia/ano:");
					 
					 panel4.add(dt);
					 panel4.add(data1);
					 panel4.add(dtf);
					 panel4.add(data2);
					 
					 JButton al = new JButton("Alugar Imovel");
					 JButton del = new JButton("Deletar Imovel");
					 
					 //quando apertado deleta o imovel
					 del.addActionListener(new ActionListener(){
						 public void actionPerformed (ActionEvent event) {
							 dados.deletarImovel(Selected);
							 menu();
							 jfrm.dispose();
						 }
					 });
					 
					 al.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent Event) {
							String di;
							String df;
							String [] data = new String[2];
							
							di = data1.getText();
							df = data2.getText();
							
							data[0] = di;
							data[1] = df;
							
							alu.recebeData(data);
							
							alu.aluga();
							jfrm.dispose();
						}
						
					 });
					 
					 panel3.add(panel4);
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
			 
			 criar.addActionListener(this);
			 cadastrar.addActionListener(this);
			 deletar.addActionListener(this);
			 
			 jfrm.setVisible(true); 
		 
		}
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cadastrar) {
				cada.cadastrarImovel();
			}
			if (e.getSource() == criar) {
				cr.cadastro();
			}
			if (e.getSource() == deletar) {
				del.deleta();
			}
		}
		
		 
		
		public Menu(){
			
		}
}
