package tarea03;

/**
 * Generamos la clase Posicion con los atributos 'fila' y 'columna'.
 * @author David
 */
public class Posicion {
    private int fila;
    private char columna;

/**
 * Constructor de clase.
 * @param fila de tipo entero. Si error en la fila por defecto es 1.
 * @param columna de tipo caracter. Si error en la columna por defecto es a.
 */    
    public Posicion (int fila, char columna){ 
        if (fila>=1 && fila<=8){
            this.fila=fila;
        } else {
            this.fila=1;
        }
        if (columna>='a' && columna<='h'){
            this.columna=columna;
        } else {
            this.columna='a';
        }
    }
    
    /**
     * Devuelve el valor de la posición fila.
     * @return La int
     */
    public int getFila(){
        return this.fila;
    }
    /**
     * Devuelve el valor de la columna.
     * @return char
     */
    public char getColumna(){
        return this.columna;
    }
    
    /**
     * Da valor a la fila.
     * @param fila int. Por defecto 1.
     */
    public void setFila(int fila){
        if (fila>=1 && fila<=8){
            this.fila=fila;
        } else {
            this.fila=1;
        }
    }
    
    /**
     * Da valor a la columna.
     * @param columna char. Por defecto a.
     */
    public void setColumna(char columna){
        if (columna>='a' && columna<='h'){
            this.columna=columna;
        } else {
            this.columna='a';
        }        
    }
    
    /**
     * Devuelve una cadena con los valores de fila y columna.
     * @return 
     */
    public String toString(){
        return "Fila: "+this.fila+". Columna: "+this.columna;
    }
}

