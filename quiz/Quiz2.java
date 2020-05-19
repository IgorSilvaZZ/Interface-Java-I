package quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Quiz2 extends JFrame{
	
	private JFrame janela;
	private JPanel contentPane;
	private JLabel[] lbLabeis;
	private JRadioButton[] Opcoes;
	private ButtonGroup pergunta1;
	private ButtonGroup pergunta2;
	private ButtonGroup pergunta3;
	private ButtonGroup pergunta4;
	private ButtonGroup pergunta5;
	private ButtonGroup pergunta6;
	private ButtonGroup pergunta7;
	private ButtonGroup pergunta8;
	private ButtonGroup pergunta9;
	private ButtonGroup pergunta10;
	private int qtdacertos;
	private JScrollPane scroll;
	private JButton btJogar;
	private String nome;
	
	public Quiz2() {
		
		janela = new JFrame("Quiz sobre Programação");
	    janela.setSize(500, 500);
	    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    janela.setResizable(true);
	    
	    contentPane = new JPanel();
	    contentPane.setLayout(null);
	    contentPane.setSize(500,500);
	    contentPane.setPreferredSize(new Dimension(0,1800));
	    contentPane.setBackground(new Color(178, 190, 195));
	    
	    janela.add(contentPane);
	    scroll = new JScrollPane(contentPane);
        janela.add(scroll);
        
        lbLabeis = new JLabel[10];
		lbLabeis[0] = new JLabel("1) Qual linguagem mais usada?");
		lbLabeis[0].setBounds(12, 15, 400, 50);
		lbLabeis[0].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[0]);
		
		Opcoes = new JRadioButton[41];
		pergunta1 = new ButtonGroup();
		Opcoes[0] = new JRadioButton("Java");
		Opcoes[0].setBounds(15, 48, 100, 50);
		Opcoes[0].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[0]);
		
		
		
		Opcoes[1] = new JRadioButton("PHP");
		Opcoes[1].setBounds(15, 78, 100, 50);
		Opcoes[1].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[1]);
		
		Opcoes[2] = new JRadioButton("JavaScript");
		Opcoes[2].setBounds(15, 108, 100, 50);
		Opcoes[2].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[2]);
		
		Opcoes[3] = new JRadioButton("Python");
		Opcoes[3].setBounds(15, 138, 100, 50);
		Opcoes[3].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[3]);
		pergunta1.add(Opcoes[0]);
		pergunta1.add(Opcoes[1]);
		pergunta1.add(Opcoes[2]);
		pergunta1.add(Opcoes[3]);
		
		
		Opcoes[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[2].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		
		lbLabeis[1] = new JLabel("2) Qual linguagem é derivado do C?");
		lbLabeis[1].setBounds(12, 178, 400, 50);
		lbLabeis[1].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[1]);
		
		pergunta2 = new ButtonGroup();
		Opcoes[4] = new JRadioButton("Kotlin");
		Opcoes[4].setBounds(15, 208, 100, 50);
		Opcoes[4].setBackground(new Color (178, 190, 195));
		contentPane.add(Opcoes[4]);
		
		Opcoes[5] = new JRadioButton("CSS3");
		Opcoes[5].setBounds(15, 238, 100, 50);
		Opcoes[5].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[5]);
		
		Opcoes[6] = new JRadioButton("Html");
		Opcoes[6].setBounds(15, 268, 100, 50);
		Opcoes[6].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[6]);
		
		Opcoes[7] = new JRadioButton("Java");
		Opcoes[7].setBounds(15, 298, 100, 50);
		Opcoes[7].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[7]);
		pergunta2.add(Opcoes[4]);
		pergunta2.add(Opcoes[5]);
		pergunta2.add(Opcoes[6]);
		pergunta2.add(Opcoes[7]);
		
		Opcoes[7].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[7].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[2] = new JLabel("3) Framework criado pelo Twiiter:");
		lbLabeis[2].setBounds(12, 333, 400, 50);
		lbLabeis[2].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[2]);
		
		pergunta3 = new ButtonGroup();
		Opcoes[8] = new JRadioButton("React Native");
		Opcoes[8].setBounds(15, 363, 110, 50);
		Opcoes[8].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[8]);
		
		Opcoes[9] = new JRadioButton("Angular");
		Opcoes[9].setBounds(15, 393, 110, 50);
		Opcoes[9].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[9]);
		
		Opcoes[10] = new JRadioButton("BootStrap");
		Opcoes[10].setBounds(15, 423, 110, 50);
		Opcoes[10].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[10]);	
		
		Opcoes[11] = new JRadioButton("Spring");
		Opcoes[11].setBounds(15, 453, 110, 50);
		Opcoes[11].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[11]);
		pergunta3.add(Opcoes[8]);
		pergunta3.add(Opcoes[9]);
		pergunta3.add(Opcoes[10]);
		pergunta3.add(Opcoes[11]);
		
		
		Opcoes[10].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[10].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[3] = new JLabel("4) Qual dos grupos apresentados abaixo apresenta apenas paradigmas de programação?");
		lbLabeis[3].setBounds(15, 493, 800, 50);
		lbLabeis[3].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[3]);
		
		pergunta4 = new ButtonGroup();
		Opcoes[12] = new JRadioButton("Algol,Basic,Lógico e Orientado a Objetos");
		Opcoes[12].setBounds(15, 525, 400, 50);
		Opcoes[12].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[12]);
		
		Opcoes[13] = new JRadioButton("Orientados a Objetos,Java,Imperativo e Lógico");
		Opcoes[13].setBounds(15, 560, 400, 50);
		Opcoes[13].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[13]);
		
		Opcoes[14] = new JRadioButton("Imperativo,Funcional,Lógico e Orientado a Objetos");
		Opcoes[14].setBounds(15, 590, 400, 60);
		Opcoes[14].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[14]);
		
		Opcoes[15] = new JRadioButton("Imperativo,Programar,Lógico e Orientado a Objetos");
		Opcoes[15].setBounds(15, 630, 400, 60);
		Opcoes[15].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[15]);
		pergunta4.add(Opcoes[12]);
		pergunta4.add(Opcoes[13]);
		pergunta4.add(Opcoes[14]);
		pergunta4.add(Opcoes[15]);
		
		Opcoes[14].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[14].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[4] = new JLabel("5) Marque a opção que melhor define o conceito de Lógica na área da tecnologia?");
		lbLabeis[4].setBounds(15, 690, 800, 50);
		lbLabeis[4].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[4]);
		
		pergunta5 = new ButtonGroup();
		Opcoes[16] = new JRadioButton("Organização e planejamento das instruções, em um algoritmo, a fim de viablizar a implantação de um programação");
		Opcoes[16].setBounds(15, 720, 900, 50);
		Opcoes[16].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[16]);
		
		Opcoes[17] = new JRadioButton("Maneira rigorosa de raciocinar");
		Opcoes[17].setBounds(15, 750, 400, 50);
		Opcoes[17].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[17]);
		
		Opcoes[18] = new JRadioButton("Significa encadear uma serie de instruções para que possa chegar à solução de um problema");
		Opcoes[18].setBounds(15, 780, 800, 50);
		Opcoes[18].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[18]);
		
		Opcoes[19] = new JRadioButton("O encademento coerente de alguma coisa que obedece a certas conveções e regras");
		Opcoes[19].setBounds(15, 810, 800, 50);
		Opcoes[19].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[19]);
		pergunta5.add(Opcoes[16]);
		pergunta5.add(Opcoes[17]);
		pergunta5.add(Opcoes[18]);
		pergunta5.add(Opcoes[19]);
		
		Opcoes[16].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[16].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[5] = new JLabel("6) O que são arrays?");
		lbLabeis[5].setBounds(15, 840, 400, 50);
		lbLabeis[5].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[5]);
		
		pergunta6 = new ButtonGroup();
		Opcoes[20] = new JRadioButton("São estruturas de dados homogêneas que possibilitam o armazenamento de grupos de valores do mesmo tipo, em uma unica variavel");
		Opcoes[20].setBounds(15, 870, 1000, 50);
		Opcoes[20].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[20]);
		
		Opcoes[21] = new JRadioButton("São variaveis especificas para armazenamento de números inteiros");
		Opcoes[21].setBounds(15, 900, 500, 50);
		Opcoes[21].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[21]);
		
		Opcoes[22] = new JRadioButton("Trata-se de uma forma de planejamento do algoritmo");
		Opcoes[22].setBounds(15, 930, 500, 50);
		Opcoes[22].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[22]);
		
		Opcoes[23] = new JRadioButton("São formas de estruturar ou organizar dados na memoria RAM do computador");
		Opcoes[23].setBounds(15, 960, 600, 50);
		Opcoes[23].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[23]);
		pergunta6.add(Opcoes[20]);
		pergunta6.add(Opcoes[21]);
		pergunta6.add(Opcoes[22]);
		pergunta6.add(Opcoes[23]);
		
		
		Opcoes[20].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[20].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[6] = new JLabel("7) O que é um algoritmo?");
		lbLabeis[6].setBounds(15, 1010, 200, 30);
		lbLabeis[6].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[6]);
		
		pergunta7 = new ButtonGroup();
		Opcoes[25] = new JRadioButton("Permite realizar operações lógicas e aritméticas utilizando apenas dois digitos ou dois estados");
		Opcoes[25].setBounds(15, 1030, 800, 50);
		Opcoes[25].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[25]);
		
		Opcoes[26] = new JRadioButton("É a solução de um problema");
		Opcoes[26].setBounds(15, 1060, 400, 50);
		Opcoes[26].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[26]);
		
		Opcoes[27] = new JRadioButton("São ações ditas ao computador para ele executar");
		Opcoes[27].setBounds(15, 1090, 400, 50);
		Opcoes[27].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[27]);
		
		Opcoes[28] = new JRadioButton("Trata-se de uma sequencia de passos, conhecida como um conjunto de instruções para se chegar a um determinado objetivo");
		Opcoes[28].setBounds(15, 1120, 1000, 50);
		Opcoes[28].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[28]);
		pergunta7.add(Opcoes[25]);
		pergunta7.add(Opcoes[26]);
		pergunta7.add(Opcoes[27]);
		pergunta7.add(Opcoes[28]);
		
		Opcoes[28].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Opcoes[28].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[7] = new JLabel("8) O que significa ‘concatenar’?");
		lbLabeis[7].setBounds(15, 1170, 400, 30);
		lbLabeis[7].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[7]);
		
		pergunta8 = new ButtonGroup();
		Opcoes[29] = new JRadioButton("Unir dados de modo lógico ou manter ligação ou conexão entre eles ");
		Opcoes[29].setBounds(15, 1190, 800, 50);
		Opcoes[29].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[29]);
		
		Opcoes[30] = new JRadioButton("Dividir duas variaveis");
		Opcoes[30].setBounds(15, 1220, 800, 50);
		Opcoes[30].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[30]);
		
		Opcoes[31] = new JRadioButton("Trata-se de um conjunto de caracteres");
		Opcoes[31].setBounds(15, 1250, 800, 50);
		Opcoes[31].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[31]);
		
		Opcoes[32] = new JRadioButton("Configurar o tipo de uma variavel");
		Opcoes[32].setBounds(15, 1280, 800, 50);
		Opcoes[32].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[32]);
		pergunta8.add(Opcoes[29]);
		pergunta8.add(Opcoes[30]);
		pergunta8.add(Opcoes[31]);
		pergunta8.add(Opcoes[32]);
		
		Opcoes[29].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[29].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[8] = new JLabel("9) Onde as variaveis ficam armazenadas");
		lbLabeis[8].setBounds(15, 1330, 400, 30);
		lbLabeis[8].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[8]);
		
		pergunta9 = new ButtonGroup();
		Opcoes[33] = new JRadioButton("No banco de dados, no software e na memoria RAM");
		Opcoes[33].setBounds(15, 1350, 800, 50);
		Opcoes[33].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[33]);
		
		Opcoes[34] = new JRadioButton("Na memoria RAM do computador");
		Opcoes[34].setBounds(15, 1380, 800, 50);
		Opcoes[34].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[34]);
		
		Opcoes[35] = new JRadioButton("No programa/software");
		Opcoes[35].setBounds(15, 1410, 800, 50);
		Opcoes[35].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[35]);
		
		Opcoes[36] = new JRadioButton("No banco de Dados");
		Opcoes[36].setBounds(15, 1440, 800, 50);
		Opcoes[36].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[36]);
		pergunta9.add(Opcoes[33]);
		pergunta9.add(Opcoes[34]);
		pergunta9.add(Opcoes[35]);
		pergunta9.add(Opcoes[36]);
		
		Opcoes[34].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[34].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		lbLabeis[9] = new JLabel("10) De qual empresa pertecene a linguagem Java?");
		lbLabeis[9].setBounds(15, 1490, 400, 30);
		lbLabeis[9].setFont(new Font("webdings", Font.PLAIN, 15));
		contentPane.add(lbLabeis[9]);
		
		pergunta10 = new ButtonGroup();
		Opcoes[37] = new JRadioButton("Microsoft");
		Opcoes[37].setBounds(15, 1510, 800, 50);
		Opcoes[37].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[37]);
		
		Opcoes[38] = new JRadioButton("Sony");
		Opcoes[38].setBounds(15, 1540, 800, 50);
		Opcoes[38].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[38]);
		
		Opcoes[39] = new JRadioButton("Oracle");
		Opcoes[39].setBounds(15, 1570, 800, 50);
		Opcoes[39].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[39]);
		
		Opcoes[40] = new JRadioButton("IBM");
		Opcoes[40].setBounds(15, 1600, 800, 50);
		Opcoes[40].setBackground(new Color(178, 190, 195));
		contentPane.add(Opcoes[40]);
		pergunta10.add(Opcoes[37]);
		pergunta10.add(Opcoes[38]);
		pergunta10.add(Opcoes[39]);
		pergunta10.add(Opcoes[40]);
		
		Opcoes[39].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Opcoes[39].isSelected()) {
					qtdacertos+=1;
				}
				
			}
		});
		
		janela.setVisible(true);
		
		btJogar = new JButton("Avançar");
		btJogar.setBounds(150, 1700, 100, 50);
		contentPane.add(btJogar);
		
		
		btJogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Guardar p1 = new Guardar();
				p1.Soma(qtdacertos);
				Quiz3 tela3 = new Quiz3();
				tela3.Exportar(p1,nome);
				tela3.setVisible(true);
				
			}
		});
	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void ExportarNome(Guardar p2) {
		this.setNome(p2.getNome());
	}

	public static void main(String[] args) {
		
		Quiz2 q1 = new Quiz2();

	}

}
