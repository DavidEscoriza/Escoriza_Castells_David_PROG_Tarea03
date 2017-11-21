package tarea03;

/**
 * Generamos la clase Rey
 * @author David
 */
public class Rey {
    private Color color;
    private Posicion posicion;
    
    
    /**
     * Generamos constructor de rey. 
     * @param color Color
     */
    public Rey(Color color){
        this.color=color;
        if (this.color==Color.BLANCO){
            this.posicion=new Posicion(1,'e');
        } else {
            this.posicion=new Posicion(8,'e');
        }
    }
    
    /**
     * Constructor por defecto de un Rey BLANCO.
     */
    public Rey(){
        this.color=Color.BLANCO;
            this.posicion=new Posicion(1,'e');
    }
    
    /**
     * Generamos metodo get para color.
     * @return Color
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * Generamos método get para posicion.
     * @return Posicion
     */    
    public Posicion getPosicion(){
        return this.posicion;
    }
    
    /**
     * Generamos método toString para devolver la posicion y el color del rey.
     * @return 
     */
    @Override
    public String toString(){
        return "El rey "+this.color+" está en la posición "+this.posicion.toString();
    }
    
    /**
     * Generamos el metodo mueve para desplazar al rey en la direccion que decidamos.
     * @param direccion Direccion
     */
    public void mueve(Direccion direccion){
        switch (direccion) {
            case NORTE:
                if (this.posicion.getFila()>=1 && this.posicion.getFila()<8){
                    this.posicion.setFila(this.posicion.getFila()+1);
                } else {
                    System.out.println("No puede moverse hacia el NORTE");
                }
                break;
            case SUR:
                if (this.posicion.getFila()>1 && this.posicion.getFila()<=8){
                    this.posicion.setFila(this.posicion.getFila()-1);
                } else {
                    System.out.println("No puede moverse hacia el SUR");
                }
                break;
            case OESTE:
                if (this.posicion.getColumna()>'a' && this.posicion.getColumna()<='h'){
                    this.posicion.setColumna((char) (this.posicion.getColumna()-1));
                } else {
                    System.out.println("No puede moverse hacia el OESTE");
                }
                break;
            case ESTE:
                if (this.posicion.getColumna()>='a' && this.posicion.getColumna()<'h'){
                    this.posicion.setColumna((char)(this.posicion.getColumna()+1));
                } else {
                    System.out.println("No puede moverse hacia el ESTE");
                }
                break;
            case NORESTE:
                if ((this.posicion.getFila()>=1 && this.posicion.getFila()<8) || (this.posicion.getColumna()>='a' && this.posicion.getColumna()<'h')){
                    this.posicion.setFila(this.posicion.getFila()+1);
                    this.posicion.setColumna((char)(this.posicion.getColumna()+1));
                } else {
                    System.out.println("No puede moverse hacia el NORESTE");
                }
                break;
            case NOROESTE:
                if ((this.posicion.getFila()>=1 && this.posicion.getFila()<8) || (this.posicion.getColumna()>'a' && this.posicion.getColumna()<='h')){
                    this.posicion.setFila(this.posicion.getFila()+1);
                    this.posicion.setColumna((char)(this.posicion.getColumna()-1));
                } else {
                    System.out.println("No puede moverse hacia el NOROESTE");
                }
                break;
            case SURESTE:
                if ((this.posicion.getFila()>1 && this.posicion.getFila()<=8) || (this.posicion.getColumna()>='a' && this.posicion.getColumna()<'h')){
                    this.posicion.setFila(this.posicion.getFila()-1);
                    this.posicion.setColumna((char)(this.posicion.getColumna()+1));
                } else {
                    System.out.println("No puede moverse hacia el NORESTE");
                }
                break;
            case SUROESTE:
                if ((this.posicion.getFila()>1 && this.posicion.getFila()<=8) || (this.posicion.getColumna()>'a' && this.posicion.getColumna()<='h')){
                    this.posicion.setFila(this.posicion.getFila()-1);
                    this.posicion.setColumna((char)(this.posicion.getColumna()-1));
                } else {
                    System.out.println("No puede moverse hacia el NORESTE");
                }
                break;
        }
    }
}
