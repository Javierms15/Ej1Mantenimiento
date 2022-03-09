package org.jms.Fibonacci;
/*
Javier Martín Sendra Software 3ºA
--------------------------------------------------------
Esta clase está compuesta por una función compute que nos devuelve la sucesión de Fibonacci
para el número pasado por parámetro.
--------------------------------------------------------
 */
public class Fibonacci {


    public Fibonacci(){

    }

    public int compute(int n){
        int a=0;
        int b=1;
        int c;

        if(n==0) {
            a=0;
        }else if(n==1){
            a=1;
        } else if(n<0){
            throw new RuntimeException("ERROR: Valor negativo");
        }else {
            for (int i = 0; i < n; i++) {
                c=b+a;
                a=b;
                b=c;
            }
        }
        return a;
    }


}
