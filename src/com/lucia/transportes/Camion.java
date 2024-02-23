package com.lucia.transportes;

public class Camion implements ITransporte{
    /**
     * Metodo para calcular la eleccion de embalaje para un camion
     * @param x lonjitud eje x del paquete
     * @param y lonjitud eje y del paquete
     * @param z lonjitud eje z del paquete
     * @param peso del paquete
     * @return tipo de embalaje
     */
    @Override
    public Integer costeEmbalaje(Float x, Float y, Float z, Float peso) {

        Float r = (x*y*z);

        if (r<160&&peso<30){

            return CARTON;

        }else if (r<160&&peso>30){

            return CAJA;

        }else{

            return PALET;

        }
    }

    /**
     * Metodo para calcular el coste del paquete segun codigo postal para camion
     * @param cp codigo postal del paquete
     * @return coste del paquete
     */
    @Override
    public Float costeTotal(Integer cp) {

        if(cp<1000){

            return 30.5f;

        }if(cp<3000){

            return 25f;

        }if(cp<5000){

            return 25.72f;

        }else{

            return 60.0f;
        }
    }
}
