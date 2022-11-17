
package Entidades;


/**
 *
 * @author Franoteros
 */
public class Barco {
    
    private String matricula;
    private double eslora;
    private String anioFab;

    public Barco() {
    }

    public Barco(String matricula, double eslora, String anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setAnioFab(String anioFab) {
        this.anioFab = anioFab;
    }

    public double getEslora() {
        return eslora;
    }
    
    
    
    //METODOS
    
    public double calcModulo(){
        double modulo = eslora * 10;
        return modulo;
    }

}
