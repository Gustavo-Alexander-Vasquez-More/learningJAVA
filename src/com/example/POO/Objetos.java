package com.example.POO;

import com.example.POO.Clases.Usuarios;
import com.example.POO.Clases.Vehiculo;

public class Objetos {
    public static void main(String[] args) {
    // Clase identificador = new Clase()
        Usuarios persona1= new Usuarios("Juan García", "tavovm24@hotmail.com","sdsdsdsd","hola123");
        System.out.println(persona1.nombre);
        Vehiculo toyotaPrius= new Vehiculo("Toyota","Prius", "2024", persona1);
        System.out.println(toyotaPrius.persona.nombre);



     }
}
