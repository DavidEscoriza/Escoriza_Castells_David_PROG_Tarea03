package tarea03;

/**
 *
 * @author David
 */
public class Posicion {
    private int fila;
    private char columna;
    
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
    
    public int getFila(){
        return this.fila;
    }
    
    public char getColumna(){
        return this.columna;
    }
    
    public void setFila(int fila){
        if (fila>=1 && fila<=8){
            this.fila=fila;
        } else {
            this.fila=1;
        }
    }
    
    public void setColumna(char columna){
        if (columna>='a' && columna<='h'){
            this.columna=columna;
        } else {
            this.columna='a';
        }        
    }
    
    public String toString(){
        return "Fila: "+this.fila+". Columna: "+this.columna;
    }
}

