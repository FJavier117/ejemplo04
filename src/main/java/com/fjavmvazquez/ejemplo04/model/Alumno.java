package com.fjavmvazquez.ejemplo04.model;

import java.util.Objects;

public class Alumno {
    private final String nombre;
    private final String apellido;
    private final String promedio;

    public Alumno(String nombre, String apellido, String promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public String getPromedio() {
        return promedio;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno that = (Alumno) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(promedio, that.promedio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, promedio);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", promedio='" + promedio + '\'' +
                '}';
    }
}
