package Hibernate;
// Generated 18-nov-2015 17:57:02 by Hibernate Tools 4.3.1



/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Proveedor  implements java.io.Serializable {


     private String cif;
     private String denominacionSocial;
     private String telefono;
     private String correo;

    public Proveedor() {
    }

    public Proveedor(String cif, String denominacionSocial, String telefono, String correo) {
       this.cif = cif;
       this.denominacionSocial = denominacionSocial;
       this.telefono = telefono;
       this.correo = correo;
    }
   
    public String getCif() {
        return this.cif;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getDenominacionSocial() {
        return this.denominacionSocial;
    }
    
    public void setDenominacionSocial(String denominacionSocial) {
        this.denominacionSocial = denominacionSocial;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }




}


