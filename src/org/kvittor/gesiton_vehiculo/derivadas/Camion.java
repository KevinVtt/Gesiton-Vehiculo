package org.kvittor.gesiton_vehiculo.derivadas;

import org.kvittor.gesiton_vehiculo.base.Vehiculo;

public class Camion extends Vehiculo {
    private double capacidadDeCarga;

    public Camion(String marca, String modelo, int anio, double precio, double capacidadDeCarga) {
        super(marca, modelo, anio, precio);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "capacidad de carga: " + capacidadDeCarga;
    }
}
