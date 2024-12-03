package com.example.estructurasDeControl.Condicionales;

public class Estructura_switch {
    public static void main(String[] args) {
        String dia= "Martes";

        switch (dia){
            case "Lunes":
                System.out.println("Hoy es Lunes");
                break; //Es para que si evalúa que este caso es correcto se corte la ejecución acá
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
        }
    }
}
