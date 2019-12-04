/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author ivanu
 */
public class Nodo {
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;
    
    public Nodo(Object dato) {
        this.dato = dato;
        izdo=dcho=null;
    }
    
    public Nodo(Object dato, Nodo izquierdo, Nodo derecho) {
        this.dato = dato;
        this.izdo = izquierdo;
        this.dcho = derecho;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }

    

}
