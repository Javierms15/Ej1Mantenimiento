package org.jms.Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void computeTest2(){
        assertEquals(1,fibo.compute(2));
    }
    @Test
    public void computeTest3(){
        assertEquals(2,fibo.compute(3));
    }

    @Test
    public void computeTest4(){
        assertEquals(3,fibo.compute(4));
    }

    @Test
    public void computeTest5(){
        assertEquals(5,fibo.compute(5));
    }

    @Test
    public void computeTest6(){
        assertEquals(8,fibo.compute(6));
    }

    @Test
    public void computeTest7(){
        assertEquals(13,fibo.compute(7));
    }

    @Test
    public void computeTest8(){
        assertEquals(21,fibo.compute(8));
    }

    @Test
    public void computeTestNegative(){
        assertThrows(RuntimeException.class,()->fibo.compute(-1));
    }

}
