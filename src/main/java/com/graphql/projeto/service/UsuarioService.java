package com.graphql.projeto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.projeto.model.Usuario;

@Service
public class UsuarioService {
	
	List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	
	public List<Usuario> listaUsuarios(){
		
		return listaDeUsuarios;
		
	}
	
	public List<Usuario> cadastraUsuario(String nome, Integer idade, String endereco) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(nome);
		usuario.setIdade(idade);
		usuario.setEndereco(endereco);
		
		listaDeUsuarios.add(usuario);
		return listaDeUsuarios;
		
	}
}
