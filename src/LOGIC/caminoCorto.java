/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIC;

import java.io.IOException;

/**
 *
 * @author Ellioth
 */
public class caminoCorto {
    //private Lista matriz;
    //private Lista CompList;
    private Grafo Principal;
    
    public caminoCorto() throws IOException{
        //matriz =new Lista();
        //CompList= new Lista();
        Principal= new Grafo();
    }
 
    /**
     * metodo para hacer la matriz del recorrido mas corto para el grafo
     * @param _Vector
     * @throws IOException 
     */
    public void setPesos(Object _Vector) throws IOException{
        /*nodee varComp= CompList.getHead();
        Lista listVector= new Lista();
        for (int i=0; i<CompList.length(); i++){
            listVector.insertTail(getDistancia(_Vector,varComp));
            varComp=varComp.getNext();
        }
        varComp=CompList.getHead();
        nodee variableMatriz2=matriz.getHead();
        Lista ListMatriz= (Lista)variableMatriz2.get_data();
        for(int i=0; i<matriz.length(); i++){
            ListMatriz.insertTail(getDistancia(varComp,_Vector));
            varComp =varComp.getNext();
            variableMatriz2 =variableMatriz2.getNext();
            ListMatriz= (Lista)variableMatriz2.get_data();
        }
        matriz.insertTail(listVector);
        */
    }
    /**
     * metodo que devuelve el dato del valor del camino directo entre dos nodos.
     * @param pDato1
     * @param pDato2
     * @return 
     */
    public int getDistancia(Object pDato1, Object pDato2){
        int temp=0;
        //if(Principal.conexion(pDato1,pDato2)>=0)
           // temp=Principal.conexion(pDato1,pDato2);
        return temp;
    }
    
}
