package quiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Banco {
	private Connection connection = null;//Gerencia a conexão com o banco
	private Statement statement = null;//Gerencia as consultas que vou fazer no banco
	private ResultSet resultset = null;//Armazena as informações apos a consulta
	
	public void conectar() {
		//Atributos importantes para saber qual banco a se conectar
		String servidor = "jdbc:mysql://localhost:8080/bdScore";//JDBC - JavaDataBaseConective
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);//Registrando o driver
			//Tentando conexao apos o registro
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();//Trabalhar as consultas a partir da conexao
		}catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
		
	}
	
	public boolean estaConectado() {
		if(this.connection!=null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void listarContatos() {
		try {
			String query = "SELECT * FROM tbUsuarios ORDER BY pontoUsuario";
			this.resultset = this.statement.executeQuery(query);
			while(this.resultset.next()) {//Enquanto tiver um proximo registro a ser mostrado execute esse bloco de codigo
				System.out.println("Cod: "+this.resultset.getString("codUsuario")+" - Nome: "+this.resultset.getString("nomeUsuario")+" - Telefone "+this.resultset.getString("pontoUsuario"));
			}
		}catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}
	
	public void inserirContato(String nomeUsuario, String pontoUsuario) {
		try {
			String query = "INSERT INTO tbUsuarios(nomeUsuario,pontoUsuario) VALUES ('"+nomeUsuario +"','"+pontoUsuario+"');";
			this.statement.executeUpdate(query);
		}catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}
	
	public void editarContato(String codUsuario, String nomeUsuario, String pontoUsuario) {
		try {
			String query = "UPDATE tbUsuarios SET nomeUsuario = '"+nomeUsuario +"','"+pontoUsuario+"'WHERE codUsuario = "+codUsuario+";";
			this.statement.executeUpdate(query);
		}catch(Exception e){
			System.out.println("Error "+e.getMessage());
		}
	}
	
	public void apagarContato(String codUsuario) {
		try {
			String query = "DELETE FROM tbUsuarios WHERE codUsuario = "+codUsuario+";";
			this.statement.executeUpdate(query);
		}catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}
	
	public void desconectar() {
		try {
			this.connection.close();
		}catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}
	
}
