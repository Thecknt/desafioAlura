package com.alura.desafio.principal;

import com.alura.desafio.service.ConsumoApi;
import com.alura.desafio.service.ConvierteDatos;

public class Principal {

    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu(){
     var json = consumoApi.obtenerDatos(URL_BASE);
        System.out.println(json);
    }
}
