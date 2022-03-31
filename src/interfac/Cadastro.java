package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cadastro {

		
		JButton login = new JButton("Login");
		JButton cadastrar = new JButton("Criar Conta Anfitrião");
		JButton cadastrarH = new JButton("Criar Conta Hospede");
		
			public void cadastro() {
				 JFrame jfrm = new JFrame("Aluguel Por Temporada");
				 jfrm.setLayout(new GridBagLayout());
				 jfrm.setSize(900,500);			//tamanho jframe
				 
				 String name;
				 String c;
				 String tel;
				 
				 GridBagConstraints gbc = new GridBagConstraints();		//criando gridbag
				 
				 //recebe nome usuario
				 JLabel label1 = new JLabel("Nome:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 0;
				 jfrm.add(label1, gbc);
				 
				 JTextField nome = new JTextField(30);
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 1;
				 jfrm.add(nome, gbc);
				 name = nome.getText();			//adiciona o nome a uma variavel
				 
				 //recebe CPF usuario
				 JLabel label2 = new JLabel("CPF:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 2;
				 jfrm.add(label2, gbc);
			
				 
				 JTextField cpf = new JTextField(11);
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 3;
				 jfrm.add(cpf, gbc);
				 c = cpf.getText();
				 
				 //recebe telefone usuario
				 JLabel label3 = new JLabel("Telefone:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 4;
				 jfrm.add(label3, gbc);
				 
				 JTextField telefone = new JTextField(11);
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 5;
				 jfrm.add(telefone, gbc);
				 tel = telefone.getText();
				 
				 //pula a linha
				 JLabel label4 = new JLabel(" "); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 6;
				 jfrm.add(label4, gbc);
				 
				 //adiciona os botoes
				 gbc.gridx = 0;
				 gbc.gridy = 7;
				 jfrm.add(cadastrar, gbc);
				 
				 gbc.gridx = 0;
				 gbc.gridy = 8;
				 jfrm.add(cadastrarH, gbc);
				 
				 
				 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 
				 jfrm.setVisible(true); 
				 
			}
			
			
			
			public Cadastro() {
				
			}
			
}
