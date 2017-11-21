package tarea03;

import java.awt.BorderLayout;
import utilidades.Entrada;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
        int color, direccion;
        Rey rey;
        Posicion posicion;
        
        System.out.print("Introduce un número para seleccionar el color. 1 para Rey BLANCO, 2 para Rey NEGRO: ");
        do {
            color=Entrada.entero();
            if (color!=2 && color!=1){
                System.out.println("El color introducido no es válido.");
                System.out.print("Introduce un número para seleccionar el color. 1 para Rey BLANCO, 2 para Rey NEGRO: ");
            }
        } while (color<1 || color>2);
        
        if (color==1){
            rey=new Rey();
        } else {
            rey=new Rey(Color.NEGRO);
        }
        
        System.out.println(rey.toString());
        
        do {
            System.out.println("Selecciona el movimiento que quieras hacer.");
            System.out.println("1. Norte.");
            System.out.println("2. Noreste.");
            System.out.println("3. Este.");
            System.out.println("4. Sureste.");
            System.out.println("5. Sur.");
            System.out.println("6. Suroeste.");
            System.out.println("7. Oeste.");
            System.out.println("8. Noroeste.");
            System.out.println("9. Salir.");
            System.out.print("Introduce un número: ");
            direccion=Entrada.entero();
            
            switch (direccion){
                case 1:
                    rey.mueve(Direccion.NORTE);
                break;
                case 2:
                    rey.mueve(Direccion.NORESTE);
                break;
                case 3:
                    rey.mueve(Direccion.ESTE);
                break;
                case 4:
                    rey.mueve(Direccion.SURESTE);
                break;
                case 5:
                    rey.mueve(Direccion.SUR);
                break;
                case 6:
                    rey.mueve(Direccion.SUROESTE);
                break;
                case 7:
                    rey.mueve(Direccion.OESTE);
                break;
                case 8:
                    rey.mueve(Direccion.NOROESTE);
                break;
                case 9:
                    System.out.println("Fin de programa.");
                break;
                default:
                    System.out.println("Valor erroneo.");
            }
            
            System.out.println(rey.toString());
            
        } while (direccion!=9);
        
    }
}
