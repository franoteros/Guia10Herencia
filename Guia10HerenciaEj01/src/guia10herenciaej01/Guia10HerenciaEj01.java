
package guia10herenciaej01;

 //* @author Franoteros
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;


public class Guia10HerenciaEj01 {

    public static void main(String[] args) {
        
        Animal p = new Perro("Matilde", "granos", 8, "callejera");
        p.alimentarse();
        
        Animal g = new Gato("Garfield", "atun", 3, "Naranja");
        g.alimentarse();
        
        Animal c = new Caballo("Mostro", "pasto", 2, "de carrera");
        c.alimentarse();
    }

}
