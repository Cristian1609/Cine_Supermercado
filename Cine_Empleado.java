
package co.edu.udes.Cine;

import java.util.Date;


public class Cine_Empleado {
    
    private int idEmpleado;
    private String nomEmpleado;
    private String direccionEmpleado;
    private String correoEmpleado;
    private String fechaNacimineto;
    private String arl;
    private String tipoLabor;

    public Cine_Empleado() {
    }

    public Cine_Empleado(int idEmpleado, String nomEmpleado, String direccionEmpleado, String correoEmpleado, String fechaNacimineto, String arl, String tipoLabor) {
        this.idEmpleado = idEmpleado;
        this.nomEmpleado = nomEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.fechaNacimineto = fechaNacimineto;
        this.arl = arl;
        this.tipoLabor = tipoLabor;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public String getTipoLabor() {
        return tipoLabor;
    }

    public void setTipoLabor(String tipoLabor) {
        this.tipoLabor = tipoLabor;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nomEmpleado=" + nomEmpleado + ", direccionEmpleado=" + direccionEmpleado + ", correoEmpleado=" + correoEmpleado + ", fechaNacimineto=" + fechaNacimineto + ", arl=" + arl + ", tipoLabor=" + tipoLabor + '}';
    }

    

 
    
}
