/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LOGIC;

import java.util.ArrayList;

/**
 *
 * @author estadm
 */
public class Array <T>{
    private ArrayList<T> array;
    
    public Array(){
        array = new ArrayList();
    }
    public void ingresar(T data){
        array.add((T) data);
    }
    public int largo(){
        return array.size();
    }
    
    public void imprimir(){
        for (int i=0;i<array.size(); i++){
            System.out.println(array.get(i));
        }
    
    }
}
