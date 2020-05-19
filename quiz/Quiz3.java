package quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.Border;


public class Quiz3 extends JFrame{
	
	private JFrame janela;
	private JPanel painel;
	private JScrollPane mouse;
	private JTextField lbAcertos;
	private JTextField lbNome;
	private JLabel jogador;
	private JLabel pontos;
	
	
	public Quiz3() {
		
		janela = new JFrame("Quiz sobre programação");
	    janela.setSize(500, 500);
	    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    janela.setResizable(true);
	    janela.setBackground(new Color(178, 190, 195));
	    
	    painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(500,500);
        painel.setPreferredSize(new Dimension(0,500));
        painel.setBackground(new Color(178, 190, 195));
        
        janela.add(painel);
        mouse = new JScrollPane(painel);
        janela.add(mouse);
        
        pontos = new JLabel("Total de acertos:");
        pontos.setBounds(100,200, 150, 25);
       
        lbAcertos = new JTextField();
		lbAcertos.setBounds(220, 200, 150, 25);
		
		painel.add(lbAcertos);
		painel.add(pontos);
		
		jogador = new JLabel ("Nome do jogador:");
		jogador.setBounds(100,300, 150, 25);
		
		lbNome = new JTextField();
		lbNome.setBounds(230, 300, 150, 25);
		
		painel.add(lbNome);
		painel.add(jogador);
		
        janela.setVisible(true);
		
	}
	
	public void Exportar(Guardar p1 , String nome) {
		lbAcertos.setText(String.valueOf(p1.getAcertos()));
		lbNome.setText(nome);
	}
	

	public static void main(String[] args) {
		
		Quiz3 r1 = new Quiz3();

	}

}
