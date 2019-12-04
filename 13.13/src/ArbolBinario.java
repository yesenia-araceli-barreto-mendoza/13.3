
public class ArbolBinario {

    //EJERCICIO 13.3
    public static void main(String[] args) {
        // TODO code application logic here
    Arbol ar=new Arbol(23);
    Nodo nuevo=new Nodo(14);
    ar.agregar(nuevo,ar.getRaiz());
    ar.recorrerPreorden(ar.getRaiz());
    }
    
}
