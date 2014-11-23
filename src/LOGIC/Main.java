/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LOGIC;
import java.util.Random;

/**
 *
 * @author estadm
 */
public class Main {
    public long generarId(){
        Random rmd = new Random();
        String numero= "";
        long num=0;
        long cont =1;
        for(int i=0; i<16; i++){
            int x = rmd.nextInt(10);
            num += x*cont;
            cont= cont * 10;
        }
        return num;
    }
    
    public static void main(String[] args) {
        //Main main = new Main();
        //System.out.println(main.generarId());
        buscar c = new buscar();
        c.Buscar("source");
    }
    
}

