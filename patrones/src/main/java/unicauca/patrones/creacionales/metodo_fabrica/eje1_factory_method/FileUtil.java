/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unicauca.patrones.creacionales.metodo_fabrica.eje1_factory_method;

import java.io.File;
import java.io.FileWriter;

/**
 * ofrece servicios de escritura de archivos.
 * @author edyns
 */
public class FileUtil {
    public void writeToFile(String path, String msg ){
        try{
            File archivo = new File(path);
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            FileWriter escrituraArchivo = new FileWriter(archivo,true);
            escrituraArchivo.write(msg);
            escrituraArchivo.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
