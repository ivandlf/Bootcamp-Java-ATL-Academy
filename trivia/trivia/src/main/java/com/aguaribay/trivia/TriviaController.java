package com.aguaribay.trivia;

import com.aguaribay.trivia.entities.Categoria;
import com.aguaribay.trivia.entities.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {




    @GetMapping("/question/{categoria}")
    public Pregunta getQuestion(@PathVariable String categoria){
        Pregunta preg = new Pregunta();
        List<String> opciones = new ArrayList<>();
        if (categoria.equalsIgnoreCase("Cultura")){

            preg.setCategory("Cultura");
            preg.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
            preg.setAnswer(0);
            preg.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");


            opciones.add("Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante");
            opciones.add("Cerveza, lima/limón y limon");
            opciones.add("Cerveza, sal, tabasco y lima/limón");
            preg.setOptions(opciones);
            return preg;
        }
        if (categoria.equalsIgnoreCase("Historia")){
            preg.setCategory("Historia");
            preg.setQuestion("¿Cuál fue el primer país en enviar un ser humano al espacio?");
            preg.setAnswer(1);
            preg.setExplanation("El primer país en enviar un ser humano al espacio fue la Unión Soviética. El 12 de abril de 1961, el cosmonauta ruso Yuri Gagarin se convirtió en el primer ser humano en orbitar la Tierra a bordo de la nave espacial Vostok 1.");

            opciones.add("Estados Unidos");
            opciones.add("Rusia (anteriormente Unión Soviética)");
            opciones.add("China");
            preg.setOptions(opciones);
            return preg;
        }

        if (categoria.equalsIgnoreCase("Ciencia")){
            preg.setCategory("Ciencia");
            preg.setQuestion("¿Cuál es el elemento químico más abundante en el universo?");
            preg.setAnswer(0);
            preg.setExplanation("El elemento químico más abundante en el universo es el hidrógeno. Constituye aproximadamente el 75% de la masa elemental del universo y se encuentra en grandes cantidades en estrellas y en el medio interestelar.");

            opciones.add("Hidrógeno");
            opciones.add("Oxígeno");
            opciones.add("Helio");
            preg.setOptions(opciones);
            return preg;
        }

        if (categoria.equalsIgnoreCase("Arte")){
            preg.setCategory("Arte");
            preg.setQuestion("¿Quién pintó la Mona Lisa?");
            preg.setAnswer(1);
            preg.setExplanation("La Mona Lisa fue pintada por el renombrado artista italiano Leonardo da Vinci. Es una de las obras de arte más famosas del mundo y se encuentra en el Museo del Louvre en París, Francia.");

            opciones.add("Pablo Picasso");
            opciones.add("Leonardo da Vinci");
            opciones.add("Vincent van Gogh");
            preg.setOptions(opciones);
            return preg;
        }
        if (categoria.equalsIgnoreCase("Cine")){
            preg.setCategory("Cine");
            preg.setQuestion("¿Cuál fue la primera película de la saga de Star Wars en ser lanzada?");
            preg.setAnswer(0);
            preg.setExplanation("La primera película de la saga de Star Wars en ser lanzada fue 'Star Wars: Episodio IV - Una nueva esperanza'. Fue estrenada en 1977 y marcó el comienzo de una de las franquicias más exitosas y populares de la historia del cine.");

            opciones.add("Star Wars: Episodio IV - Una nueva esperanza");
            opciones.add("Star Wars: Episodio I - La amenaza fantasma");
            opciones.add("Star Wars: Episodio V - El imperio contraataca");
            preg.setOptions(opciones);
            return preg;
        }
        if (categoria.equalsIgnoreCase("Deportes")){
            preg.setCategory("Deportes");
            preg.setQuestion("¿Cuál es el deporte más popular en el mundo?");
            preg.setAnswer(0);
            preg.setExplanation("El deporte más popular en el mundo es el fútbol. Con millones de seguidores y jugadores en todos los continentes, el fútbol ha logrado un alcance global y se considera una pasión compartida por personas de diversas culturas y países.");
            opciones.add("Fútbol");
            opciones.add("Baloncesto");
            opciones.add("Tenis");
            preg.setOptions(opciones);
            return preg;
        }

        /*String[] options = new String[3];
        options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
        options[1] = "Cerveza, lima/limón y limon";
        options[2] = "Cerveza, sal, tabasco y lima/limón";
        preg.setOptions(options);*/
        return null;
    }

    @GetMapping("/categories")
    public Categoria[] getCategories(){

        Categoria ciencia = new Categoria();
        ciencia.setCategory("Ciencia");
        ciencia.setDescription("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

        Categoria arte = new Categoria();
        arte.setCategory("Arte");
        arte.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categoria cine = new Categoria();
        cine.setCategory("Cine");
        cine.setDescription("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categoria deportes = new Categoria();
        deportes.setCategory("Deportes");
        deportes.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria historia = new Categoria();
        historia.setCategory("Historia");
        historia.setDescription("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");

        Categoria cultura = new Categoria();
        cultura.setCategory("Cultura");
        cultura.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categoria[] categorias = new Categoria[6];
        categorias[0] = ciencia;
        categorias[1] = arte;
        categorias[2] = cine;
        categorias[3] = cultura;
        categorias[4] = historia;
        categorias[5] = deportes;
        return categorias;

        /*return "[\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";*/
    }

}
