/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author MrDrulix
 */
public class LectorTema {
    
      public static String getPropiedad(String name) {
        FileInputStream fis = null;
        try {
            // leo el archivo de propiedades donde se recogen los datos
            fis = new FileInputStream("src/Modelo/datosempresaTemas.properties");
            Properties props = new Properties();
            // cargamos el archivo
            props.load(fis);            
            return props.getProperty(name);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            try {
                if (fis != null) {
                    //cerramos el flujo al archivo al finalizar
                    fis.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
    
    public static void setPropiedad(String Nombre) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // leo el archivo de propiedades donde se recogen los datos
            fis = new FileInputStream("src/Modelo/datosempresaTemas.properties");
            fos = new FileOutputStream("src/Modelo/datosempresaTemas.properties");
            Properties props = new Properties();
            props.load(fis);   
            // modifico los datos del archivo .properties
            props.setProperty("NOMBRE", Nombre);
           
            // guardamos los cambios
            props.store(fos, "");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            try {
                // una vez terminemos cerramos los flujos
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
}
