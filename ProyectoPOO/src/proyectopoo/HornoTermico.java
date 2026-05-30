
package proyectopoo;

public class HornoTermico {
    private double temperaturaActual;
    private double temperaturaAmbiente;
    private double capacidadTermica;
    private double resistenciaTermica;

    public HornoTermico(double tempAmbiente) {
        temperaturaAmbiente = tempAmbiente;
        temperaturaActual = tempAmbiente;
        capacidadTermica = 100;
        resistenciaTermica = 10;
    }

    public void actualizarFisica(double potenciaAplicada,
                                 double deltaTiempo) {

        double calorEntrada = potenciaAplicada;

        double calorPerdido =
                (temperaturaActual - temperaturaAmbiente)
                        / resistenciaTermica;

        double dT =
                (calorEntrada - calorPerdido)
                        * deltaTiempo
                        / capacidadTermica;

        temperaturaActual += dT;
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public void resetearHorno() {
        temperaturaActual = temperaturaAmbiente;
    }
    
}
