package com.bootcamp.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BusquedaController {

    @GetMapping("/busqueda-usuario/{busqueda}")
    public List<String> obtenerPalabrasAutocompletar(@PathVariable String busqueda){
        int contador = 0;
        // Lógica de búsqueda
        String[] arrayPalabras = {"curso de C", "curso de Node", "curso Java de cero a experto", "java bootcamp", "por qué java es tan dificil", "java curso 2023"};
        List<String> frasesTipicasDeBusqueda = new ArrayList<>(Arrays.asList(arrayPalabras));
        List<String> resultadoDeLaBusqueda = new ArrayList<>();

        for (String frase: frasesTipicasDeBusqueda) {
            if (frase.toLowerCase().contains(busqueda)){
                resultadoDeLaBusqueda.add(frase);
                contador++;

            }
        }

        return resultadoDeLaBusqueda;
    }
}
