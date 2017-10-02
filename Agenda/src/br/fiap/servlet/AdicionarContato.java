package br.fiap.servlet;
import br.fiap.contato.Contaro;
import br.fiap.dao.ContatoDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.ContatoDAO;

@WebServlet("/adicionaContato")
public class AdicionarContato extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String nascimento = request.getParameter("dataNascimento");
		
		new ContatoDAO().inserir(new Contaro(nome, email, endereco, nascimento));
	}
}
