
package proyectopoo;

import java.io.PrintWriter;

public class ClasePersistencia {
      private String rutaArchivo;

      public ClasePersistencia(
            String rutaArchivo) {

        this.rutaArchivo = rutaArchivo;
    }

    public boolean guardarConfiguracion(
            double kp,
            double ki,
            double kd) {

        try (PrintWriter pw =
                     new PrintWriter(rutaArchivo)) {

            pw.println(kp);
            pw.println(ki);
            pw.println(kd);

            return true;

        } catch (Exception e) {
            return false;
        }
    }
    
}
