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
public class Grafo {
    private ArrayList nodos;
    private int numeroNodos;
    private float[][] _MatrizAdyacencia;
    
    public Grafo(){
        nodos = null;
        numeroNodos = 0;
        _MatrizAdyacencia = null;
    }
    public void nuevoNodo(int id,int puerto,int tipo){ 
        nodos.add(new Nodo(id,puerto,tipo));
        numeroNodos ++;
    }
    public void newConeccion(int pId,String pIp){
        Nodo ip = NodoIp(pIp);
        Nodo id = NodoId(pId);
        if( id != null && ip != null){
            id.setNewConexion(id);
        }
    }
    private Nodo NodoId(int pId){
        for(int i=0;i< nodos.size();i++){
            if(((Nodo)nodos.get(i)).getId() == pId)
                return (Nodo)nodos.get(i);
            else
                return null;
        }
        return null;
    }
    private Nodo NodoIp(String pIp){
        for(int i=0;i< nodos.size();i++){
            if(((Nodo)nodos.get(i)).getIp().equals(pIp))
                return (Nodo)nodos.get(i);
            else
                return null;
        }
        return null;
    }
    public int[][] matrizAdyacente(){
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
}
