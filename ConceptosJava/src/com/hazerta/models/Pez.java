
package com.hazerta.models;

/**
 *
 * @author Mudassar
 */
public class Pez extends Animal {
    
    private String especie;

    public Pez(String especie, float peso, short edad, String color) {
        super(peso, edad, color);
        this.especie = especie;
    }



    public Pez() {
    }
    
    
    
}
