
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + 
                ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + 
                " carga=" + carga + '}';
    }

//METODOS

    
//    public void crearLavadora(){
//        Scanner leer = new Scanner(System.in);
//        super.crearElectrodomestico();
//        System.out.println("Carga");
//        carga=leer.nextInt();
//    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Carga");
        carga=leer.nextInt();
    }
    
    public double precioFinal(){
        double precioLavadora = 0;
        double precioCarga = 0;
        if(carga>30){
            precioCarga=500;
        }
        precioLavadora=super.precioFinal()+precioCarga;
        return precioLavadora;
    }
    
    

}
