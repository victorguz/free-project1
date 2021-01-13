package com.free.project1.main.interfaces.mantenimiento;

import java.util.List;

import com.free.project1.main.model.mantenimiento.Unidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUnidad extends JpaRepository<Unidad, Integer> {

    @Query(value = "select * from v_estructura_trabajo where grupo = 'NULL' and unidad != 'NULL' ", nativeQuery = true)
    List<Unidad> buscarUnidades();
}
