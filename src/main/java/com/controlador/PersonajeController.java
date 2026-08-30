/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlador;

import com.mycompany.rpg_manager.Personaje;
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
/*
Javalin permite obtener los datos del formulario usando ctx.formParam("nombre_del_campo"), 
    donde el nombre dentro de las comillas debe coincidir exactamente con el 
    atributo name de tu <input> en el HTML.
Todo dato proveniente de un formulario HTML llega como texto (String).
*/
    
    public static void crear(Context ctx) {
    String nombre = ctx.formParam("nombre");
    String clase = ctx.formParam("clase");
    int nivel = Integer.parseInt(ctx.formParam("nivel"));
    int vida = 100; // Valor inicial por defecto
    Taberna.repositorioPersonajes.add(new Personaje(nombre, clase, nivel, vida));
   ctx.redirect("/");
    // 1. Instanciar el nuevo personaje
    // 2. Agregarlo a Taberna.repositorioPersonajes
    // 3. Redirigir la vista: ctx.redirect("/");
    }
}
