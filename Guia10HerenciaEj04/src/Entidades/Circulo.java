
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class Circulo implements calculosFormas {
    
    private double area;
    private double perimetro;
    private double diametro;

    public Circulo() {
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getDiametro() {
        return diametro;
    }

    public static double getPI() {
        return PI;
    }
    
    Scanner leer = new Scanner(System.in);

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void calcularArea() {
        area=PI*(Math.pow((diametro/2),2));
        System.out.println("Area= " + area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro=PI*diametro;
        System.out.println("Perimetro= " + perimetro);
    }

}
