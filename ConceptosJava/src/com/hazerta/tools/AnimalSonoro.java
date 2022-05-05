
package com.hazerta.tools;

@FunctionalInterface
public interface AnimalSonoro<F> { // <F> ->   Tipo de dato generic. Se espesicifica cuando lo implementamos en la clase. Se puede usar cualquier letra pero convención ..
    
    int NUMERO = 10; // public static final (de forma implicita)
     
    void emitirSonido(); // public abstract (de forma implicita)
    
    private int metodoPrivado() 
    {
        int numeroModificado = NUMERO+1;
        return numeroModificado;
    }
    
    default void metodoDefault (F t, int num)
    {
        int result =  num + metodoPrivado();
        
        
        System.out.println("El animal" + t.toString()+" emite "+ result+" sonidos.");
    }
    
    static void sonidoApareamiento()
    {
        System.out.println("Grara grrgrr");
    }
    
}
