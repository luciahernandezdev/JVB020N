package org.empleados.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.empleados.entities.Empleado;

import java.util.List;

public class EmpleadoJPA {

    public void create(Empleado nuevoEmpleado) {
        EntityManager em = ConfigJPA.getEntityManager();

        try {
            em.getTransaction().begin(); // Iniciar una transacción
            em.persist(nuevoEmpleado); // Guardar el empleado
            em.getTransaction().commit(); // Confirmar la transacción
        } finally {
            em.close();
        }
    }

    public Empleado findOne(Integer idBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            return em.find(Empleado.class, idBuscado);
        }finally {
            em.close();
        }

    }

    // Método para buscar un empleado por su nombre
    public Empleado findByName(String nombreBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            TypedQuery<Empleado> query = em.createQuery("SELECT e FROM Empleado e WHERE e.nombre = :nombre", Empleado.class);
            query.setParameter("nombre", nombreBuscado);

            // Ejecutar la consulta y obtener el resultado
            List<Empleado> empleados = query.getResultList();

            // Si encontramos resultados, devolvemos el primero, sino null
            return empleados.isEmpty() ? null : empleados.get(0);
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar el empleado por nombre: " + e.getMessage(), e);
        }

    }
    //Listar empleados
    public List<Empleado> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Empleado> query = em.createQuery("SELECT p FROM empleado p", Empleado.class);
            return query.getResultList();
        }finally {
            em.close();
        }

    }
    //Actualizar empleado
    public void update(Empleado actualizarEmpleado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            em.merge(actualizarEmpleado);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    //Eliminar empleado
    public void delete(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            Empleado empleado = em.find(Empleado.class, idEliminar);
            if (empleado != null){
                em.remove(empleado);
            }else{
                System.err.println("El id " + idEliminar + " No existe");
            }
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    //Buscar cargo
    public List<Empleado> findByCargo(String cargo) {
        EntityManager em = ConfigJPA.getEntityManager();
        TypedQuery<Empleado> query = em.createQuery("SELECT p FROM Empleado p WHERE e.cargo = :cargo", Empleado.class);
        query.setParameter("cargo", cargo);
        return query.getResultList();
    }
}
