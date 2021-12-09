package com.example.docker;
import java.util.ArrayList;

public class Personas {
    private ArrayList<Persona> personas;

    public Personas() {
        personas = new ArrayList<Persona>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public Persona buscarPersona(int id) {
        for(Persona persona : personas) {
            if(persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }

    public void eliminarPersona(int id) {
        Persona persona = buscarPersona(id);
        if(persona != null) {
            personas.remove(persona);
        }
    }

    public void editarPersona(int id, String nombre, String apellidos, int edad) {
        Persona persona = buscarPersona(id);
        if(persona != null) {
            persona.setNombre(nombre);
            persona.setApellidos(apellidos);
            persona.setEdad(edad);
        }
    }

    public String listarPersonas() {
        String lista = "{\n";
        for(Persona persona : personas) {
            lista = lista + persona;
        }
        return lista;
    }
}
