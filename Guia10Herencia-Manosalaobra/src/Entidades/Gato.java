
package Entidades;

/**
 *
 * @author Franoteros
 */
public class Gato extends Animal implements InterfaceAnimal {

    public Gato() {
    }
    
    

    @Override
    public String toString() {
        return "Gato";
    }
    
    
    
    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    }

    @Override
    public void correr() {
        System.out.println("El gato corre levantando de a 2 patas juntas");
    }

}
