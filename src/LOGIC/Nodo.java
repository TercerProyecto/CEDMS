/**
 * Last edition: 10/30/2014
 */

/**
 * Package "Logic"
 */
package LOGIC;

/**
 * @author Albin, Jairo and Ellioth
 * This class create the nodes
 */
public class Nodo <T>{
    private T _data;
    private Nodo _next;
    private Nodo _anterior;
    
    /**
     * Constructor of the class
     * @param pData 
     */
    public Nodo(T pData){
        this._data=pData;
    }
    /**
     * Get to know the data of the node
     * @return value T (the data of the node)
     */
    public T get_data(){
        return this._data;
    }
    /**
     * Set to change the data of the node
     * @param pdata (type T) 
     */
    public void set_data(T pdata){
        _data=pdata;
    }
    /**
     * Set to change the next node
     * @param next (type Node)
     */
    public void setNext(Nodo next){
        this._next = next;
    }
    /**
     * Set to change the previous node
     * @param anterior (type Node)
     */
    public void setAnterior(Nodo anterior){
        this._anterior=anterior;
    }
    /**
     * Get to know the next node
     * @return node (next node)
     */
    public Nodo getNext(){
        return _next;
    }
    /**
     * Get to know the previous node
     * @return node (previous node)
     */
    public Nodo getAnterior(){
        return _anterior;
    }
}
