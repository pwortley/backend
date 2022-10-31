package com.proyecto.backend.Service;

import com.proyecto.backend.Entity.Persona;
import com.proyecto.backend.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}