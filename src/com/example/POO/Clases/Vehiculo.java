package com.example.POO.Clases;

public class Vehiculo {
    //1.Atributos
    public String fabricante;
    public String modelo;
    public String anio;
    public int velocidad;
    public Usuarios persona;
    //2.Constructores
    public Vehiculo (String fabricante, String modelo, String anio, Usuarios persona){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
        this.persona = persona;
    }
    //3.Metodos (comportamiento)
    public void acelerar(int quantity){
        this.velocidad = velocidad + quantity;
    }
}
