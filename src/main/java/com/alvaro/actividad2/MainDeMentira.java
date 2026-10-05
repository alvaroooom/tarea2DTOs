package com.alvaro.actividad2;

import java.util.List;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import com.alvaro.actividad2.dto.AlumnoDTO;
import com.alvaro.actividad2.dto.ProductoDTO;
import com.alvaro.actividad2.model.*;

@Component
public class MainDeMentira {

    @PostConstruct
    public void init() {
        Direccion direccion = Direccion.builder()
                .id(1L)
                .tipoVia("Calle")
                .linea1("Mayor 12")
                .linea2("2ºB")
                .cp("41001")
                .poblacion("Sevilla")
                .provincia("Sevilla")
                .build();

        Curso curso = Curso.builder()
                .id(1L)
                .nombre("2º DAM")
                .tipo("Presencial")
                .tutor("Pepe")
                .aula("Aula 3")
                .build();

        Alumno alumno = Alumno.builder()
                .id(1L)
                .nombre("Álvaro")
                .apellido1("Muñoz")
                .apellido2("Hernandez")
                .telefono("600000000")
                .email("alvaro@example.com")
                .direccion(direccion)
                .curso(curso)
                .build();

        Categoria categoria = Categoria.builder()
                .id(1L)
                .nombre("Informática")
                .build();

        Producto producto = Producto.builder()
                .id(1L)
                .nombre("Portátil")
                .desc("Portátil para clase")
                .pvp(799.99)
                .imagenes(List.of("foto1.jpg", "foto2.jpg"))
                .categoria(categoria)
                .build();

        AlumnoDTO alumnoDTO = AlumnoDTO.from(alumno);
        ProductoDTO productoDTO = ProductoDTO.from(producto);

        System.out.println("AlumnoDTO: " + alumnoDTO);
        System.out.println("ProductoDTO: " + productoDTO);
    }
}
