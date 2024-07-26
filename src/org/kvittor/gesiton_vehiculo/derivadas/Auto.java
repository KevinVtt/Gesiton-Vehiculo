package org.kvittor.gesiton_vehiculo.derivadas;

import org.kvittor.gesiton_vehiculo.base.Vehiculo;

public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int anio, double precio, int cantidadDePuertas) {
        super(marca, modelo, anio, precio);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String toString() {
        return  super.toString() + "Cantidad de puertas: " + cantidadDePuertas;
    }
}
