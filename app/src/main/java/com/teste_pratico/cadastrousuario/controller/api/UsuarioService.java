package com.teste_pratico.cadastrousuario.controller.api;

import com.teste_pratico.cadastrousuario.model.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UsuarioService {

    //CADASTRA UM USUARIO
    @POST("/usuario/cadastrar")
    Call<Usuario> cadastrar(@Body Usuario usuario);

    //BUSCA TODOS OS USUARIOS ATIVOS
    @GET("/usuario/usuariosAtivos")
    Call<List<Usuario>> getUsuariosAtivos();

    //BUSCA USUARIOS ATIVOS POR NOME
    @GET("/usuario/usuariosAtivos_NOME?")
    Call<List<Usuario>> getUsuariosAtivos_NOME(@Query("nome") String nome);
}
