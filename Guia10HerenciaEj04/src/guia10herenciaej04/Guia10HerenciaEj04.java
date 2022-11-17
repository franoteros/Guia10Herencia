
package guia10herenciaej04;

 //* @author Franoteros
import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;


public class Guia10HerenciaEj04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Rectangulo r = new Rectangulo();
        Circulo c = new Circulo();
        
        r.ladosRectangulo();
        r.calcularArea();
        r.calcularPerimetro();
        
        System.out.println("Diametro");
        c.setDiametro(leer.nextDouble());
        c.calcularArea();
        c.calcularPerimetro();
        
    }

}
