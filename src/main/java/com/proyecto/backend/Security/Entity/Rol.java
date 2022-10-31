package com.proyecto.backend.Security.Entity;

import com.proyecto.backend.Security.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

/**
 *
 * @author HP
 */
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
    
    //Constructor
    public Rol() {
    }

    @SuppressWarnings("NonPublicExported")
    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @SuppressWarnings("NonPublicExported")
    public RolNombre getRolNombre() {
        return rolNombre;
    }

    @SuppressWarnings("NonPublicExported")
    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    static class RolNombre {

        public RolNombre() {
        }

        String name() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
    
}