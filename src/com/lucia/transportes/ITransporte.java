package com.lucia.transportes;

public interface ITransporte {
    /**
     * Opcion de envalaje en palet
     */
    public static final int PALET = 0;
    /**
     * Opcion de envalaje en caja de carton
     */
    public static final int CARTON = 1;
    /**
     * Opcion de envalaje en caja de madera
     */
    public static final int CAJA = 2;

    /**
     * Metodo para calcular la eleccion de embalaje
     * @param x lonjitud eje x del paquete
     * @param y lonjitud eje y del paquete
     * @param z lonjitud eje z del paquete
     * @param peso del paquete
     * @return tipo de embalaje
     */
    Integer costeEmbalaje(Float x, Float y, Float z, Float peso);

    /**
     * Metodo para calcular el coste del paquete segun codigo postal
     * @param cp codigo postal del paquete
     * @return coste del paquete
     */
    Float costeTotal(Integer cp);


}
