package com.lucia.transportes;

public class Bicicleta implements ITransporte{
    /**
     * Metodo para calcular la eleccion de embalaje para una bicicleta
     * @param x lonjitud eje x del paquete
     * @param y lonjitud eje y del paquete
     * @param z lonjitud eje z del paquete
     * @param peso del paquete
     * @return tipo de embalaje
     */
    @Override
    public Integer costeEmbalaje(Float x, Float y, Float z, Float peso) {

        Float r = (x*y*z);

        if (r<40&&peso<15){

            return CARTON;

        }else{

            return CAJA;

        }
    }

    /**
     * Metodo para calcular el coste del paquete segun codigo postal para bicicleta
     * @param cp codigo postal del paquete
     * @return coste del paquete
     */
    @Override
    public Float costeTotal(Integer cp) {
        if(cp<3000){

            return 20.3f;

        }else{

            return 60.0f;
        }
    }
}
