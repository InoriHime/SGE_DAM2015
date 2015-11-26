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
    
    //Método que genera el PDF correspondiente a la factura del Cliente
    public void generatePDFFactura(String url, Object cliente_proveedor, ArrayList<ArticuloPedido> articulos, double suma)
    {
        try 
        {
            Document documento = new Document();//Creamos el documento
            FileOutputStream ficheroPdf = new FileOutputStream(url+"_factura.pdf");//Abrimos el flujo y le asignamos nombre al pdf y su direccion
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);//Instanciamos el documento con el fichero
            
            documento.open();//Abrimos el documento
            
           
                Cliente c=(Cliente) cliente_proveedor;
                
                documento.add(new Paragraph("FACTURA",FontFactory.getFont("arial",30,Font.BOLD,BaseColor.BLACK)));//Le indicamos el tipo de letra, el tamanio, el estilo y el color de la letra
                documento.add(new Paragraph(" "));//Realiza un salto de linea
                documento.add(new Paragraph("---DATOS--- "));//Crea un parrafo con el String que le introduzcamos
                //Le decimos que nos imprima el Dni, Nombre y Apellidos del cliente, contenidos en el objeto Cliente y le indicamos el tipo de letra, tamanio, estilo y color de la letra
                documento.add(new Paragraph("DNI: "+c.getDni(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("NOMBRE: "+c.getNombre(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("APELLIDOS: "+c.getApellidos(),FontFactory.getFont("arial",25,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph(" "));
                
             
                int cont=0;//Este contador se usara para que cuando sea la primera vez que inserta datos en la tabla inserte los nombres de las columnas en vez de datos
                PdfPTable tabla = new PdfPTable(3);//Creamos una tabla de tres columnas
                
                //Insertaremos todos los articulos del pedido
                Iterator it = articulos.iterator();
                while (it.hasNext()) {
                    if (cont == 0) {
                        tabla.addCell("NOMBRE");
                        tabla.addCell("PRECIO");
                        tabla.addCell("CANTIDAD");
                    }
                    //Imprimimos en el PDF los nombres de los articulos del pedido, su precio y la cantidad comprada
                    ArticuloPedido artPed = (ArticuloPedido) it.next();
                    tabla.addCell(artPed.getArticulo().getNombre());
                    tabla.addCell(Double.toString(artPed.getArticulo().getPrecio()));
                    tabla.addCell(Integer.toString(artPed.getCantidad()));
                    suma = suma + artPed.getArticulo().getPrecio() * artPed.getArticulo().getCantidad();//Imprimimos el coste de cada articulo en relacion a su cantidad
                    cont++;
                }

                documento.add(tabla);//Añadimos la tabla al documento

                documento.add(new Paragraph(""));
                documento.add(new Paragraph("TOTAL: "+suma+" €",FontFactory.getFont("arial",25,Font.NORMAL,BaseColor.RED)));//Imprimimos el coste total del pedido
                documento.close();//Cerramos el flujo con el documento
            
            
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
