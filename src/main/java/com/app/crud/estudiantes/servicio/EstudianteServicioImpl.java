package com.app.crud.estudiantes.servicio;

import com.app.crud.estudiantes.entidad.Estudiante;
import com.app.crud.estudiantes.repositorio.EstudianteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {
    
    @Autowired //inyectamos el repositorio
    private EstudianteRepositorio repositorio;
    
    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return repositorio.findAll();
    }
    
    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }
    
    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return repositorio.findById(id).get();
    }
    
    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }    
    
    @Override
    public void eliminarEstudiante(Long id) {
        repositorio.deleteById(id);
    }
    
}
