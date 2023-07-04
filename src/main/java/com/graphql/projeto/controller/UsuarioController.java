package com.graphql.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.graphql.projeto.model.Usuario;
import com.graphql.projeto.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@SchemaMapping(typeName="Query", value="listaUsuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioService.listaUsuarios();
	}
	
	@SchemaMapping(typeName="Mutation", value="cadastraUsuario")
	public List<Usuario> cadastraUsuario(@Argument String nome, @Argument Integer idade, @Argument String endereco){
		return usuarioService.cadastraUsuario(nome, idade, endereco);
	}
	
}
