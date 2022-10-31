package com.proyecto.backend.Repository;

import com.proyecto.backend.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}