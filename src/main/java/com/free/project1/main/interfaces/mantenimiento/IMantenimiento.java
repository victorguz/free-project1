package com.free.project1.main.interfaces.mantenimiento;


import com.free.project1.main.model.mantenimiento.Mantenimiento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IMantenimiento extends JpaRepository<Mantenimiento, Integer> {

        @Query(nativeQuery = true, value = "SELECT * FROM mantenimiento WHERE chk_activo=1")
        Page<Mantenimiento> findAll(Pageable pageable);

}
