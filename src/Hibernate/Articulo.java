package Hibernate;
// Generated 18-nov-2015 17:57:02 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Articulo  implements java.io.Serializable {


     private Integer codigo;
     private String nombre;
     private double precio;
     private int cantidad;
     private Set articuloPedidos = new HashSet(0);

    public Articulo() {
    }

	
    public Articulo(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Articulo(String nombre, double precio, int cantidad, Set articuloPedidos) {
       this.nombre = nombre;
       this.precio = precio;
       this.cantidad = cantidad;
       this.articuloPedidos = articuloPedidos;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Set getArticuloPedidos() {
        return this.articuloPedidos;
    }
    
    public void setArticuloPedidos(Set articuloPedidos) {
        this.articuloPedidos = articuloPedidos;
    }




}


