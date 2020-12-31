package com.free.project1.main.interfaces.mantenimiento;

import com.free.project1.main.model.mantenimiento.RequiereMantenimiento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRequiereMantenimiento extends JpaRepository<RequiereMantenimiento, Integer> {
    
    

}
