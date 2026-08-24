/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpg_manager;

import controlador.PersonajeController;
import io.javalin.Javalin;

/**
 *
 * @author Estudiante
 */
public class RPG_manager {

    public static void main(String[] args) {
        // 1. Agregamos un personaje de prueba a la taberna
        Taberna.repositorioPersonajes.add(new Personaje("Aragorn", "Guerrero", 10, 100));

        // 2. Iniciamos Javalin en el puerto 7070
        Javalin app = Javalin.create().start(7070);

        // 3. Mapeamos la ruta GET para consultar los personajes
        app.get("/personajes", PersonajeController::obtenerTodos);
    }
}

