import com.lucia.transportes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FactoriaTransporteTest {

    @Test
    @DisplayName("Comprobacion de Bicicleta")
    public void comprobacionMismaClaseBicicleta(){
        ITransporte bici = FactoriaTransporte.getTransporte(FactoriaTransporte.BICICLETA);
        Assertions.assertTrue(bici instanceof Bicicleta);
    }

    @Test
    @DisplayName("Comprobacion de Camion")
    public void comprobacionMismaClaseCamion(){
        ITransporte camion = FactoriaTransporte.getTransporte(FactoriaTransporte.CAMION);
        Assertions.assertTrue(camion instanceof Camion);
    }
}
