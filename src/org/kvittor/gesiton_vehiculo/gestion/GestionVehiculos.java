package org.kvittor.gesiton_vehiculo.gestion;

import org.kvittor.gesiton_vehiculo.base.Vehiculo;

public class GestionVehiculos {


    private int indiceVehiculo;
    private Vehiculo[] vehiculos = new Vehiculo[10];

    public GestionVehiculos() {

    }


    public void addVehiculo(Vehiculo vehiculo){
        vehiculos[indiceVehiculo++] = vehiculo;
    }

    public void listarVehiculos(){
        for(Vehiculo v: vehiculos){
            System.out.println(v);
        }
    }

    public String buscarVehiculoPorMarca(String marca){

        StringBuilder sb = new StringBuilder();

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
                sb.append(vehiculo);
            }
        }

        return sb.toString();
    }

    public double calcularValorTotal(){
        double total = 0.0d;

        for(Vehiculo v: vehiculos){
            total+=v.getPrecio();
        }

        return total;
    }

}
