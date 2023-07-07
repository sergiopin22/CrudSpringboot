package com.app.crud.estudiantes;

import com.app.crud.estudiantes.entidad.Estudiante;
import com.app.crud.estudiantes.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEstudiantesProyectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudEstudiantesProyectApplication.class, args);
	}

    @Autowired
    private EstudianteRepositorio repositorio;
        
    @Override
    public void run(String... args) throws Exception {
        
        /*Estudiante estudiante1 = new Estudiante("Sergio", "Pinzon", "sergiopin2220@gmail.com");
        repositorio.save(estudiante1);
        
        Estudiante estudiante2 = new Estudiante("Alejandro", "Vargas", "sergiopin2530@gmail.com");
        repositorio.save(estudiante2);*/
        
        
        
    }      

}
