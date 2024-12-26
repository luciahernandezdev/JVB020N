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
                null, //ID null porque se genera automáticamente en la base de datos.
                "Jose María", //Nombre del empleado
                "Perez", //Apellido del empleado
                "Gerente", //Cargo del empleado
                80.000, //Salario del empleado
                LocalDate.of(2020, 1, 3) //Fecha de ingreso del empleado
        );

        System.out.println("Creando un nuevo empleado...");
        //Llama al metodo "create" del controlador para agregar el nuevo empleadp
        empleadoController.create(nuevoEmpleado);
        //Muestra por consola que el empleado fue creado.
        System.out.println("Empleado creado con éxito: " + nuevoEmpleado);


        //Listar todos los empleados
        System.out.println("\nListando todos los empleados:");
        List<Empleado> todosLosEmpleados = empleadoController.findAll();
        //Mostrar todos los empleados
        for (Empleado empleado : todosLosEmpleados) {
            // Recorre la lista de empleados y los imprime.
            System.out.println(empleado.toString());
        }

        //Actualizar información de un empleado
        int idActualizar = 23; // ID del empleado que se desea actualizar. Cambiar según el contexto
        //Busca un empleado con el ID especificado.
        Empleado empleadoParaActualizar = empleadoController.findOne(idActualizar);

        //Si el empleado con el ID especificado existe:
        if (empleadoParaActualizar != null) {
            System.out.println("\nActualizando información del empleado con ID " + idActualizar);
            //Cambia el nombre del empleado
            empleadoParaActualizar.setNombre("Lucas");
            //Cambia el cargo del empleado.
            empleadoParaActualizar.setCargo("Desarrollador");
            //Llama al método `update` del controlador para guardar los cambios.
            empleadoController.update(empleadoParaActualizar);
            //Muestra en la consola que el empleado fue actualizado.
            System.out.println("Empleado actualizado: " + empleadoParaActualizar);

        } else { // Si el empleado con el ID especificado no existe:
            System.err.println("\nEmpleado con ID " + idActualizar + " no encontrado para actualización.");
        }

        //Eliminar un empleado
        int idEliminar = 27; // // ID del empleado que se desea eliminar. Cambiar según el contexto.
        //Busca un empleado con el ID 6
        Empleado empleadoBuscado = empleadoController.findOne(6);
        if (empleadoBuscado != null) {  //Si el empleado con el ID especificado existe:
            //Llama al método `delete` del controlador para eliminarlo.
            empleadoController.delete(empleadoBuscado.getId());
            //Muestra en la consola que el empleado fue eliminado.
            System.out.println("Empleado con ID" + idEliminar + "eliminado.");
        } else { //Si el empleado con el ID especificado no existe:
            System.err.println("Empleado con ID" + idEliminar + "no encontrado.");
        }

        //Buscar empleados por cargo
        String cargoBuscar = "Administrador de sistemas";
        System.out.println("\nBuscando empleados con el cargo: " + cargoBuscar);
        //Obtiene todos los empleados que tienen el cargo especificado.
        List<Empleado> empleadosPorCargo = empleadoController.findByCargo(cargoBuscar);
        //Recorre la lista y para cada empleado imprime su nombre, apellido y cargo.
        empleadosPorCargo.forEach(e ->
                System.out.println("Empleado: " + e.getNombre() + " " + e.getApellido() + ", Cargo: " + e.getCargo())
        );
    }

}

