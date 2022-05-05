
package com.hazerta.models;

import com.hazerta.tools.AnimalSonoro;
import java.io.Serializable;

/**
 *
 * @author Mudassar
 */
public class Ave extends Animal implements AnimalSonoro<Ave>, Serializable {

    private transient int numPatas;

    public Ave(int numPatas, float peso, int edad, String color) {
        super(peso, edad, color);
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    

    public Ave() {
    }

    @Override
    public void emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
