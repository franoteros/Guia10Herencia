
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class Alquiler {
    Scanner leer = new Scanner (System.in);
    
    private String nomCliente;
    private String dniCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nomCliente, String dniCliente, Date fechaAlquiler, Date fechaDevolucion, String posAmarre, Barco barco) {
        this.nomCliente = nomCliente;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }
    
    public int diasAlquilado(){
        long startTime = setearFechaAlq().getTime();
        long endTime = setearFechaDev().getTime();
        long diasDesde = (long) Math.floor(startTime / (1000*60*60*24)); 
        long diasHasta = (long) Math.floor(endTime / (1000*60*60*24)); 
        long dias = diasHasta - diasDesde;
        System.out.println("Dias = " + dias);
        return (int) dias;
    }
    
    public Date setearFechaAlq(){
        System.out.println("Año alquiler");
        int year = leer.nextInt();
        System.out.println("Mes alquiler");
        int month = leer.nextInt() + 1;
        System.out.println("Dia alquiler");
        int day = leer.nextInt();
        fechaAlquiler = new Date(year, month, day);
        return fechaAlquiler;
    }
    
     public Date setearFechaDev(){
        System.out.println("Año devolucion");
        int year = leer.nextInt();
        System.out.println("Mes devolucion");
        int month = leer.nextInt() + 1;
        System.out.println("Dia devolucion");
        int day = leer.nextInt();
        fechaDevolucion = new Date(year, month, day);
        return fechaDevolucion;
    }
    
    public void crearAlquiler(){
        double precioAlq;
        double alq;
        System.out.println("Cliente");
        nomCliente = leer.next();
        System.out.println("Dni cliente");
        dniCliente = leer.next();
        System.out.println("Posicion amarre");
        posAmarre = leer.next();
        System.out.println("Tipo de barco");
        System.out.println("1-Velero");
        System.out.println("2-A motor");
        System.out.println("3-Yate");
        String eleccion = leer.next();
        switch(eleccion){
            case "1":
                Velero v = new Velero();
                System.out.println("Eslora velero");
                v.setEslora(leer.nextDouble());
                System.out.println("Numero de mastiles del velero");
                v.setNumMastiles(leer.nextInt());
                precioAlq = diasAlquilado() * v.moduloVelero();
                System.out.println("El precio de alquiler es " + precioAlq);
                break;
            case "2":
                BarcoMotor bm = new BarcoMotor();
                System.out.println("Eslora barco a motor");
                bm.setEslora(leer.nextDouble());
                System.out.println("Potencia Barco a motor");
                bm.setPotencia(leer.nextDouble());
                precioAlq = diasAlquilado() * bm.moduloMotor();
                System.out.println("El precio de alquiler es " + precioAlq);
                break;
            case "3":
                YateLujo y = new YateLujo();
                System.out.println("Eslora yate");
                y.setEslora(leer.nextDouble());
                System.out.println("Potencia yate");
                y.setPotencia(leer.nextDouble());
                System.out.println("Numero de camarotes");
                y.setNumCamarotes(leer.nextDouble());
                precioAlq = diasAlquilado() * y.moduloYate();
                System.out.println("El precio de alquiler es " + precioAlq);
                break;
        }
    }
    
    
    

}
