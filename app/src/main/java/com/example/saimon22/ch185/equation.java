package com.example.saimon22.ch185;

/**
 * Created by SAimon22 on 8/29/2017.
 */

public class equation {
    public static double equation(double x){
        if( x == 0){
            return 0;
        }else{
            return (((2*x)/(2*x+1))+ equation(x-1));
        }

    }
}
