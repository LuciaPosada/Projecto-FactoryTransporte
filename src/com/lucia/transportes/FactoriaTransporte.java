package com.lucia.transportes;

public class FactoriaTransporte {

    /**
     * Opcion de transporte tipo bicicleta
     */
    public static final int BICICLETA = 1;
    /**
     * Opcion de transporte tipo camion
     */
    public static final int CAMION = 2;

    /**
     * Metodo para devolver un tipo de transporte de la interface
     * @param tipo 1: bicicleta, 2:camion
     * @return transporte segun tipo
     */
    public static ITransporte getTransporte(int tipo) {

        switch(tipo){
            //Bicicleta
            case 1:
                return new Bicicleta();
            //Camion
            case 2:
                return new Camion();
            //Por defecto
            default:
                return null;
        }
    }
}
