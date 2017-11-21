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
}

