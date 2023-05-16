/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.primerproyecto.Service;
import com.portfolio.primerproyecto.Entity.Experiencia;
import com.portfolio.primerproyecto.Interface.IExperienciaService;
import com.portfolio.primerproyecto.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leon
 */
@Service
public class ImpExperienciaService implements IExperienciaService {
@Autowired IExperienciaRepository iexperienciaRepository;
    @Override
    public List<Experiencia> GetExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
        return experiencia;
    }
    
}
