/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.primerproyecto.Controller;

import com.portfolio.primerproyecto.Entity.Experiencia;
import com.portfolio.primerproyecto.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping ("/experiencias/traer")
    public List<Experiencia> getExperiencia() {
        return iexperienciaService.GetExperiencia();
    }
    
    @PostMapping("/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia) {
        iexperienciaService.saveExperiencia(experiencia);
        return "la experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/experiencias/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
    return "la experiencia fue eliminada correctamente";
    }   
    
    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                               @RequestParam("nombre_de_empresa")String nuevoNombre_de_empresa,
                               @RequestParam("nombre_del_puesto")String nuevoNombre_del_puesto,
                               @RequestParam("fecha_inicio")String nuevoFecha_inicio,
                               @RequestParam("fecha_fin")String nuevoFecha_fin,
                               @RequestParam("img_empresa")String nuevoImg_empresa,
                               @RequestParam("descripcion_empresa")String nuevoDescripcion_empresa){
    Experiencia experiencia = iexperienciaService.findExperiencia(id);
    experiencia.setNombre_de_empresa(nuevoNombre_de_empresa);
    experiencia.setNombre_del_puesto(nuevoNombre_del_puesto);
    experiencia.setFecha_inicio(nuevoFecha_inicio);
    experiencia.setFecha_fin(nuevoFecha_fin);
    experiencia.setImg_empresa(nuevoImg_empresa);
    experiencia.setDescripcion_empresa(nuevoDescripcion_empresa);
    
    iexperienciaService.saveExperiencia(experiencia);
    return experiencia;
    
}
    
    @GetMapping("/experiencias/traer/perfil")
    public Experiencia findExperiencia() {
       return iexperienciaService.findExperiencia((long)1);
    }
}