package com.free.project1.main.interfaces.mantenimiento;

import java.util.List;

import com.free.project1.main.model.mantenimiento.Mantenimiento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IMantenimiento extends JpaRepository<Mantenimiento, Integer> {


}
