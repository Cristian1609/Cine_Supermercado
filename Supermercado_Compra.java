
package co.edu.udes.Supermercado;

import java.util.Date;


public class Supermercado_Compra{
    
    private int id_compra;  
    private String fecha;
    private int cantidad_producto;
    private double precio_U;
    private double precio_T;

    public Supermercado_Compra() {
    }

    public Supermercado_Compra(int id_compra, String fecha, int cantidad_producto, double precio_U, double precio_T) {
        this.id_compra = id_compra;
        this.fecha = fecha;
        this.cantidad_producto = cantidad_producto;
        this.precio_U = precio_U;
        this.precio_T = precio_T;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public double getPrecio_U() {
        return precio_U;
    }

    public void setPrecio_U(double precio_U) {
        this.precio_U = precio_U;
    }

    public double getPrecio_T() {
        return precio_T;
    }

    public void setPrecio_T(double precio_T) {
        this.precio_T = precio_T;
    }

    @Override
    public String toString() {
        return "Compra{" + "id_compra=" + id_compra + ", fecha=" + fecha + ", cantidad_producto=" + cantidad_producto + ", precio_U=" + precio_U + ", precio_T=" + precio_T + '}';
    }

    

    
    


    
    
    
    
    
}
