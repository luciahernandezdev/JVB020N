package org.empleados.controllers;

import org.empleados.entities.Empleado;
import org.empleados.persistence.EmpleadoJPA;

import java.util.List;

public class EmpleadoController {
    EmpleadoJPA empleadoJPA = new EmpleadoJPA();

    //Crear nuevo empleado
    public void create(Empleado nuevoEmpleado) {
        try {
            if (nuevoEmpleado == null) {
                throw new IllegalArgumentException("El empleado no puede ser nulo");
            }
            empleadoJPA.create(nuevoEmpleado);
            System.out.println("Empleado creado exitosamente.");
        } catch (Exception e) {
            System.err.println("Error al crear el empleado: " + e.getMessage());
        }
    }
    //Buscar un empleado por ID
    public Empleado findOne(int id) {
        try {
            Empleado empleado = empleadoJPA.findOne(id);
            if (empleado == null) {
                System.out.println("No se encontró un empleado con el ID: " + id);
            }
            return empleado;
        } catch (Exception e) {
            System.err.println("Error al buscar el empleado: " + e.getMessage());
            return null;
        }
    }
    //Listar los empleados
    public List<Empleado> findAll() {
        try {
            return empleadoJPA.findAll();
        } catch (Exception e) {
            System.err.println("Error al listar empleados: " + e.getMessage());
            return null;
        }
    }
    //Actualizar un empleado
    public void update(Empleado actualizarEmpleado) {
        try {
            if (actualizarEmpleado == null) {
                throw new IllegalArgumentException("El empleado a actualizar no puede ser nulo");
            }
            empleadoJPA.update(actualizarEmpleado);
            System.out.println("Empleado actualizado exitosamente.");
        } catch (Exception e) {
            System.err.println("Error al actualizar el empleado: " + e.getMessage());
        }
    }

    //Eliminar un empleado por ID
    public void delete(int idEliminar) {
        try {
            empleadoJPA.delete(idEliminar);
            System.out.println("Empleado eliminado exitosamente.");
        } catch (Exception e) {
            System.err.println("Error al eliminar el empleado: " + e.getMessage());
        }
    }

    // Buscar un empleado por nombre
    public Empleado findByName(String nombreBuscado) {
        try {
            if (nombreBuscado == null || nombreBuscado.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }
            Empleado empleado = empleadoJPA.findByName(nombreBuscado);
            if (empleado == null) {
                System.out.println("No se encontró un empleado con el nombre: " + nombreBuscado);
            }
            return empleado;
        } catch (Exception e) {
            System.err.println("Error al buscar el empleado por nombre: " + e.getMessage());
            return null;
        }
    }
    // Buscar empleados por cargo
    public List<Empleado> findByCargo(String cargo) {
        try {
            if (cargo == null || cargo.trim().isEmpty()) {
                throw new IllegalArgumentException("El cargo no puede estar vacío");
            }
            return empleadoJPA.findByCargo(cargo);
        } catch (Exception e) {
            System.err.println("Error al buscar empleados por cargo: " + e.getMessage());
            return null;
        }
    }
}


