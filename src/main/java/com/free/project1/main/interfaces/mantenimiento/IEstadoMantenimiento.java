package com.free.project1.main.interfaces.mantenimiento;

import com.free.project1.main.model.mantenimiento.EstadoMantenimiento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoMantenimiento extends JpaRepository<EstadoMantenimiento, Integer> {
    
    

}
