package Hibernate;
// Generated 18-nov-2015 17:57:02 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Cliente  implements java.io.Serializable {


     private String dni;
     private String nombre;
     private String apellidos;
     private String domicilio;
     private String correo;
     private String telefono;
     private Set documentos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String dni, String nombre, String apellidos, String domicilio, String correo, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
    }
    public Cliente(String dni, String nombre, String apellidos, String domicilio, String correo, String telefono, Set documentos) {
       this.dni = dni;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.domicilio = domicilio;
       this.correo = correo;
       this.telefono = telefono;
       this.documentos = documentos;
    }
   
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getDocumentos() {
        return this.documentos;
    }
    
    public void setDocumentos(Set documentos) {
        this.documentos = documentos;
    }




}


