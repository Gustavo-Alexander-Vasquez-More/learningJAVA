package com.example.estructurasDeControl.Bucles;

public class BucleForEach {
    public static void main(String[] args) {
        String[] nombres={"Juana", "Luis","Nancy"};
        for (String nombre: nombres ){
            System.out.println(nombre); //Bucle for each es mejor para recorrer Arrays
        }
    }
}
