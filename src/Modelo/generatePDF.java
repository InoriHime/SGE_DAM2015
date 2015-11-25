/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Hibernate.Articulo;
import Hibernate.ArticuloPedido;
import Hibernate.Cliente;
import Hibernate.Proveedor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noneking, Inno, MrDrulix
 */
        
public class generatePDF {
    
    public void generatePDFFactura(String url, Object cliente_proveedor, ArrayList<ArticuloPedido> articulos, double suma)
    {
        try 
        {
            Document documento = new Document();
            FileOutputStream ficheroPdf = new FileOutputStream(url+"factura.pdf");
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
            
            documento.open();
            
            if(cliente_proveedor instanceof Cliente)
            {
                Cliente c=(Cliente) cliente_proveedor;
                
                documento.add(new Paragraph("FACTURA",FontFactory.getFont("arial",30,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(""));
                documento.add(new Paragraph("---DATOS--- "));
                documento.add(new Paragraph("DNI: "+c.getDni(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("NOMBRE: "+c.getNombre(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("APELLIDOS: "+c.getApellidos(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(""));
                documento.add(new Paragraph(""));
                
             
                
                PdfPTable tabla = new PdfPTable(3);
                Iterator it=articulos.iterator();
                while(it.hasNext())
                {
                    Articulo art=(Articulo) it.next();
                    tabla.addCell(art.getNombre());
                    //tabla.addCell(Double.toString(art.getPrecio()));
                    //tabla.addCell(Integer.toString(art.getCantidad()));
                   // suma=suma+art.getPrecio()*art.getCantidad();
                   
                }
                documento.add(tabla);
                
                documento.add(new Paragraph(""));
                documento.add(new Paragraph("TOTAL: "+suma,FontFactory.getFont("arial",25,Font.NORMAL,BaseColor.RED)));
                documento.close();
            }
            else if(cliente_proveedor instanceof Proveedor)
            {
                Proveedor p=(Proveedor) cliente_proveedor;
                
                documento.add(new Paragraph("FACTURA",FontFactory.getFont("arial",30,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(""));
                documento.add(new Paragraph("---DATOS--- "));
                documento.add(new Paragraph("CIF: "+p.getCif(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("DENOMINACION: "+p.getDenominacionSocial(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(""));
                documento.add(new Paragraph(""));
                
           
                
                PdfPTable tabla = new PdfPTable(3);
                Iterator it=articulos.iterator();
                while(it.hasNext())
                {
                    Articulo art=(Articulo) it.next();
                    tabla.addCell(art.getNombre());
                    tabla.addCell(Double.toString(art.getPrecio()));
                    tabla.addCell(Integer.toString(art.getCantidad()));
                    suma=suma+art.getPrecio()*art.getCantidad();
                }
                documento.add(tabla);
                
                documento.add(new Paragraph(""));
                documento.add(new Paragraph("TOTAL: "+suma,FontFactory.getFont("arial",25,Font.NORMAL,BaseColor.RED)));
                documento.close();
                
                System.out.println(""+url);
            }
        }
        catch (DocumentException ex) 
        {
            Logger.getLogger(generatePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(generatePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
