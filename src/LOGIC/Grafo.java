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
    private int _tamañoGrafo;
    private float[][] _MatrizAdyacencia;
    private int _tamañoAnt;
    /**
     * Constructor
     */
    public Grafo(){
        nodos = new ArrayList();
        _tamañoGrafo = 0;
        _MatrizAdyacencia = null;
        _tamañoAnt = 0;
    }
    /**
     * agrega un nuevo nodo al grafo
     * @param id
     * @param puerto
     * @param tipo 
     */
    public void nuevoNodo(long id,int puerto,int tipo){ 
        nodos.add(new Nodo(id,puerto,tipo));
        _tamañoGrafo ++;
    }
    /**
     * Etablece una nueva coneccion entre dos nodos por medio sus numeros id
     * @param pId
     * @param pIp 
     */
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
    /**
     * Retorna un nodo a partir de un numero ID de este
     * @param pId
     * @return 
     */
    private Nodo NodoId(int pId){
        for(int i=0;i< nodos.size();i++){
            if(((Nodo)nodos.get(i)).getId() == pId)
                return (Nodo)nodos.get(i);
        }
        return null;
    }
    /**
     * Realiza un cambio entre un nodo externo y uno perteneciente a la lista.
     * @param lista
     * @param pnodo 
     */
    private void cambiar(ArrayList lista,Nodo pnodo){
        for(int i=0; i<lista.size(); i++){
            if(((Nodo)lista.get(i)).getId() == pnodo.getId()){
                lista.set(i,pnodo);
            }
        }
    
    }
    /**
     * Retorna un nodo a partir de un numero IP
     * @param pIp
     * @return Nodo 
     */
    private Nodo NodoIp(String pIp){
        for(int i=0;i< nodos.size();i++){
            if(((Nodo)nodos.get(i)).getIp().equals(pIp))
                return (Nodo)nodos.get(i);
        }
        return null;
    }
    /**
     * Hace las verificaciones de la matriz de adyacencia y de ser necesario llama a crearMatrizAdyacencia
     * @return float[][] _MatrizAdyacencia
     */
    public float[][] matrizAdyacente(){
        if(_tamañoAnt != _tamañoGrafo){
            _tamañoAnt= _tamañoGrafo;
            return crearMatrizAdyacente();
        }
        else
            return _MatrizAdyacencia;
    }
    /**
     * Imprime la matriz de Adyacencia
     */
    public void imprimirMatrizAdyacencia(){
        crearMatrizAdyacente();
        for(int i =0; i< _tamañoGrafo;i++){
            System.out.println("");
            for(int n=0; n<_tamañoGrafo;n++){
                System.out.print(" : "+_MatrizAdyacencia[i][n]);
            }
        }
    }
    /**
     * 
     * @param lista 
     */
    private void imprimirArrayList(ArrayList lista){
        System.out.println(lista.size());
        for(int i =0; i<lista.size();i++){
            System.out.print(".... "+((Nodo)lista.get(i)).getId());
        }
        System.out.println("");
        
    }
    /**
     * Creaa la matriza Adyacente 
     * @return float[][] _MatrizAdyacente
     */
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
    /**
     * Verifica si hay coneccion en tre un nodo y otro.
     * @param pContenedor
     * @param pNodo
     * @return boolean
     */
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
        Grafo grafo = new Grafo();
        grafo.nuevoNodo(1, 12, 1);
        grafo.nuevoNodo(2, 124,2);
        grafo.nuevoNodo(3, 156,3);
        grafo.newConeccion(1,3);
        grafo.newConeccion(3,1);
        grafo.imprimirMatrizAdyacencia();
    }
    
}
