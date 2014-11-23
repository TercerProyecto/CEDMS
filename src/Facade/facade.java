/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import LOGIC.Grafo;
import LOGIC.Main;

/**
 *
 * @author albin
 */
public class facade {
    Main main;
    LOGIC.Grafo grafo;
    
    public facade(){
        main = new Main();
        grafo = new Grafo();
    }
    public long getId(){
        return main.generarId();
    }
    public void crearNewNodo(int puerto,long id,int tipo){
        grafo.nuevoNodo(id, puerto, tipo);
    }
    
}
