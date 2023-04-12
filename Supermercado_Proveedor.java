
package co.edu.udes.Supermercado;


public class Supermercado_Proveedor {
    
    private int nit_proveedor;
    private String nom_proveedor;
    private String tel_proveedor;
    private String correo_proveedor;
    private String categoria_proveedor;

    public Supermercado_Proveedor() {
    }

    public Supermercado_Proveedor(int nit_proveedor, String nom_proveedor, String tel_proveedor, String correo_proveedor, String categoria_proveedor) {
        this.nit_proveedor = nit_proveedor;
        this.nom_proveedor = nom_proveedor;
        this.tel_proveedor = tel_proveedor;
        this.correo_proveedor = correo_proveedor;
        this.categoria_proveedor = categoria_proveedor;
    }

    public int getNit_proveedor() {
        return nit_proveedor;
    }

    public void setNit_proveedor(int nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public String getNom_proveedor() {
        return nom_proveedor;
    }

    public void setNom_proveedor(String nom_proveedor) {
        this.nom_proveedor = nom_proveedor;
    }

    public String getTel_proveedor() {
        return tel_proveedor;
    }

    public void setTel_proveedor(String tel_proveedor) {
        this.tel_proveedor = tel_proveedor;
    }

    public String getCorreo_proveedor() {
        return correo_proveedor;
    }

    public void setCorreo_proveedor(String correo_proveedor) {
        this.correo_proveedor = correo_proveedor;
    }

    public String getCategoria_proveedor() {
        return categoria_proveedor;
    }

    public void setCategoria_proveedor(String categoria_proveedor) {
        this.categoria_proveedor = categoria_proveedor;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nit_proveedor=" + nit_proveedor + ", nom_proveedor=" + nom_proveedor + ", tel_proveedor=" + tel_proveedor + ", correo_proveedor=" + correo_proveedor + ", categoria_proveedor=" + categoria_proveedor + '}';
    }
    
    
    
}
