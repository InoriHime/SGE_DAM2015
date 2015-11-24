package Hibernate;
// Generated 18-nov-2015 17:57:02 by Hibernate Tools 4.3.1



/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class ArticuloPedido  implements java.io.Serializable {


     private ArticuloPedidoId id;
     private Articulo articulo;
     private Documento documento;
     private int cantidad;

    public ArticuloPedido() {
    }

    public ArticuloPedido(ArticuloPedidoId id, Articulo articulo, Documento documento, int cantidad) {
       this.id = id;
       this.articulo = articulo;
       this.documento = documento;
       this.cantidad = cantidad;
    }
   
    public ArticuloPedidoId getId() {
        return this.id;
    }
    
    public void setId(ArticuloPedidoId id) {
        this.id = id;
    }
    public Articulo getArticulo() {
        return this.articulo;
    }
    
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public Documento getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}


