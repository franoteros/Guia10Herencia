
package Entidades;

/**
 *
 * @author Franoteros
 */
public class Perro extends Animal implements InterfaceAnimal {

    public Perro() {
    }
    
    

    @Override
    public String toString() {
        return "Perro";
    }
    
    
    
    @Override
    public void hacerRuido(){
        System.out.println("Guau");
    }

    @Override
    public void correr() {
        System.out.println("El perro levanta una pata a la vez para correr");
    }

}
