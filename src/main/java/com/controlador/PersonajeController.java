/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlador;

import com.mycompany.rpg_manager.Taberna;
import io.javalin.http.Context;

/**
 *
 * @author FAMILIAR
 */
public class PersonajeController {
    public static void obtenerTodos(Context ctx) {
        ctx.json(Taberna.repositorioPersonajes);
    }
}
