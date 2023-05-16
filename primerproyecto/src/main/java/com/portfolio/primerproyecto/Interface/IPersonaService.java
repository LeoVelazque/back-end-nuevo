/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.primerproyecto.Interface;

import com.portfolio.primerproyecto.Entity.Persona;
import java.util.List;
/**
 *
 * @author leon
 */
public interface IPersonaService {
    
    //traer persona
    public List<Persona> GetPersona();
    
    //guardar persona
    public void savePersona(Persona persona);
    
    //eliminar objeto por Id
    public void deletePersona(Long id);
    
    //buscar persona
    public Persona findPersona(Long id);
}
