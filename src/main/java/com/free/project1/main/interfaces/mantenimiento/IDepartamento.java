package com.free.project1.main.interfaces.mantenimiento;

import java.util.List;

import com.free.project1.main.model.mantenimiento.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamento extends JpaRepository<Departamento, Integer> {

    // @Query(value = "select * from v_estructura_centro where unidad = 'NULL'",
    // nativeQuery = true)
    // List<Departamento> buscarDepartamentos();
    
    List<Departamento> findAllByUnidad(String unidad);
}
