package org.empleados.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "empleados")  // Esto indica que la tabla en la base de datos se llama "empleados"
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Genera el ID automáticamente (autoincrementable)
    private Integer id;

    @Column(nullable = false)  // La columna "nombre" no puede ser nula
    private String nombre;

    @Column(nullable = false)  // La columna "apellido" no puede ser nula
    private String apellido;

    @Column(nullable = false)  // La columna "cargo" no puede ser nula
    private String cargo;

    @Column(nullable = false)  // La columna "salario" no puede ser nula
    private Double salario;

    @Column(name = "fecha_inicio", nullable = false)  // La columna "fechaInicio" no puede ser nula
    private LocalDate fechaInicio;

    // Constructor sin parámetros
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(Integer id, String nombre, String apellido, String cargo, Double salario, LocalDate fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    // Método toString para imprimir el objeto de manera legible
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}
