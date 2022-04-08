package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import objetos.Dados;
import objetos.Anfitriao;
import objetos.Hospede;
import objetos.Imoveis;

import objetos.Anfitriao;
import objetos.Dados;
import objetos.Hospede;
import objetos.Aluguel;

public class Alugar extends JFrame implements ActionListener{
	
		Anfitriao anf = new Anfitriao();
		Hospede hos = new Hospede();
		Dados dados = new Dados(); 
		JButton login = new JButton("Login");
		JButton alugar = new JButton("Reservar");
		JTextField cpf = new JTextField(11);
		JPasswordField senha = new JPasswordField(30);
		String name;
		String c;
		char s[];
		String sen;
		static ArrayList<Imoveis> imo = new ArrayList<Imoveis>();
		static String [] datas = new String[2];
		
		Aluguel alu = new Aluguel();
		
		static Menu men = new Menu();
		
			public void aluga() {
				 JFrame jfrm = new JFrame("Alugar");
				 jfrm.setLayout(new GridBagLayout());
				 jfrm.setSize(900,500);			//tamanho jframe
				 

				 
				 GridBagConstraints gbc = new GridBagConstraints();		//criando gridbag
				 

				 
				 //recebe CPF usuario
				 JLabel label2 = new JLabel("CPF:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 0;
				 jfrm.add(label2, gbc);
			
				 
				 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 1;
				 jfrm.add(cpf, gbc);
				 
				 
				 
				 JLabel label4 = new JLabel("Senha:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 2;
				 jfrm.add(label4, gbc);
				 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 3;
				 jfrm.add(senha, gbc);
				 
				 //pula a linha
				 JLabel label5 = new JLabel(" "); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 4;
				 jfrm.add(label5, gbc);
				 
				 //adiciona os botoes
				 gbc.gridx = 0;
				 gbc.gridy = 5;
				 jfrm.add(alugar, gbc);
				 
				 
				 
				 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 alugar.addActionListener(this);
				 
				 jfrm.setVisible(true); 
				 
			}
			
			public void actionPerformed(ActionEvent e){

				c = cpf.getText();
				s = senha.getPassword();
				
				
				if (e.getSource() == alugar) {
					if (dados.verificaLogA(c, s) == true) {
						double valu = imo.get(0).getvalorDiaria();
						
						try {
							alu.calcular_Diaria(datas[0], datas[1], valu);
						}catch(Exception r) {
							System.out.println("Exception occured "+e);
						}
					}
					else{
						String mensagem2 = "Usuário não encontrado";
						JOptionPane.showMessageDialog(null, mensagem2);
					}
					
					
				}

				
			}
			
			//recebe imovel escolhido pelo usuário
			public void recebeD(ArrayList<Imoveis> I) {
				imo.add(I.get(0));

			}
			
			public void recebeData(String[] str) {
				datas = str;
			}
			
			public Alugar() {
				
			}
	}

