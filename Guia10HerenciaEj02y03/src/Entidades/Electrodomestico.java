
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected String consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
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
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + 
                ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    //METODOS
    
    private void comprobarConsumo(String consumoEnergetico){
        if(consumoEnergetico.equalsIgnoreCase("a")|| consumoEnergetico.equalsIgnoreCase("b")
            || consumoEnergetico.equalsIgnoreCase("c") || consumoEnergetico.equalsIgnoreCase("d")
            || consumoEnergetico.equalsIgnoreCase("e") || consumoEnergetico.equalsIgnoreCase("f")){
            System.out.println("Consumo=" + consumoEnergetico.toUpperCase());
        }else{
            consumoEnergetico = "F";
            System.out.println("Consumo=" + consumoEnergetico.toUpperCase());
        }  
    }
    
    private void comprobarColor(String color){
        if(color.equalsIgnoreCase("b")||color.equalsIgnoreCase("n")||
                color.equalsIgnoreCase("r")||color.equalsIgnoreCase("a")
                ||color.equalsIgnoreCase("g")){
            System.out.println("Color:" + color.toUpperCase());
        }else{
            color="B";
            System.out.println("Color:" + color.toUpperCase());
        }
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Precio:");
        precio = leer.nextDouble();
        System.out.println("Color");
        color = leer.next();
        comprobarColor(color);
        System.out.println("Consumo");
        consumoEnergetico = leer.next();
        comprobarConsumo(consumoEnergetico);
        System.out.println("Peso");
        peso = leer.nextInt();
    }
    
    public double precioFinal(){
        double precioLetra=0.0;
        double precioPeso=0.0;
        double precioFinal;
        
        switch(consumoEnergetico.toUpperCase()){
            case "A":
                precioLetra=1000;
                break;
            case "B":
                precioLetra=800;
                break;
            case "C":
                precioLetra=600;
                break;
            case "D":
                precioLetra=500;
                break;
            case "E":
                precioLetra=300;
                break;
            case "F":
                precioLetra=100;
                break;   
            default:
                precioLetra=100;
        }
        
        if(peso>=1 && peso<=19){
            precioPeso=100;
        }
        if(peso>=20 && peso<=49){
            precioPeso=500;
        }
        if(peso>=50 && peso<=79){
            precioPeso=800;
        }
        if(peso>80){
            precioPeso=1000;
        }

        precioFinal = precioLetra + precioPeso+precio;
        return precioFinal;
    }

}
