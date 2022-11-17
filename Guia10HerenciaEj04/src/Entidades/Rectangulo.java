
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class Rectangulo implements calculosFormas {
    
    private double area;
    private double perimetro;
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    
    //METODOS

    Scanner leer = new Scanner(System.in);
    
    public void ladosRectangulo(){
        System.out.println("Base");
        base=leer.nextDouble();
        System.out.println("Altura");
        altura=leer.nextDouble();
    }
    
    @Override
    public void calcularArea() {
        area=base * altura;
        System.out.println("Area= " + area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro=(base+altura)*2;
        System.out.println("Perimetro= " + perimetro);
    }
    
    
    

}
