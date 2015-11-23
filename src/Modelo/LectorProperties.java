
package Modelo;

import java.io.FileInputStream;
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
}
