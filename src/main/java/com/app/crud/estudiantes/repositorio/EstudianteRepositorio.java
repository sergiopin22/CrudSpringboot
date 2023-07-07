
package com.app.crud.estudiantes.repositorio;

import com.app.crud.estudiantes.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long>{
    
}
