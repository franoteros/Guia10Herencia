
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
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
        return "Televisor{" + "precio=" + precio + ", color=" + color + 
                ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + 
                " resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Resolucion");
        resolucion=leer.nextInt();
        System.out.println("TDT");
        tdt=false;
        String tieneTDT = leer.next();
        if(tieneTDT.equalsIgnoreCase("si")){
            tdt=true;
        }else{
            tdt=false;
        }
    }
    
    public double precioFinal(){
        double precioRes=0;
        double precioTDT=0;
        if(resolucion>40){
            precioRes=0.3;
        }
        if(tdt==true){
            precioTDT=500;
        }else{
            precioTDT=0;
        }
        
        double precioTV=super.precioFinal()+(super.precioFinal()*precioRes)+precioTDT;
        return precioTV;
    }

    
    
    

}
