public interface IParkingLot {

    int getCantidadEstacionados();
    int getEspaciosDisponibles();
    int getPrecioPorDia();
    int setPrecioPorDia(int precioPorDia);
    void ingresoDetectado();
    void egresoDetectado();
    void facturarEstadia();

}
