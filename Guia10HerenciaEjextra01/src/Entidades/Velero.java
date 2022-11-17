
package Entidades;

/**
 *
 * @author Franoteros
 */
public class Velero extends Barco {
    
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, double eslora, String anioFab) {
        super(matricula, eslora, anioFab);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    //METODOS
    
    public double moduloVelero(){
        double modulo = super.calcModulo() + numMastiles;
        return modulo;
    }
    
    
    

}
