/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Hibernate.ArticuloPedido;
import Hibernate.Cliente;
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
            FileOutputStream ficheroPdf = new FileOutputStream(url+"_factura.pdf");
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
            
            documento.open();
            
           
                Cliente c=(Cliente) cliente_proveedor;
                
                documento.add(new Paragraph("FACTURA",FontFactory.getFont("arial",30,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("---DATOS--- "));
                documento.add(new Paragraph("DNI: "+c.getDni(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("NOMBRE: "+c.getNombre(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("APELLIDOS: "+c.getApellidos(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph(" "));
                
             
                int cont=0;
                PdfPTable tabla = new PdfPTable(3);
                Iterator it = articulos.iterator();
                while (it.hasNext()) {
                    if (cont == 0) {
                        tabla.addCell("NOMBRE");
                        tabla.addCell("PRECIO");
                        tabla.addCell("CANTIDAD");
                    }
                    ArticuloPedido artPed = (ArticuloPedido) it.next();
                    tabla.addCell(artPed.getArticulo().getNombre());
                    tabla.addCell(Double.toString(artPed.getArticulo().getPrecio()));
                    tabla.addCell(Integer.toString(artPed.getCantidad()));
                    suma = suma + artPed.getArticulo().getPrecio() * artPed.getArticulo().getCantidad();
                    cont++;
                }

                documento.add(tabla);

                documento.add(new Paragraph(""));
                documento.add(new Paragraph("TOTAL: "+suma+" €",FontFactory.getFont("arial",25,Font.NORMAL,BaseColor.RED)));
                documento.close();
            
            
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
