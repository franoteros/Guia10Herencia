
package Entidades;

/**
 *
 * @author Franoteros
 */
public class YateLujo extends Barco {
    
    private double potencia;
    private double numCamarotes;

    public YateLujo() {
    }

    public YateLujo(double potencia, double numCamarotes, String matricula, double eslora, String anioFab) {
        super(matricula, eslora, anioFab);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(double numCamarotes) {
        this.numCamarotes = numCamarotes;
    }


    //METODOS
    
    public double moduloYate(){
        double modulo = super.calcModulo() + numCamarotes + potencia;
        return modulo;
    }
    
    

}
