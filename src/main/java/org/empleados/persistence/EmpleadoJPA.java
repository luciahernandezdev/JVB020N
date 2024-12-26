package org.empleados.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.empleados.entities.Empleado;

import java.util.List;

public class EmpleadoJPA {

    //Crear un nuevo empleado
    public void create(Empleado nuevoEmpleado) {
        EntityManager em = ConfigJPA.getEntityManager(); // Obtener una instancia de EntityManager

        try {
            em.getTransaction().begin(); // Iniciar una transacción
            em.persist(nuevoEmpleado); // Guardar el empleado
            em.getTransaction().commit(); // Confirmar la transacción
        } finally {
            em.close(); //Cierra el EntityManager
        }
    }

    //Buscar un empleado por ID
    public Empleado findOne(Integer idBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            return em.find(Empleado.class, idBuscado); //Busca el empleado por su ID
        } finally {
            em.close();
        }
    }

    //Buscar un empleado por su nombre
    public Empleado findByName(String nombreBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            TypedQuery<Empleado> query = em.createQuery("SELECT e FROM Empleado e WHERE e.nombre = :nombre", Empleado.class);
            query.setParameter("nombre", nombreBuscado);

            // Ejecutar la consulta y obtener el resultado
            List<Empleado> empleados = query.getResultList();

            // Si encontramos resultados, devolvemos el primero, si no null
            return empleados.isEmpty() ? null : empleados.get(0);
        } finally {
            em.close();
        }

    }

    //Listar empleados
    public List<Empleado> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            TypedQuery<Empleado> query = em.createQuery("SELECT p FROM Empleado p", Empleado.class);
            return query.getResultList(); //Devuelve una lista de todos los empleados.
        } finally {
            em.close();
        }
    }

    //Actualizar empleado
    public void update(Empleado actualizarEmpleado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); //Iniciar una transaccion
            em.merge(actualizarEmpleado);  //Actualiza el empleado existente
            em.getTransaction().commit(); //Confirma la transacción
        }finally {
            em.close(); //Cierra el EntityManager
        }
    }

    //Eliminar empleado
    public void delete(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            Empleado empleado = em.find(Empleado.class, idEliminar);
            if (empleado != null){
                em.remove(empleado); //Elimina el empleado si existe
            }else{
                System.err.println("El id " + idEliminar + " No existe");
            }
            em.getTransaction().commit(); //Confirma la transacción
        }finally {
            em.close();
        }
    }

    //Buscar empleado por cargo
    public List<Empleado> findByCargo(String cargo) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            TypedQuery<Empleado> query = em.createQuery("SELECT p FROM Empleado p WHERE p.cargo = :cargo", Empleado.class);
            query.setParameter("cargo", cargo);  // Establece el valor del parámetro "cargo"
            return query.getResultList(); //Devuelve una lista de empleados con el cargo especificado
        } finally {
            em.close();
        }
    }
}
