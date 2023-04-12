
package co.edu.udes.Supermercado;


public class Supermercado_Inventario{
    
    private int cantidad_producto;
    private String cantidadCategorias;
    private double balance;

    public Supermercado_Inventario() {
    }

    public Supermercado_Inventario(int cantidad_producto, String cantidadCategorias, double balance) {
        this.cantidad_producto = cantidad_producto;
        this.cantidadCategorias = cantidadCategorias;
        this.balance = balance;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getCantidadCategorias() {
        return cantidadCategorias;
    }

    public void setCantidadCategorias(String cantidadCategorias) {
        this.cantidadCategorias = cantidadCategorias;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Inventario{" + "cantidad_producto=" + cantidad_producto + ", cantidadCategorias=" + cantidadCategorias + ", balance=" + balance + '}';
    }
    
    
}
