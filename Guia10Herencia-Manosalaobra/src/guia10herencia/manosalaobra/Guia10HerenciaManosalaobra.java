
package guia10herencia.manosalaobra;

 //* @author Franoteros
import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;


public class Guia10HerenciaManosalaobra {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        Perro b = new Perro();
        Gato c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for( Animal aux : animales){
            if(aux.toString().equals("Animal")){
            System.out.print("El " + aux.toString() + " dice ");
            aux.hacerRuido();
            }else{
            System.out.print("El " + aux.toString() + " hace ");
            aux.hacerRuido();
            }
        }
        
       b.correr();
       c.correr();
       b.escapar();
       c.escapar();
        
        
        
        
        
        
        
    }   
}
