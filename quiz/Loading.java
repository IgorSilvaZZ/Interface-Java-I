package quiz;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame{
	
	private JFrame janela;
	private JPanel contentPane;
	private JLabel lbImagem;
	private JLabel texto;
	private ImageIcon imagem;
	private JProgressBar barra;
	
	public Loading() {
		
		janela = new JFrame("Quiz sobre programação");
	    janela.setSize(900, 700);
	    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    janela.setResizable(true);
	    janela.setLocationRelativeTo(null);
	    janela.setBackground(new Color(178, 190, 195));
	    
	    contentPane = new JPanel();
	    contentPane.setLayout(null);
	    contentPane.setSize(900,700);
	    contentPane.setPreferredSize(new Dimension(0,1800));
	    contentPane.setBackground(new Color(178, 190, 195));
	    janela.add(contentPane);
	    janela.setVisible(true);
	    
	    imagem = new ImageIcon(getClass().getResource("loading.gif"));
	    lbImagem = new JLabel("Apoio Barra");
	    lbImagem.setSize(300, 500);
	    lbImagem.setIcon(imagem);
	    contentPane.add(lbImagem);
	    
	    
	    texto = new JLabel("");
        texto.setBounds(70,300,200,50);
        contentPane.add(texto);

        barra = new JProgressBar(0,100);
        barra.setBounds(70,400,300,50);
        contentPane.add(barra);
        
        new Thread(new carregar()).start();
		
	}
	
	public class carregar implements Runnable{
		 // Configurando o thread
        public void run(){
            for (int i = 0; i < 101; i++){
                try{
                    Thread.sleep(100);
                    barra.setValue(i);
                    if (barra.getValue() <= 50){
                        texto.setText("Carregando Perguntas..");
                    }
                    else if (barra.getValue() <= 70){
                        texto.setText("Carregando Banco de dados..");
                    }
                    else if (barra.getValue() <= 90){
                        texto.setText("Preparando Ambiente..");
                    }
                    else{
                        texto.setText("Pronto!!");
                    }
                }
                catch (Exception erro){
                    JOptionPane.showMessageDialog(null, erro);
                }
            }
        }
	}

	public static void main(String[] args) {
		
		Loading rodar = new Loading();

	}

}
