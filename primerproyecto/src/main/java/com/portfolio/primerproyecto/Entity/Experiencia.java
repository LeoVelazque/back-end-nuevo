/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.primerproyecto.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Experiencia {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud solicitada")
    private String nombre_de_empresa;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud solicitada")
    private String nombre_del_puesto;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud solicitada")
    private String fecha_inicio;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud solicitada")
    private String fecha_fin;
    
    
    @Size(min = 1, max = 200, message = "no cumple con la longitud solicitada")
    private String img_empresa;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud solicitada")
    private String descripcion_empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_de_empresa() {
        return nombre_de_empresa;
    }

    public void setNombre_de_empresa(String nombre_de_empresa) {
        this.nombre_de_empresa = nombre_de_empresa;
    }

    public String getNombre_del_puesto() {
        return nombre_del_puesto;
    }

    public void setNombre_del_puesto(String nombre_del_puesto) {
        this.nombre_del_puesto = nombre_del_puesto;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getImg_empresa() {
        return img_empresa;
    }

    public void setImg_empresa(String img_empresa) {
        this.img_empresa = img_empresa;
    }

    public String getDescripcion_empresa() {
        return descripcion_empresa;
    }

    public void setDescripcion_empresa(String descripcion_empresa) {
        this.descripcion_empresa = descripcion_empresa;
    }
    
    
    
   
}

