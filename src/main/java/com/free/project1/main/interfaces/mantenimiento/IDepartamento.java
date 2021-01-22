package com.free.project1.main.interfaces.mantenimiento;

import java.util.List;

import com.free.project1.main.model.mantenimiento.Departamento;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDepartamento extends JpaRepository<Departamento, Integer> {

    @Query(value = "SELECT DISTINCT departamento from v_estructura_centro", nativeQuery = true)
    List<String> selectAll();

    @Query(value = "SELECT DISTINCT departamento from v_estructura_centro", nativeQuery = true)
    List<String> selectAll(Pageable pageable);

    @Query(value = "SELECT DISTINCT unidad from v_estructura_centro WHERE departamento = :dpto AND unidad IS NOT NULL ", nativeQuery = true)
    List<String> selectUnidades(@Param("dpto") String dpto);

    @Query(value = "SELECT DISTINCT unidad from v_estructura_centro WHERE departamento = :dpto AND unidad IS NOT NULL ", nativeQuery = true)
    List<String> selectUnidades(@Param("dpto") String dpto, Pageable pageable);

    @Query(value = "SELECT DISTINCT unidad from v_estructura_centro WHERE unidad IS NOT NULL ", nativeQuery = true)
    List<String> selectUnidades();

    @Query(value = "SELECT DISTINCT unidad from v_estructura_centro WHERE unidad IS NOT NULL ", nativeQuery = true)
    List<String> selectUnidades(Pageable pageable);
}
