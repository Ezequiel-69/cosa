/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Auto_ {
    private String marca, modelo, color, tipoTransmision, tipoCombustible;
    private int año, cantidadPuerta;
    private double cilindrada;

    public Auto_() {
        marca = "toyota";
        modelo = "corola";
    }

    public Auto_(String marca, String modelo, String color, String tipoTransmision, String tipoCombustible, int año, int cantidadPuerta, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoTransmision = tipoTransmision;
        this.tipoCombustible = tipoCombustible;
        this.año = año;
        this.cantidadPuerta = cantidadPuerta;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidadPuerta() {
        return cantidadPuerta;
    }

    public void setCantidadPuerta(int cantidadPuerta) {
        this.cantidadPuerta = cantidadPuerta;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Auto_{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipoTransmision=" + tipoTransmision + ", tipoCombustible=" + tipoCombustible + ", a\u00f1o=" + año + ", cantidadPuerta=" + cantidadPuerta + ", cilindrada=" + cilindrada + '}';
    }
    
    public static void main(String[] args) {
        
        Auto_ objAuto1 = new Auto_();
        System.out.println("mrca: " + objAuto1.getMarca());
        System.out.println("modelo: " + objAuto1.getModelo());
        
        System.out.println(objAuto1.toString());
        
        
        objAuto1.setModelo("yaria");
        System.out.println("mrca: " + objAuto1.getMarca());
        System.out.println("modelo: " + objAuto1.getModelo());
        
        Auto_ objAuto2 = new Auto_("vw", "escarabajo", "amarillo", "mecanio", "benvinero", 1981, 2, 1500);
        System.out.println("");
        System.out.println("marca: " + objAuto2.getMarca());
        System.out.println("modelo: "+ objAuto2.getModelo());
        
        System.out.println(objAuto2.toString());
        
        
        
    }
    
    
  
}

