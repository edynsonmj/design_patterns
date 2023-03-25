/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unicauca.patrones.creacionales.metodo_fabrica.eje1_factory_method;

/**
 * registra mensajes en archivo
 * @author edyns
 */
public class FileLogger implements Logger{

    /***
     * registra mensajes en archivo.
     * @param msg mensaje a registrar.
     */
    @Override
    public void log(String msg) {
        FileUtil futil = new FileUtil();
        futil.writeToFile("src/main/java/unicauca/patrones/creacionales/metodo_fabrica/eje1_factory_method/log.txt", msg+"\n");
    }
    
}
