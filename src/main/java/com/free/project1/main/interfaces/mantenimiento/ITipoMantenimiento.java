package com.free.project1.main.interfaces.mantenimiento;

import com.free.project1.main.model.mantenimiento.TipoMantenimiento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoMantenimiento extends JpaRepository<TipoMantenimiento, Integer> {

}
