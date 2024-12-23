package org.empleados;

import org.empleados.controllers.EmpleadoController;
import org.empleados.entities.Empleado;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoController empleadoController = new EmpleadoController();
        // Agregar nuevo empleado
        Empleado nuevoEmpleado = new Empleado(
                null,
                "Manuel",
                "Montero",
                "Administrador de sistemas",
                40.000,
                LocalDate.of(2021, 6, 8)
        );
        //empleadoController.create(nuevoEmpleado);

        //Listar empleados
        List<Empleado> todosLosEmpleados = empleadoController.findAll();
        //Mostrar todos los empleados
        for (Empleado empleado : todosLosEmpleados) {
            System.out.println(empleado.toString());
        }

        //Actualizar información de un empleado
        Empleado actualizarEmpleado = empleadoController.findOne(6);
        actualizarEmpleado.setNombre("Lucas");
        empleadoController.update(actualizarEmpleado);

        //Eliminar un empleado
        Empleado empleadoBuscado = empleadoController.findOne(6);
        if (empleadoBuscado != null) {
            empleadoController.delete(empleadoBuscado.getId());
            System.out.println("Empleado con ID 6 eliminado.");
        } else {
            System.err.println("Empleado con ID 6 no encontrado.");
        }

        //Buscar empleados por cargo
        List<Empleado> empleadosPorCargo = empleadoController.findByCargo("Gerente de operaciones");
        empleadosPorCargo.forEach(e -> System.out.println("Empleado con cargo 'Gerente de operaciones': " + e.getNombre() + " " + e.getApellido()));
    }

}

