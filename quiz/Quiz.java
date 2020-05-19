package quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import atividade2.Salario;

public class Quiz extends JFrame{
	
	private JPanel contentPane;
	private JLabel lbNome;
	private JTextField txtNome;
	private JLabel lbIdade;
	private JTextField txtIdade;
	private JButton btJogar;
	
	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz frame = new Quiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public Quiz() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Quiz sobre Programação");
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(178, 190, 195));
		
		lbNome = new JLabel("DIGITE O SEU NOME:");
		lbNome.setBounds(100, 30, 400, 30);
		contentPane.add(lbNome);
		lbNome.setFont(new Font("webdings", Font.PLAIN, 19));
		
		txtNome = new JTextField();
		txtNome.setBounds(100, 90, 200, 25);
		contentPane.add(txtNome);
		
		lbIdade = new JLabel("DIGITE SUA IDADE:");
		lbIdade.setBounds(100, 130, 200, 30);
		lbIdade.setFont(new Font("webdings", Font.PLAIN, 19));
		contentPane.add(lbIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(100, 190, 200, 25);
		contentPane.add(txtIdade);
		
		btJogar = new JButton("Jogar");
		btJogar.setBounds(150, 250, 100, 50);
		contentPane.add(btJogar);
		
		btJogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Quiz2 tela2 = new Quiz2();
				Guardar p2 = new Guardar();
				p2.Nome(txtNome.getText());
				tela2.ExportarNome(p2);
				tela2.setVisible(true);
			}
		});
		
		
		
	}

}
