package Hibernate;
// Generated 18-nov-2015 17:57:02 by Hibernate Tools 4.3.1



/**
 *
 * @author Noneking, Inno, MrDrulix
 */
public class Cobro  implements java.io.Serializable {


     private Integer codigoCobro;
     private Documento documento;
     private String formaPago;
     private String fecha;
     private double importe;

    public Cobro() {
    }

    public Cobro(Documento documento, String formaPago, String fecha, double importe) {
       this.documento = documento;
       this.formaPago = formaPago;
       this.fecha = fecha;
       this.importe = importe;
    }
   
    public Integer getCodigoCobro() {
        return this.codigoCobro;
    }
    
    public void setCodigoCobro(Integer codigoCobro) {
        this.codigoCobro = codigoCobro;
    }
    public Documento getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public String getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getImporte() {
        return this.importe;
    }
    
    public void setImporte(double importe) {
        this.importe = importe;
    }




}


