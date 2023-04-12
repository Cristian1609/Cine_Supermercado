
package co.edu.udes.Cine;


public class Cine_Sala {
    
    private String nombre;
    private String tipo;
    private int numeroSillas;
    private int numeroEmpleado;
   
    
    public Cine_Sala() {
    }

    public Cine_Sala(String nombre, String tipo, int numeroSillas, int numeroEmpleado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroSillas = numeroSillas;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombre=" + nombre + ", tipo=" + tipo + ", numeroSillas=" + numeroSillas + ", numeroEmpleado=" + numeroEmpleado + '}';
    }

   
    
}