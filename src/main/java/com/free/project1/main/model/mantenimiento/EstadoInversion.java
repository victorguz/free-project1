package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ESTADO_INVERSION")
public class EstadoInversion {

    @Id
    @Column(name = "ID_ESTADO")
    int id;

    @Column(name = "DES_ESTADO", nullable = false, length = 100)
    String descripcion;

    @Column(name = "FE_CREA_REG")
    Date fechacreacion;

    @Column(name = "FE_MODI_REG")
    Date fechamodificacion;

    @Column(name = "COD_MOD_USU", length = 10)
    String codmodusu;

    @Column(name = "CHK_ACTIVO", length = 1)
    String chkactivo;

    @Column(name = "CHK_MARCA", length = 1)
    String chkmarca;



    public EstadoInversion() {
    }

    public EstadoInversion(int id, String descripcion, Date fechacreacion, Date fechamodificacion, String codmodusu, String chkactivo, String chkmarca) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechacreacion = fechacreacion;
        this.fechamodificacion = fechamodificacion;
        this.codmodusu = codmodusu;
        this.chkactivo = chkactivo;
        this.chkmarca = chkmarca;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechacreacion() {
        return this.fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechamodificacion() {
        return this.fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public String getCodmodusu() {
        return this.codmodusu;
    }

    public void setCodmodusu(String codmodusu) {
        this.codmodusu = codmodusu;
    }

    public String getChkactivo() {
        return this.chkactivo;
    }

    public void setChkactivo(String chkactivo) {
        this.chkactivo = chkactivo;
    }

    public String getChkmarca() {
        return this.chkmarca;
    }

    public void setChkmarca(String chkmarca) {
        this.chkmarca = chkmarca;
    }

    @Override
    public String toString() {
        return "{" +
            " 'id':'" + getId() + "'" +
            ", 'descripcion':'" + getDescripcion() + "'" +
            ", 'fechacreacion':'" + getFechacreacion() + "'" +
            ", 'fechamodificacion':'" + getFechamodificacion() + "'" +
            ", 'codmodusu':'" + getCodmodusu() + "'" +
            ", 'chkactivo':'" + getChkactivo() + "'" +
            ", 'chkmarca':'" + getChkmarca() + "'" +
            "}";
    }

}
