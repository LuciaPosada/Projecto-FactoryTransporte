## Projecto Factory

- Esctructura del programa

  + Package com.lucia.transporte
    + Interfaz ITransporte
      + Metodo: costeEmbalaje
      + Metodo: costeTotal
      + Constante: CARTON || CAJA || PALET
    + Clase Bicicleta 
        
          Implementa Itransporte
    
    + Clase Camion

          Implementa Itransporte
    
    + Clase FactoriaTransporte

        + Metodo: getTransporte
        + Constante: BICICLETA || CAMION
      
  + Package com.lucia.app 
     + Clase Main

           Demostracion de funcionamiemto del programa