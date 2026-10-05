package com.alvaro.actividad2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.alvaro.actividad2.model.Alumno;
import com.alvaro.actividad2.model.Direccion;

@Data
@AllArgsConstructor
public class AlumnoDTO {
    private String nombre;
    private String apellidos;
    private String email;
    private String curso;
    private String direccion;

    public static AlumnoDTO from(Alumno a) {
        return new AlumnoDTO(
                a.getNombre(),
                a.getApellido1() + " " + a.getApellido2(),
                a.getEmail(),
                a.getCurso().getNombre(),
                a.getDireccion().getTipoVia() + " " +
                        a.getDireccion().getLinea1() + ", " +
                        a.getDireccion().getCp() + " " +
                        a.getDireccion().getPoblacion()
        );
    }
}