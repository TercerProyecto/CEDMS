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
public class Nodo {
    private int _Id;
    private int _Puerto;
    private int _tipo;
    private ArrayList _ListaConecciones;
    private float _Precio;
    private String _Ip;
    
    public Nodo(int pId, int pPuerto,int ptipo){
        this._Id = pId;
        this._Puerto = pPuerto;
        this._tipo = ptipo; 
        _ListaConecciones = null;
        _Precio=0;
    }
    public void setNewConexion(Nodo pNodo){
        _ListaConecciones.add(pNodo);
    }
    public void elimiarConexion(Nodo pNodo){
        _ListaConecciones.remove(pNodo);
    }
    public void setPrecio(int pPrecio){
        _Precio = pPrecio;
    }
    public float getPrecio(){
        return _Precio;
    }
    public ArrayList getConecciones(){
        return _ListaConecciones;
    }
    public void setIp(String pIp){
        _Ip = pIp;
    }
    public String getIp(){
        return _Ip;
    }
    public int getId(){
        return _Id;
    }
    
    
}
