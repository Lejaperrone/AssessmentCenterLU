import java.util.Calendar;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Estacionamiento implements IParkingLot {

    private int cantidadEstacionados;
    private int espaciosDisponibles;
    private int precioPorDia;

    public Estacionamiento(int cantidadEstacionados, int espaciosDisponibles, int precioPorDia) {
        this.cantidadEstacionados = cantidadEstacionados;
        this.espaciosDisponibles = espaciosDisponibles;
        this.precioPorDia = precioPorDia;
        this.facturarEstadia();
    }

    @Override
    public int getCantidadEstacionados() {
        return cantidadEstacionados;
    }

    @Override
    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    @Override
    public int getPrecioPorDia() {
        return precioPorDia;
    }

    @Override
    public int setPrecioPorDia(int precioPorDia) {
        return this.precioPorDia = precioPorDia;
    }

    @Override
    public void ingresoDetectado() {
        if(espaciosDisponibles > 0){
            this.cantidadEstacionados ++;
            this.espaciosDisponibles --;
        } else {
            System.out.println("No quedan espacios disponibles");
        }
    }

    @Override
    public void egresoDetectado() {
        if(cantidadEstacionados > 0){
            this.cantidadEstacionados --;
            this.espaciosDisponibles ++;
        } else {
            System.out.println("No hay autos para retirar del estacionamiento");
        }
    }

    @Override
    public void facturarEstadia() {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 24);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);

        Timer timer = new Timer();
        timer.schedule(new FacturarEstadia(this), today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
    }
}
