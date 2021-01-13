package com.free.project1.main.model.mantenimiento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "V_ESTRUCTURA_CENTRO")
public class Departamento {

    @Id
    @Column(name = "id_unidad")
    int id_unidad;

    @Column(name = "NIVEL")
    int nivel;

    @Column(name = "JERARQUIA")
    int jerarquia;

    @Column(name = "DEPARTAMENTO", length = 100)
    String departamento;

    @Column(name = "UNIDAD", length = 100)
    String unidad;

    @Column(name = "GRUPO", length = 100)
    String grupo;

    @Column(name = "SUBGRUPO", length = 100)
    String subgrupo;

    @Column(name = "TURNO", length = 100)
    String turno;

    public Departamento() {
    }

    public int getId_unidad() {
        return this.id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getJerarquia() {
        return this.jerarquia;
    }

    public void setJerarquia(int jerarquia) {
        this.jerarquia = jerarquia;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getUnidad() {
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSubgrupo() {
        return this.subgrupo;
    }

    public void setSubgrupo(String subgrupo) {
        this.subgrupo = subgrupo;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "{" + " 'id_unidad':'" + getId_unidad() + "'" + ", 'nivel':'" + getNivel() + "'" + ", 'jerarquia':'"
                + getJerarquia() + "'" + ", 'departamento':'" + getDepartamento() + "'" + ", 'unidad':'" + getUnidad()
                + "'" + ", 'grupo':'" + getGrupo() + "'" + ", 'subgrupo':'" + getSubgrupo() + "'" + ", 'turno':'"
                + getTurno() + "'" + "}";
    }
}
