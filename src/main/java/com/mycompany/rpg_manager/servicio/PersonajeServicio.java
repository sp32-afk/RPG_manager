package com.mycompany.rpg_manager.servicio;

public class PersonajeServicio {
    public static boolean esValido(String nombre, String clase, int nivel) {
        if (nombre == null || nombre.isEmpty() || nombre.length() > 20) {
            return false;
        }
        if (clase == null || !(clase.equalsIgnoreCase("Guerrero") || clase.equalsIgnoreCase("Mago") || clase.equalsIgnoreCase("Arquero"))) {
            return false;
        }
        if (nivel < 1 || nivel > 100) {
            return false;
        }
        return true;
    }
}
