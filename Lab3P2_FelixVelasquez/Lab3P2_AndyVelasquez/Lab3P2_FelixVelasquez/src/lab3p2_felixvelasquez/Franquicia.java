package lab3p2_felixvelasquez;

public class Franquicia {

    String nombre;
    String ubicacion;
    int cantidadm;
    int cantidadp;
    String vendidos;
    int cantidadA;

    public Franquicia() {

    }

    public Franquicia(String nombre, String ubicacion, int cantidadm, int cantidadp, String vendidos, int cantidadA) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidadm = cantidadm;
        this.cantidadp = cantidadp;
        this.vendidos = vendidos;
        this.cantidadA = cantidadA;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadm() {
        return cantidadm;
    }

    public void setCantidadm(int cantidadm) {
        this.cantidadm = cantidadm;
    }

    public int getCantidadp() {
        return cantidadp;
    }

    public void setCantidadp(int cantidadp) {
        this.cantidadp = cantidadp;
    }

    public String getVendidos() {
        return vendidos;
    }

    public void setVendidos(String vendidos) {
        this.vendidos = vendidos;
    }

    public int getCantidadA() {
        return cantidadA;
    }

    public void setCantidadA(int cantidadA) {
        this.cantidadA = cantidadA;
    }

}///
