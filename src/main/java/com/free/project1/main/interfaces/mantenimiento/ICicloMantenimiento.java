package com.free.project1.main.interfaces.mantenimiento;

import com.free.project1.main.model.mantenimiento.CicloMantenimiento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICicloMantenimiento extends JpaRepository<CicloMantenimiento, Integer> {
    
    

}
