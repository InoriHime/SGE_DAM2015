
package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class LectorProperties {
    public static String getPropiedad(String name) {
        FileInputStream fis = null;
        try {
            // leo el archivo de propiedades donde se recogen los datos
            fis = new FileInputStream("src/Modelo/datosempresa.properties");
            Properties props = new Properties();
            props.load(fis);            
            return props.getProperty(name);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
    
    public static void setPropiedad(String Nombre, String Correo,String Direccion,String IVA) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // leo el archivo de propiedades donde se recogen los datos
            fis = new FileInputStream("src/Modelo/datosempresa.properties");
            fos = new FileOutputStream("src/Modelo/datosempresa.properties");
            Properties props = new Properties();
            props.load(fis);            
            props.setProperty("NOMBRE", Nombre);
            props.setProperty("CORREO", Correo);
            props.setProperty("DIRECCION", Direccion);
            props.setProperty("IVA", IVA);
            props.store(fos, "");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            try {
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
