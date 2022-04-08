package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import objetos.Dados;
import objetos.Anfitriao;
import objetos.Hospede;

public class Cadastro extends JFrame implements ActionListener{

		Anfitriao anf = new Anfitriao();
		Hospede hos = new Hospede();
		Dados dados = new Dados(); 
		JButton login = new JButton("Login");
		JButton cadastrar = new JButton("Criar Conta Anfitrião");
		JButton cadastrarH = new JButton("Criar Conta Hospede");
		JTextField nome = new JTextField(30);
		JTextField cpf = new JTextField(11);
		JTextField telefone = new JTextField(11);
		JPasswordField senha = new JPasswordField(30);
		String name;
		String c;
		String tel;
		char s[];
		String sen;
		
			public void cadastro() {
				 JFrame jfrm = new JFrame("Aluguel Por Temporada");
				 jfrm.setLayout(new GridBagLayout());
				 jfrm.setSize(900,500);			//tamanho jframe
				 

				 
				 GridBagConstraints gbc = new GridBagConstraints();		//criando gridbag
				 
				 //recebe nome usuario
				 JLabel label1 = new JLabel("Nome:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 0;
				 jfrm.add(label1, gbc);
				 
				 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 1;
				 jfrm.add(nome, gbc);
				 
				 
				 //recebe CPF usuario
				 JLabel label2 = new JLabel("CPF:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 2;
				 jfrm.add(label2, gbc);
			
				 
				 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 3;
				 jfrm.add(cpf, gbc);
				 
				 
				 //recebe telefone usuario
				 JLabel label3 = new JLabel("Telefone:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 4;
				 jfrm.add(label3, gbc);
				 
				 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 5;
				 jfrm.add(telefone, gbc);
				 
				 JLabel label4 = new JLabel("Senha:"); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 6;
				 jfrm.add(label4, gbc);
				 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 7;
				 jfrm.add(senha, gbc);
				 
				 //pula a linha
				 JLabel label5 = new JLabel(" "); 
				 gbc.fill = GridBagConstraints.HORIZONTAL;
				 gbc.gridx = 0;
				 gbc.gridy = 8;
				 jfrm.add(label5, gbc);
				 
				 //adiciona os botoes
				 gbc.gridx = 0;
				 gbc.gridy = 9;
				 jfrm.add(cadastrar, gbc);
				 
				 gbc.gridx = 0;
				 gbc.gridy = 10;
				 jfrm.add(cadastrarH, gbc);
				 
				 
				 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 cadastrar.addActionListener(this);
				 cadastrarH.addActionListener(this);
				 
				 jfrm.setVisible(true); 
				 
			}
			
			public void actionPerformed(ActionEvent e) {
				name = nome.getText();			//adiciona o nome a uma variavel
				tel = telefone.getText();
				c = cpf.getText();
				s = senha.getPassword();
				
				
				//se opcao selecionada for cadastrar anfitriao
				if (e.getSource() == cadastrar) {
					anf.setNome(name);
					anf.setSenha(s);
					
					if (c.length()==11) {
						anf.setCPF(c);
						if (tel.length()<=11 && tel.length()>=10) {
							anf.setTelefone(tel);
							dados.adicionaAn(anf);
							String mensagem2 = "Usuário cadastrado com sucesso";
							JOptionPane.showMessageDialog(null, mensagem2);
							
						}
						else {
							String mensagem2 = "telefone inválido";
							JOptionPane.showMessageDialog(null, mensagem2);
						}
					}
					else {
						String mensagem = "CPF Inválido";
						JOptionPane.showMessageDialog(null, mensagem);
					}
					
					
				}
				
				//se opcao selecionada for cadastrar hospede
				if (e.getSource() == cadastrarH) {
					
					hos.setNome(name);
					hos.setSenha(s);
						
						if (c.length()==11) {
							hos.setCPF(c);
							
							if (tel.length()<=11 && tel.length()>=10) {
								hos.setTelefone(tel);
								dados.adicionaHos(hos);
								String mensagem2 = "Usuário cadastrado com sucesso";
								JOptionPane.showMessageDialog(null, mensagem2);
								
								
							}
							else {
								String mensagem2 = "telefone inválido";
								JOptionPane.showMessageDialog(null, mensagem2);
							}
						}
						else {
							String mensagem = "CPF Inválido";
							JOptionPane.showMessageDialog(null, mensagem);
						}
						
					
				}
				
			}
			
			
			
			public Cadastro() {
				
			}
			
}
