package org.jms.Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Javier Martín Sendra Software 3ºA
--------------------------------------------------------
Esta clase está compuesta por diferentes test para comprobar el buen funcionamiento del método compute de la clase
Fibonacci.
Comprobamos los siguientes casos de prueba con diferentes asserts:
-Caso número 0
-Caso número 1
-Caso cualquier numero mayor que uno
-Caso numero negativo(salta excepcion)
--------------------------------------------------------
 */
public class FibonacciTest {

    private final Fibonacci fibo=new Fibonacci();

    @Test
    public void computeTest0(){
        assertEquals(0,fibo.compute(0));
    }

    @Test
    public void computeTest1(){
        assertEquals(1,fibo.compute(1));
    }


}
