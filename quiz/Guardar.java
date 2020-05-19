package quiz;

import java.awt.*;
import javax.swing.*;

public class Guardar {
	
	private int acertos;
	private String nome;
	
	public int getAcertos() {
		return this.acertos;
	}
	
	public void setAcertos(int acertos) {
		this.acertos=acertos;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void Soma(int qtd) {
		this.setAcertos(getAcertos()+qtd);
	}
	
	public void Nome(String nome) {
		this.setNome(nome);
	}
	
}
