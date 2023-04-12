
package co.edu.udes.Supermercado;

import java.util.Date;


public class Supermercado_Producto {
    
    private int id_producto;
    private String categoria_producto;
    private double precio_producto;
    private String descripcion_producto;   
    private String caducudad;

    public Supermercado_Producto() {
    }

    public Supermercado_Producto(int id_producto, String categoria_producto, double precio_producto, String descripcion_producto, String caducudad) {
        this.id_producto = id_producto;
        this.categoria_producto = categoria_producto;
        this.precio_producto = precio_producto;
        this.descripcion_producto = descripcion_producto;
        this.caducudad = caducudad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(String categoria_producto) {
        this.categoria_producto = categoria_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getCaducudad() {
        return caducudad;
    }

    public void setCaducudad(String caducudad) {
        this.caducudad = caducudad;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", categoria_producto=" + categoria_producto + ", precio_producto=" + precio_producto + ", descripcion_producto=" + descripcion_producto + ", caducudad=" + caducudad + '}';
    }

   

    
    
    
}
