import java.util.TimerTask;

public class FacturarEstadia extends TimerTask {

    private Estacionamiento estacionamiento;

    public FacturarEstadia(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    @Override
    public void run() {
        ServicioExterno servicioExterno = new ServicioExterno();

        int estadia = estacionamiento.getPrecioPorDia() * estacionamiento.getCantidadEstacionados();

        servicioExterno.enviarMail("Estadía","Monto facturado en el dia de la fecha: $" + estadia, "mailEncargado@example.com");
    }
}
