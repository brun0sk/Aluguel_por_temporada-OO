package interfac;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import objetos.Dados;
import objetos.Anfitriao;
import objetos.Imoveis;

public class CadastroImovel extends JFrame implements ActionListener{
	Anfitriao anf = new Anfitriao();
	Dados dados = new Dados(); 
	Imoveis imoveis = new Imoveis();
	JButton login = new JButton("Login");
	JButton cadastrarCas = new JButton("Adicionar Casa");
	JButton cadastrarAp = new JButton("Adicionar Apartamento");
	JTextField cidade = new JTextField(11);
	JTextField endereco = new JTextField(30);
	JTextField valor = new JTextField(11);
	JTextField comodos = new JTextField(11);
	JTextField cpf = new JTextField(11);
	JTextField descricao = new JTextField(30);
	JPasswordField senha = new JPasswordField(30);
	String city;
	String c;
	String en;
	String preco;
	String com;
	char s[];
	String sen;
	String des;
	
	//diferencia casa e apartamento
	boolean apartamento = true;
	boolean casa = false;
	
	public void cadastrarImovel() {
		 JFrame jfrm = new JFrame("Aluguel Por Temporada");
		 jfrm.setLayout(new GridBagLayout());
		 jfrm.setSize(900,500);			//tamanho jframe
		 

		 
		 GridBagConstraints gbc = new GridBagConstraints();		//criando gridbag
		 
		 //recebe nome usuario
		 JLabel label1 = new JLabel("Cidade:"); 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 0;
		 jfrm.add(label1, gbc);
		 
		 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 1;
		 jfrm.add(cidade, gbc);
		 
		 
		 //recebe CPF usuario
		 JLabel label2 = new JLabel("Endereço:"); 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 2;
		 jfrm.add(label2, gbc);
	
		 
		 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 3;
		 jfrm.add(endereco, gbc);
		 
		 
		 //recebe telefone usuario
		 JLabel label3 = new JLabel("Valor Diária:"); 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 4;
		 jfrm.add(label3, gbc);
		 
		 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 5;
		 jfrm.add(valor, gbc);
		 
		 JLabel label4 = new JLabel("Insira o número de comodos:"); 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 6;
		 jfrm.add(label4, gbc);
		 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 7;
		 jfrm.add(comodos, gbc);
		 
		 JLabel label8 = new JLabel("Descrição:"); 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 8;
		 jfrm.add(label8, gbc);
		 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 9;
		 jfrm.add(descricao, gbc);
		 
		 JLabel label7 = new JLabel("CPF:");
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 10;
		 jfrm.add(label7, gbc);
		 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 11;
		 jfrm.add(cpf, gbc);
		 
		 JLabel label6 = new JLabel("Senha:"); 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 12;
		 jfrm.add(label6, gbc);
		 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 13;
		 jfrm.add(senha, gbc);
		 
		 //pula a linha
		 JLabel label5 = new JLabel(" "); 
		 gbc.fill = GridBagConstraints.HORIZONTAL;
		 gbc.gridx = 0;
		 gbc.gridy = 14;
		 jfrm.add(label5, gbc);
		 
		 //adiciona os botoes
		 gbc.gridx = 0;
		 gbc.gridy = 15;
		 jfrm.add(cadastrarCas, gbc);
		 
		 gbc.gridx = 0;
		 gbc.gridy = 16;
		 jfrm.add(cadastrarAp, gbc);
		 
		 
		 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 cadastrarCas.addActionListener(this);
		 cadastrarAp.addActionListener(this);
		 
		 
		 jfrm.setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent e) {
		city = cidade.getText();
		c = cpf.getText();
		en = endereco.getText();
		preco = valor.getText();
		double p = Double.parseDouble(preco);		//transforma entrada do preco em float
		com = comodos.getText();
		int co = Integer.parseInt(com);			//transforma entrada numero de comodos em int
		s = senha.getPassword();
		
		
		boolean tipo;		//define se o imovel e casa ou apartamento
		boolean condi = dados.verificaLogA(c, s);
		
		if(condi==false) {
			String mensagem = "CPF ou senha inválidos";
			JOptionPane.showMessageDialog(null, mensagem);
		}
		
		if(e.getSource() == cadastrarCas && condi==true) {
			tipo = false;	//false para casa
			imoveis.setcategoriaDoImovel(tipo);
			imoveis.setcidade(city);
			imoveis.setcpfAnf(c);
			imoveis.setnumeroComodos(co);
			imoveis.setvalorDiaria(p);
			imoveis.setendereco(en);
		}
		
		if(e.getSource() == cadastrarAp && condi==true) {
			tipo = true;	//true para apartamento
			imoveis.setcategoriaDoImovel(tipo);
			imoveis.setcidade(city);
			imoveis.setcpfAnf(c);
			imoveis.setnumeroComodos(co);
			imoveis.setvalorDiaria(p);
			imoveis.setendereco(en);
			
		}
		
	}

	
	public CadastroImovel() {
		
	}
}
