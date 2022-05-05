
package com.hazerta.lecciones;

/**
 *
 * @author Mudassar
 */
public class DatosPrimitivos {
    
    //Estructura de un método
    // [modificador de acceso [tipo de retorno] [indentificador][(argumentos si los hubiera)]
    
    public void maxValoresNumericos(int factor)
    {
        // Datos númericos enteros
        byte numByte = Byte.MAX_VALUE;
        short numshort = Short.MAX_VALUE;
        int numInt = Integer.MAX_VALUE;
        long numLong = Long.MAX_VALUE; // se pone 'L' al final del número que asignemos para diferenciarlo de int
        // Datos númericos con decimales
        float numFloat = Float.MAX_VALUE;  // se pone 'f' o 'F'
        double numDouble = Double.MAX_VALUE;

        System.out.println("Numero máximo Byte: " + numByte
                + "\nNumero máximo short: " + numshort
                + "\nNumero máximo int: " + numInt
                + "\nNumero máximo long: " + numLong
                + "\nNumero máximo float: " + numFloat
                + "\nNumero máximo double: " + numDouble);
        
    }
    
    public int sumar(int num1, int num2)
            {
                return  num1 + num2 + 10;
            }
     public int sumar(Integer num1, Integer num2)
            {
                return  num1 + num2 + 100;
            }
      public int sumar(long num1, long num2)
            {
                return (int) (num1 + num2 + 1000);
            }
       public int sumar(Long num1, Long num2)
            {
                return (int) (num1 + num2 + 10_000);
            }
    
    public char charEnMinusculas(char charCase)
    {
        if (Character.isLetter(charCase) && Character.isUpperCase(charCase))
        {
            return (char) (charCase + 32);
        }
        if(charCase>=65 && charCase<=90)
        {
            return (char) (charCase + 32);
        }
        return charCase;
    }
    public char charEnMinusculas(int charCase)
    {
        return (char) (charCase +32);
    }
    
}
