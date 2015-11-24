package Hibernate;
// Generated 18-nov-2015 17:57:02 by Hibernate Tools 4.3.1



/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class ArticuloPedidoId  implements java.io.Serializable {


     private int codigoDocumento;
     private int codigoArticulo;

    public ArticuloPedidoId() {
    }

    public ArticuloPedidoId(int codigoDocumento, int codigoArticulo) {
       this.codigoDocumento = codigoDocumento;
       this.codigoArticulo = codigoArticulo;
    }
   
    public int getCodigoDocumento() {
        return this.codigoDocumento;
    }
    
    public void setCodigoDocumento(int codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }
    public int getCodigoArticulo() {
        return this.codigoArticulo;
    }
    
    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArticuloPedidoId) ) return false;
		 ArticuloPedidoId castOther = ( ArticuloPedidoId ) other; 
         
		 return (this.getCodigoDocumento()==castOther.getCodigoDocumento())
 && (this.getCodigoArticulo()==castOther.getCodigoArticulo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodigoDocumento();
         result = 37 * result + this.getCodigoArticulo();
         return result;
   }   


}


