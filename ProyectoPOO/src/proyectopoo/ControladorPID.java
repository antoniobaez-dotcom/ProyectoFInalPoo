
package proyectopoo;


public class ControladorPID implements Interface{
      private double kp;
    private double ki;
    private double kd;

    private double errorAcumulado;
    private double errorAnterior;

    public ControladorPID(double kp,double ki,double kd)
            throws ExcepcionKpInvalido{

            if (kp < 0)
                throw new ExcepcionKpInvalido(
                    "Kp no puede ser negativo");

        this.kp = kp;
        this.ki = ki;
        this.kd = kd;
    }

    @Override
    public double calcularAccion(
            double setpoint,
            double tempActual) {

        double error = setpoint - tempActual;

        errorAcumulado += error;

        double derivada =
                error - errorAnterior;

        errorAnterior = error;

        return kp * error
                + ki * errorAcumulado
                + kd * derivada;
    }

    public void setKp(double kp)
            throws ExcepcionKpInvalido{

        if (kp < 0)
            throw new ExcepcionKpInvalido(
                    "Kp no puede ser negativo");

        this.kp = kp;
    }

    
    
}
