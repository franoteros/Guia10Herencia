
package Entidades;

/**
 *
 * @author Franoteros
 */
public class BarcoMotor extends Barco {
    
    private double potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(double potencia, String matricula, double eslora, String anioFab) {
        super(matricula, eslora, anioFab);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    //METODOS
    
    public double moduloMotor(){
        double modulo = super.calcModulo() + potencia;
        return modulo;
    }

}
