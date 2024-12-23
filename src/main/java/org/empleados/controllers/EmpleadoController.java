package org.empleados.controllers;

import org.empleados.entities.Empleado;
import org.empleados.persistence.EmpleadoJPA;

import java.util.List;

public class EmpleadoController {
    EmpleadoJPA empleadoJPA = new EmpleadoJPA();

    public void create(Empleado nuevoEmpleado) {
        empleadoJPA.create(nuevoEmpleado);
    }
    public Empleado findOne(int id) {
        return empleadoJPA.findOne(id);
    }

    public List<Empleado> findAll() {
        return empleadoJPA.findAll();
    }

    public void update(Empleado actualizarEmpleado) {
        empleadoJPA.update(actualizarEmpleado);
    }

    public void delete(int idEliminar) {
        empleadoJPA.delete(idEliminar);
    }

    // Método para buscar un empleado por nombre
    public Empleado findByName(String nombreBuscado) {
        return empleadoJPA.findByName(nombreBuscado);  // Llama a la capa JPA para buscar el empleado por nombre
    }

    public List<Empleado> findByCargo(String cargo) {
        return empleadoJPA.findByCargo(cargo);  // metodo para buscar empleado por cargo
    }
}

