
package co.edu.udes.Supermercado;

import java.util.Date;


public class Supermercado_Venta {
    
     private int id_venta;
     private String fechaVenta;
     private double precioU;
     private double precioT;
     private int cantidadProductos;
     private String categoriaProdcuto;
     private String cliente;
     

    public Supermercado_Venta() {
    }

    public Supermercado_Venta(int id_venta, String fechaVenta, double precioU, double precioT, int cantidadProductos, String categoriaProdcuto, String cliente) {
        this.id_venta = id_venta;
        this.fechaVenta = fechaVenta;
        this.precioU = precioU;
        this.precioT = precioT;
        this.cantidadProductos = cantidadProductos;
        this.categoriaProdcuto = categoriaProdcuto;
        this.cliente = cliente;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public String getCategoriaProdcuto() {
        return categoriaProdcuto;
    }

    public void setCategoriaProdcuto(String categoriaProdcuto) {
        this.categoriaProdcuto = categoriaProdcuto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", fechaVenta=" + fechaVenta + ", precioU=" + precioU + ", precioT=" + precioT + ", cantidadProductos=" + cantidadProductos + ", categoriaProdcuto=" + categoriaProdcuto + ", cliente=" + cliente + '}';
    }

    
   

   
     
     
}
