package com.free.project1.main.interfaces.mantenimiento;

import java.util.List;

import com.free.project1.main.model.mantenimiento.Mantenimiento;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IMantenimiento extends JpaRepository<Mantenimiento, Integer> {

        @Query(nativeQuery = true, value = "SELECT  MAX(Z.des_estado) estado FROM mantenimiento X INNER JOIN "
                        + " detalle_mantenimiento Y ON (X.id_mantenimiento = Y.id_Mantenimiento) "
                        + " INNER JOIN estado_mantenimiento  Z ON (y.cod_estado_mto = Z.id_Estado) "
                        + " INNER JOIN v_estructura_centro A ON (X.cod_unidad = A.id_unidad) WHERE  x.id_mantenimiento = ?1")
        String getEstado(int id);

        // @Query(nativeQuery = true, value = "SELECT K.*,L.estado FROM mantenimiento k
        // "
        // + " INNER JOIN (SELECT X.id_mantenimiento, MAX(Z.des_estado) estado FROM
        // mantenimiento X INNER JOIN "
        // + " detalle_mantenimiento Y ON (X.id_mantenimiento = Y.id_Mantenimiento) "
        // + " INNER JOIN estado_mantenimiento Z ON (y.cod_estado_mto = Z.id_Estado) "
        // + " INNER JOIN v_estructura_centro A ON (X.cod_unidad = A.id_unidad) GROUP BY
        // X.id_mantenimiento) l ON l.id_mantenimiento = k.id_mantenimiento")
        // List<Mantenimiento> getAll(Pageable pageable);

}
