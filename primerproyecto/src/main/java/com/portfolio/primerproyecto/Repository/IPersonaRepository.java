/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.primerproyecto.Repository;

import com.portfolio.primerproyecto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leon
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>  {
    
}
