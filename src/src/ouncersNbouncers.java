/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Random;
import java.util.random.RandomGenerator;

/**
 *
 * @author Aluno
 */
public class ouncersNbouncers {
    
    public void ouncer(){
    }
    public void ouncer(int weight){
        weight = generator();
    }
    public static int generator(){
        Random r = new Random();
        return r.nextInt(10000);
    }
}

