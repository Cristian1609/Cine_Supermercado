
package co.edu.udes.Cine;


public class Cine_Cafeteria {
    
   private String nombre;
   private String ubicacion;
   private String horario;
   private int  numeroCafeteria;
   private int numeroEmpleados;
   private int numeroMesas;

    public Cine_Cafeteria() {
    }

    public Cine_Cafeteria(String nombre, String ubicacion, String horario, int numeroCafeteria, int numeroEmpleados, int numeroMesas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.numeroCafeteria = numeroCafeteria;
        this.numeroEmpleados = numeroEmpleados;
        this.numeroMesas = numeroMesas;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumeroCafeteria() {
        return numeroCafeteria;
    }

    public void setNumeroCafeteria(int numeroCafeteria) {
        this.numeroCafeteria = numeroCafeteria;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public int getNumeroMesas() {
        return numeroMesas;
    }

    public void setNumeroMesas(int numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    @Override
    public String toString() {
        return "Cafeteria{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", horario=" + horario + ", numeroCafeteria=" + numeroCafeteria + ", numeroEmpleados=" + numeroEmpleados + ", numeroMesas=" + numeroMesas + '}';
    }
   
   

   
   
    
}
