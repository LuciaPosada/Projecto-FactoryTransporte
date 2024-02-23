package com.lucia.app;

import com.lucia.transportes.FactoriaTransporte;
import com.lucia.transportes.ITransporte;

import com.lucia.librerias.*;

public class Main {

    static ITransporte transporte;

    public static void main(String[] args) {

        // Demostracion para bicicleta
        transporte = FactoriaTransporte.getTransporte(FactoriaTransporte.BICICLETA);
            //Tipo de embalaje
        int embalaje = transporte.costeEmbalaje(
                Entrada.entrada_ventana_consola_float("Introduzca la longitud del eje x: ",Entrada.CONSOLA),
                Entrada.entrada_ventana_consola_float("Introduzca la longitud del eje y: ",Entrada.CONSOLA),
                Entrada.entrada_ventana_consola_float("Introduzca la longitud del eje z: ",Entrada.CONSOLA),
                Entrada.entrada_ventana_consola_float("Introduzca el peso del paquete: ",Entrada.CONSOLA));
        switch(embalaje){
            case 2:
                Salida.salida_ventana_consola("Tipo de embalaje: Envoltorio de carton",Salida.CONSOLA);
                break;
            case 3:
                Salida.salida_ventana_consola("Tipo de embalaje: Caja de madera",Salida.CONSOLA);
                break;
        }
            //Coste
        Salida.salida_ventana_consola("Coste: "+transporte.costeTotal(Entrada.entrada_ventana_consola_entero("Introduzca el codigo postal del destino: ",Entrada.CONSOLA)),Salida.CONSOLA);


        // Demostracion para camion
        transporte = FactoriaTransporte.getTransporte(FactoriaTransporte.CAMION);
            //Tipo de embalaje
        int embalaje2 = transporte.costeEmbalaje(
                Entrada.entrada_ventana_consola_float("Introduzca la longitud del eje x: ",Entrada.CONSOLA),
                Entrada.entrada_ventana_consola_float("Introduzca la longitud del eje y: ",Entrada.CONSOLA),
                Entrada.entrada_ventana_consola_float("Introduzca la longitud del eje z: ",Entrada.CONSOLA),
                Entrada.entrada_ventana_consola_float("Introduzca el peso del paquete: ",Entrada.CONSOLA));
        switch(embalaje2){
            case 0:
                Salida.salida_ventana_consola("Tipo de embalaje: Pale",Salida.CONSOLA);
                break;
            case 2:
                Salida.salida_ventana_consola("Tipo de embalaje: Envoltorio de carton",Salida.CONSOLA);
                break;
            case 3:
                Salida.salida_ventana_consola("Tipo de embalaje: Caja de madera",Salida.CONSOLA);
                break;
        }
        //Coste
        Salida.salida_ventana_consola("Coste: "+transporte.costeTotal(Entrada.entrada_ventana_consola_entero("Introduzca el codigo postal del destino: ",Entrada.CONSOLA)),Salida.CONSOLA);
    }
}