package tarea03;

/**
 * 
 * @author David
 */
public class Rey {
    private Color color;
    private Posicion posicion;
    
    public Rey(Color color){
        this.color=color;
        if (this.color==Color.BLANCO){
            this.posicion.setFila(1);
            this.posicion.setColumna('e');
        } else {
            this.posicion.setFila(8);
            this.posicion.setColumna('e');
        }
    }
    
    public Rey(){
        this.color=Color.BLANCO;
        this.posicion.setFila(1);
        this.posicion.setColumna('e');
    }
}
