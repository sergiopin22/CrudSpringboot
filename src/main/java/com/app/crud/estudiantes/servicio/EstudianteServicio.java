/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.crud.estudiantes.servicio;

import com.app.crud.estudiantes.entidad.Estudiante;
import java.util.List;

/**
 *
 * @author Alejandro Pinzon
 */
public interface EstudianteServicio {
    
    public List<Estudiante> listarTodosLosEstudiantes();
    
    public Estudiante guardarEstudiante(Estudiante estudiante);
    
    public Estudiante obtenerEstudiantePorId(Long id);
    
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    
    public void eliminarEstudiante(Long id);
    
}
