package org.kvittor.gesiton_vehiculo.base;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addVehiculo(Vehiculo vehiculo){

    }

    @Override
    public String toString() {
        System.out.println("==============================");
        return "marca:" + marca + "\n" +
                "modelo:" + modelo + "\n"  +
                "anio: " + anio + "\n" +
                "precio: " + precio + "\n";
    }
}
