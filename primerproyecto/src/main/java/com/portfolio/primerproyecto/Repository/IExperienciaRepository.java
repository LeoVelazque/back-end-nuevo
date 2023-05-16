/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.primerproyecto.Repository;

import com.portfolio.primerproyecto.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leon
 */
@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>  {
    
}