package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import objetos.Dados;
import objetos.Anfitriao;
import objetos.Hospede;

import objetos.Anfitriao;
import objetos.Dados;
import objetos.Hospede;

public class Deletar extends JFrame implements ActionListener{
	Anfitriao anf = new Anfitriao();
	Hospede hos = new Hospede();
	Dados dados = new Dados(); 
	JButton login = new JButton("Login");
	JButton deletar = new JButton("Deltar Anfitrião");
	JButton deletarH = new JButton("Deletar Hospede");
	JTextField cpf = new JTextField(11);
	JPasswordField senha = new JPasswordField(30);
	String name;
	String c;
	String tel;
	char s[];
	String sen;
	
	static Menu men = new Menu();
	
		public void deleta() {
			 JFrame jfrm = new JFrame("Aluguel Por Temporada");
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
			 jfrm.add(deletar, gbc);
			 
			 gbc.gridx = 0;
			 gbc.gridy = 6;
			 jfrm.add(deletarH, gbc);
			 
			 
			 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			 deletar.addActionListener(this);
			 deletarH.addActionListener(this);
			 
			 jfrm.setVisible(true); 
			 
		}
		
		public void actionPerformed(ActionEvent e) {

			c = cpf.getText();
			s = senha.getPassword();
			
			
			//se opcao selecionada for cadastrar anfitriao
			if (e.getSource() == deletar) {
				if (dados.verificaLogA(c, s) == true) {
					dados.deletarAnfitriao(c);
					String mensagem2 = "Usuário deletado com sucesso";
					JOptionPane.showMessageDialog(null, mensagem2);
					men.menu();
					
				}
				else{
					String mensagem2 = "Usuário não encontrado";
					JOptionPane.showMessageDialog(null, mensagem2);
				}
				
				
			}
			
			//se opcao selecionada for cadastrar hospede
			if (e.getSource() == deletarH) {
				if (dados.verificaLogH(c, s) == true) {
					dados.deletarAnfitriao(c);
					String mensagem2 = "Usuário deletado com sucesso";
					JOptionPane.showMessageDialog(null, mensagem2);
					men.menu();
				}
				else{
					String mensagem2 = "Usuário não encontrado";
					JOptionPane.showMessageDialog(null, mensagem2);
				}
				
			}
			
		}
		
		public Deletar() {
			
		}
}
