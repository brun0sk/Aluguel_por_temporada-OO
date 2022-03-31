package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Menu {
	
	JButton login = new JButton("Login");
	JButton cadastrar = new JButton("Criar Conta");
	
		public void menu() {
			 JFrame jfrm = new JFrame("Aluguel Por Temporada");
			 jfrm.setLayout(new GridBagLayout());
			 jfrm.setSize(900,500);			//tamanho jframe
			 
			 GridBagConstraints gbc = new GridBagConstraints();		//criando gridbag
			 
			 gbc.fill = GridBagConstraints.HORIZONTAL;
			 gbc.gridx = 0;
			 gbc.gridy = 0;
			 jfrm.add(login, gbc);
			 
			 gbc.fill = GridBagConstraints.HORIZONTAL;
			 gbc.gridx = 1;
			 gbc.gridy = 0;
			 jfrm.add(cadastrar, gbc);
			 
			 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 jfrm.setVisible(true); 
			 
		}
		
		public Menu(){
			
		}
}
