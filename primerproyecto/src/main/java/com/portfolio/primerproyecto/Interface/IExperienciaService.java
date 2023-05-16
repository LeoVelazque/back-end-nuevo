/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.primerproyecto.Interface;

import com.portfolio.primerproyecto.Entity.Experiencia;
import java.util.List;

/**
 *
 * @author leon
 */
public interface IExperienciaService {
    public List<Experiencia> GetExperiencia();
    
    //guardar 
    public void saveExperiencia(Experiencia experiencia);
    
    //eliminar objeto por Id
    public void deleteExperiencia(Long id);
    
    //buscar 
    public Experiencia findExperiencia(Long id);
}
