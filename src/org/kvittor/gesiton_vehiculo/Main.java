package org.kvittor.gesiton_vehiculo;


import org.kvittor.gesiton_vehiculo.base.Vehiculo;
import org.kvittor.gesiton_vehiculo.derivadas.Auto;
import org.kvittor.gesiton_vehiculo.derivadas.Camion;
import org.kvittor.gesiton_vehiculo.derivadas.Motocicleta;
import org.kvittor.gesiton_vehiculo.gestion.GestionVehiculos;

public class Main {
    public static void main(String[] args) {
        GestionVehiculos gestionVehiculos = new GestionVehiculos();

        gestionVehiculos.addVehiculo((new Auto("Toyota",
                                    "Corolla",2021,
                                    20000,
                                    4)));
        gestionVehiculos.addVehiculo(new Auto("Honda",
                                    "Civic",2019,
                                    18500,
                                    4));
        gestionVehiculos.addVehiculo(new Auto("Ford",
                                    "Mustang",2022,
                                    35000,
                                    2));
        gestionVehiculos.addVehiculo(new Motocicleta("Yamaha",
                                    "MT-07",
                                    2020,
                                    7500,
                                    "Deportiva"));
        gestionVehiculos.addVehiculo(new Motocicleta("Harley-Davidson",
                                    "Iron 883",
                                    2018,
                                    10000,
                                    "Cruiser"));
        gestionVehiculos.addVehiculo(new Camion("Volvo",
                                    "FH16",
                                    2019,
                                    80000,
                                    20));
        gestionVehiculos.addVehiculo(new Camion("Scania",
                                    "R 450",
                                    2021,
                                    85000,
                                    25));

        gestionVehiculos.addVehiculo(new Auto("BMW",
                                    "3 Series",
                                    2020,
                                    30000,
                                    4));

        gestionVehiculos.addVehiculo(new Motocicleta("Ducati",
                                    "Panigale V4",
                                    2021,
                                    22000,
                                    "Deportiva"));

        gestionVehiculos.addVehiculo(new Camion("Mercedes-Benz",
                                    "Actros",
                                    2022,
                                    95000,
                                    22));


        gestionVehiculos.listarVehiculos();
        System.out.println(gestionVehiculos.buscarVehiculoPorMarca("Toyota"));
        System.out.println("Valor total: " + gestionVehiculos.calcularValorTotal());
    }
}