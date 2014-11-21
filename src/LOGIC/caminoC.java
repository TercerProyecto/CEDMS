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
public class caminoC {
    private Lista matriz;
    private Lista Comp;
    private Grafo Prinp;
    
    public caminoC() throws IOException{
        matriz =new Lista();
        Comp= new Lista();
        Prinp= new Grafo();
    }
 
    public void setPesos(Nodo _Vector) throws IOException{
        Nodo tmp= Comp.getHead();
        Lista temp= new Lista();
        for (int i=0; i<Comp.length(); i++){
            temp.insertTail(getDistancia(_Vector,tmp));
            tmp=tmp.getNext();
        }
        tmp=Comp.getHead();
        Nodo tmp2=matriz.getHead();
        Lista Ltmp= (Lista)tmp2.get_data();
        for(int i=0; i<Comp.length(); i++){
            Ltmp.(getDistancia(tmp,_Vector));
            tmp=tmp.getNext();
            tmp2=tmp2.getNext();
            Ltmp= (Lista)tmp2.get_data();
        }
        matriz.;
    }
    
    public int getDistancia(Nodo pDato1, Nodo pDato2){
        int temp=0;
        if(Prinp.conexion(pDato1,pDato2)>=0)
            temp=Prinp.conexion(pDato1,pDato2);
        else
            temp;
        return temp;
    }
    
    public static void main (String []args) throws IOException {
        Lista list= new Lista();
        list.
    }
}
