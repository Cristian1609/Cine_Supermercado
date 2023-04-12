
package co.edu.udes.Supermercado;


public class Supermercado_Cliente {
    
    private int idCliente;
    private String nomCliente;
    private String  telefonoCliente;
    private String correoCliente;

    public Supermercado_Cliente() {
    }

    public Supermercado_Cliente(int idCliente, String nomCliente, String telefonoCliente, String correoCliente) {
        this.idCliente = idCliente;
        this.nomCliente = nomCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nomCliente=" + nomCliente + ", telefonoCliente=" + telefonoCliente + ", correoCliente=" + correoCliente + '}';
    }
    
    
    
}
