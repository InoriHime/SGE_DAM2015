package Hibernate;
// Generated 18-nov-2015 17:57:02 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Documento  implements java.io.Serializable {


     private Integer codigo;
     private Cliente cliente;
     private String tipo;
     private String fechaPedido;
     private double base;
     private double iva;
     private double total;
     private Set articuloPedidos = new HashSet(0);
     private Set cobros = new HashSet(0);

    public Documento() {
    }

	
    public Documento(Cliente cliente, String tipo, String fechaPedido, double base, double iva, double total) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.fechaPedido = fechaPedido;
        this.base = base;
        this.iva = iva;
        this.total = total;
    }
    public Documento(Cliente cliente, String tipo, String fechaPedido, double base, double iva, double total, Set articuloPedidos, Set cobros) {
       this.cliente = cliente;
       this.tipo = tipo;
       this.fechaPedido = fechaPedido;
       this.base = base;
       this.iva = iva;
       this.total = total;
       this.articuloPedidos = articuloPedidos;
       this.cobros = cobros;
    }

    public Documento(Proveedor proveedor, String tipo, String fechaPedido, double base, double iva, double total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getFechaPedido() {
        return this.fechaPedido;
    }
    
    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    public double getIva() {
        return this.iva;
    }
    
    public void setIva(double iva) {
        this.iva = iva;
    }
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    public Set getArticuloPedidos() {
        return this.articuloPedidos;
    }
    
    public void setArticuloPedidos(Set articuloPedidos) {
        this.articuloPedidos = articuloPedidos;
    }
    public Set getCobros() {
        return this.cobros;
    }
    
    public void setCobros(Set cobros) {
        this.cobros = cobros;
    }




}


