/**
 * Last edition: 10/30/2014
 */

/**
 * package Logic
 */
package LOGIC;
/**
 * Import the libraries needed for the class
 */
import java.io.IOException;

/**
 * Class to manipulate all related with list
 * @author Albin, Jairo and Ellioth
 * @param <T> (type T)
 */
public class Lista <T>{
    private Nodo _head;
    private Nodo _tail;
    /**
     * Constructor of the class
     * @throws IOException 
     */   
    public Lista() throws IOException{
        this._head=null;
        this._tail=null;
    }
    /**
     * Get to obtain any element of the list
     * @param tmp
     * @return element of the list
     */
    public T getData(Nodo tmp){
        return (T) (tmp.get_data());
    }
    /**
     * Set to change any data in the element of the list
     * @param tmp
     * @param pdata 
     */
    public void setData(Nodo tmp,T pdata){
        tmp.set_data(pdata);
    }
    /**
     * Get to obtain the next node 
     * @param tmp
     * @return Node
     */
    public Nodo listaGetNext(Nodo tmp){
        tmp=tmp.getNext();
        return tmp;
    }
    /**
     * Get to obtain the head of the list
     * @return Node
     */
    public Nodo getHead(){
        return _head;
    }
    /**
     * Method to insert elements in the list
     * @param pData (type T)
     */
    public void insertHead(T pData){
       if(_head==null){
            _head =_tail= new Nodo(pData);
        }
        else{
            Nodo tmp = new Nodo(pData);
            tmp.setNext(_head);
            _head.setAnterior(tmp);
            _head=tmp;
        }
    }
    /**
     * Method to search elements in the list
     * @param pData (element to search)
     * @return boolean value (true if element is or false it isn't)
     */
    public boolean buscar(String pData){
        Nodo tmp;
        Nodo cont = _head;
        while(cont!=null){
            tmp = ((Lista)cont.get_data())._head;
            if(pData.substring(0,1).equals(((String)tmp.get_data()).substring(0,1))){
                while(tmp!=null){
                   if(pData.equals((String)tmp.get_data())){
                       return true;
                   }
                   tmp=tmp.getNext();
                }
            }
           cont=cont.getNext();
        }
        return false;
    }
    /**
     * Method to delete any element in the list
     * @param elemento (element to delete)
     */
    public void delete(T elemento){ 
        boolean estado;
        estado= false;
        Nodo tmp = _head;
        
        if(_head == _tail){
               _head = _tail = null;
               estado= true;
        }        
        if(_head.get_data().equals(elemento)){
            Nodo tmp2= _head;
            _head=_head.getNext();
            tmp2.setNext(null);
            _head.setAnterior(null);
            estado=true;
        }
        if(_tail.get_data().equals(elemento)&& estado==false){
               Nodo tmp2 = _tail;
               _tail= tmp2.getAnterior();
               tmp2.setAnterior(null);
               _tail.setNext(null);
               estado=true;
        }                
        if (estado == false){
            while(tmp != null){
                if(tmp.get_data().equals(elemento)){
                    tmp.getNext().setAnterior(tmp.getAnterior());
                    tmp.getAnterior().setNext(tmp.getNext());
                    tmp.setAnterior(null);
                    tmp.setNext(null);
                    tmp = null;
                }
                else{
                    tmp=tmp.getNext();
                }
            }
        }
    }
    
    //Busca una palabra de la lista para compararla.
    /**
     * Method to search any word and compare this
     * @param pdata
     * @return boolean value (true if the word is equals)
     */
    public boolean buscarSimple(String pdata){
        Nodo tmp;
        tmp=_head;
        while ((tmp!= null)){
            if(tmp.get_data().equals(pdata)){
                return true;
            }
            else
                tmp=tmp.getNext();
        }
        return false;
    }
    /**
     * Method to impress the list
     * @param lista 
     */
    public void imprimir(Lista lista) {
        Nodo tmp= _head;
        int cont=0;
        while(tmp!=null){
            cont++;
            System.out.println(((" "+cont+":"+tmp.get_data())));
            tmp=tmp.getNext();
        }   
    }
   public int length(){
       int cont =0;
       Nodo tmp = _head;
       while(tmp!= null){
           cont++;
           tmp = tmp.getNext();
       }
       return cont;
   }
}