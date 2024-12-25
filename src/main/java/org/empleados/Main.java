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
                "Álvaro",
                "Diaz",
                "Desarrollador",
                20.000,
                LocalDate.of(2022, 4, 6)
        );
        System.out.println("Creando un nuevo empleado...");
        empleadoController.create(nuevoEmpleado);
        System.out.println("Empleado creado con éxito: " + nuevoEmpleado);


        //Listar empleados
        System.out.println("\nListando todos los empleados:");
        List<Empleado> todosLosEmpleados = empleadoController.findAll();
        //Mostrar todos los empleados
        for (Empleado empleado : todosLosEmpleados) {
            System.out.println(empleado.toString());
        }

        //Actualizar información de un empleado
        int idActualizar = 1; // Cambiar este ID según los datos existentes
        Empleado empleadoParaActualizar = empleadoController.findOne(idActualizar);

        if (empleadoParaActualizar != null) {
            System.out.println("\nActualizando información del empleado con ID " + idActualizar);
            empleadoParaActualizar.setNombre("Lucas");
            empleadoParaActualizar.setCargo("Desarrollador");
            empleadoController.update(empleadoParaActualizar);
            System.out.println("Empleado actualizado: " + empleadoParaActualizar);
        } else {
            System.err.println("\nEmpleado con ID " + idActualizar + " no encontrado para actualización.");
        }

        //Eliminar un empleado
        int idEliminar = 2; // Cambiar este ID según los datos existentes
        Empleado empleadoBuscado = empleadoController.findOne(6);
        if (empleadoBuscado != null) {
            empleadoController.delete(empleadoBuscado.getId());
            System.out.println("Empleado con ID" + idEliminar + "eliminado.");
        } else {
            System.err.println("Empleado con ID" + idEliminar + "no encontrado.");
        }

        //Buscar empleados por cargo
        String cargoBuscar = "Administrador de sistemas";
        System.out.println("\nBuscando empleados con el cargo: " + cargoBuscar);
        List<Empleado> empleadosPorCargo = empleadoController.findByCargo(cargoBuscar);
        empleadosPorCargo.forEach(e ->
                System.out.println("Empleado: " + e.getNombre() + " " + e.getApellido() + ", Cargo: " + e.getCargo())
        );
    }

}

