
package guia10herenciaej02y03;

 //* @author Franoteros
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;


public class Guia10HerenciaEj02y03 {

    public static void main(String[] args) {
        
        Electrodomestico E = new Electrodomestico();
        Lavadora L = new Lavadora();
        Televisor T = new Televisor();
        
        System.out.println("Lavadora");
        L.crearLavadora();
        System.out.println("Precio lavadora 1: " + L.precioFinal());
        
        System.out.println("TV");
        T.crearTelevisor();
        System.out.println("Precio televisor 1: " + T.precioFinal());
        
        ArrayList <Electrodomestico> artefactos= new ArrayList();
        
        Lavadora L2 = new Lavadora();
        Televisor T2 = new Televisor();
        
        System.out.println("Lavadora 2");
        L2.crearLavadora();
        System.out.println("Precio lavadora 2: " + L2.precioFinal());
        
        System.out.println("TV 2");
        T2.crearTelevisor();
        System.out.println("Precio televisor 2: " + T2.precioFinal());
        
        artefactos.add(L);
        artefactos.add(L2);
        artefactos.add(T);
        artefactos.add(T2);
        
        double contador = 0;
        for(Electrodomestico suma : artefactos){
            contador=contador+suma.precioFinal();
        }
        
        System.out.println("La suma de los 4 artefactos es " + contador);
        
    }

}
