package com.free.project1.main.interfaces.mantenimiento;

import com.free.project1.main.model.mantenimiento.DetalleMantenimiento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleMantenimiento extends JpaRepository<DetalleMantenimiento, Integer> {
    
    

}
