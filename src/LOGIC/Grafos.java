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
public class Grafos {
    private ArrayList nodos;
    private int _tamañoGrafo;
    private float[][] _MatrizAdyacencia;
    private int _tamañoAnt;
    
    public Grafos(){
        nodos = new ArrayList();
        _tamañoGrafo = 0;
        _MatrizAdyacencia = null;
        _tamañoAnt = 0;
    }
    public void nuevoNodo(int id,int puerto,int tipo){ 
        nodos.add(new Nodo(id,puerto,tipo));
        _tamañoGrafo ++;
    }
    public void newConeccion(int pId,int pIp){
        //Nodo ip = NodoIp(pIp);
        imprimirArrayList(nodos);
        Nodo id2= NodoId(pIp);
        Nodo id = NodoId(pId);
        if( id != null && id2 != null){
            id.setNewConeccion(id2);
            cambiar(nodos, id);
        }
    }
    private Nodo NodoId(int pId){
        for(int i=0;i< nodos.size();i++){
            if(((Nodo)nodos.get(i)).getId() == pId)
                return (Nodo)nodos.get(i);
        }
        return null;
    }
    private void cambiar(ArrayList lista,Nodo pnodo){
        for(int i=0; i<lista.size(); i++){
            if(((Nodo)lista.get(i)).getId() == pnodo.getId()){
                lista.set(i,pnodo);
            }
        }
    
    }
    private Nodo NodoIp(String pIp){
        for(int i=0;i< nodos.size();i++){
            if(((Nodo)nodos.get(i)).getIp().equals(pIp))
                return (Nodo)nodos.get(i);
        }
        return null;
    }
    public float[][] matrizAdyacente(){
        if(_tamañoAnt != _tamañoGrafo){
            _tamañoAnt= _tamañoGrafo;
            return crearMatrizAdyacente();
        }
        else
            return _MatrizAdyacencia;
    }
    public void imprimirMatrizAdyacencia(){
        crearMatrizAdyacente();
        for(int i =0; i< _tamañoGrafo;i++){
            System.out.println("");
            for(int n=0; n<_tamañoGrafo;n++){
                System.out.print(" : "+_MatrizAdyacencia[i][n]);
            }
        }
    }
    
    private void imprimirArrayList(ArrayList lista){
        System.out.println(lista.size());
        for(int i =0; i<lista.size();i++){
            System.out.print(".... "+((Nodo)lista.get(i)).getId());
        }
        System.out.println("");
        
    }
    private float[][] crearMatrizAdyacente(){
         _MatrizAdyacencia = new float[_tamañoGrafo][_tamañoGrafo];
        for(int i=0; i<_tamañoGrafo;i++){
            ArrayList listaEnlases = (((Nodo)nodos.get(i)).getConecciones());
            imprimirArrayList(listaEnlases);
            for(int n=0; n<_tamañoGrafo;n++){
                if(esConeccion(listaEnlases,(Nodo)nodos.get(n)))
                    _MatrizAdyacencia[i][n] = 1;
                else
                    _MatrizAdyacencia[i][n]=0;
            }
        }
        return _MatrizAdyacencia;
    
    }
    private boolean esConeccion(ArrayList pContenedor, Nodo pNodo){
        for(int i=0; i< pContenedor.size();i++){
            if(pContenedor.get(i) == pNodo){
                return true;
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafos grafo = new Grafos();
        grafo.nuevoNodo(1, 12, 1);
        grafo.nuevoNodo(2, 124,2);
        grafo.nuevoNodo(3, 156,3);
        grafo.newConeccion(1,3);
        grafo.newConeccion(3,1);
        grafo.imprimirMatrizAdyacencia();
    }
    
}
