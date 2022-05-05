package com.hazerta.models;

public class Animal {

    private float peso;
    private int edad;
    private String color;

    public Animal(float peso, int edad, String color) {
        this.peso = peso;
        this.edad = edad;
        this.color = color;
    }

    public Animal() {
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", edad=" + edad + ", color=" + color + '}';
    }
    
    
    

}
