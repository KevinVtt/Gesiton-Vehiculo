package org.kvittor.gesiton_vehiculo.derivadas;

import org.kvittor.gesiton_vehiculo.base.Vehiculo;

public class Motocicleta extends Vehiculo {
    private String tipo;

    public Motocicleta(String marca, String modelo, int anio, double precio, String tipo) {
        super(marca, modelo, anio, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo: '" + tipo;
    }
}
