package com.alvaro.actividad2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.alvaro.actividad2.model.Producto;

@Data
@AllArgsConstructor
public class ProductoDTO {
    private String nombre;
    private double pvp;
    private String imagen;
    private String categoria;

    public static ProductoDTO from(Producto producto) {
        String imagen = producto.getImagenes() != null && !producto.getImagenes().isEmpty() ? producto.getImagenes().get(0) : null;
        String categoria = producto.getCategoria() != null ? producto.getCategoria().getNombre() : null;
        return new ProductoDTO(producto.getNombre(), producto.getPvp(), imagen, categoria);
    }
}
