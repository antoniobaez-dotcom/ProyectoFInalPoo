
package proyectopoo;

public class ControladorOnOff implements Interface{
    private double histeresis;
    private double potenciaMaxima;

    public ControladorOnOff(
            double histeresis) {

        this.histeresis = histeresis;
        potenciaMaxima = 100;
    }

    @Override
    public double calcularAccion(
            double setpoint,
            double tempActual) {

        if (tempActual <
                setpoint - histeresis)
            return potenciaMaxima;

        if (tempActual >
                setpoint + histeresis)
            return 0;

        return potenciaMaxima / 2;
    }
    
    
}
