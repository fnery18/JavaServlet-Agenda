package br.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.fiap.contato.Contaro;

public class ContatoDAO {
	private Connection connection;
	private String sql;
	private PreparedStatement p;
	private ResultSet rs;
	
	public void inserir(Contaro contato){
		sql = "insert into JAVA_AGENDA values (?,?,?,?)";
			try{
				connection = null;
				p = connection.prepareStatement(sql);
				p.setString(1, contato.getNome());
				p.setString(2, contato.getEndereco());
				p.setString(3, contato.getEmail());
				p.setString(4, contato.getNasc());
				p.execute();
			}
			catch(SQLException e){
				
			}
	}
	
	public List<Contaro> ListaContato(){
		List<Contaro> lista = null;
		String nome, endereco, email, nascimento;
		
		sql = "select * from JAVA_AGENDA";
		try{
			connection = null;
			p = connection.prepareStatement(sql);
			rs = p.executeQuery();
			while(rs.next()){
				nome = rs.getString("NOME");
				endereco = rs.getString("ENDERECO");
				email = rs.getString("EMAIL");
				nascimento = rs.getString("NASCIMENTO");
				Contaro contato = new Contaro(nome,endereco,email,nascimento);
				lista.add(contato);
			}
		}
		catch(SQLException e){
			
		}
		
		return lista;
	}
	
	
}
