/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unicauca.patrones.creacionales.metodo_fabrica.eje1_factory_method;

import java.util.Properties;

/**
 *
 * @author edyns
 */
public class LoggerFactory {
    public Logger getLogger(){
        if(isFileLoggingEnabled()){
            return new FileLogger();
        }else{
            return new ConsoleLogger();
        }
    }
    private boolean isFileLoggingEnabled(){
        Properties p = new Properties();
        try{
            p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
            String fileLoggingValue = p.getProperty("FileLogging");
            if(fileLoggingValue.equalsIgnoreCase("ON")==true){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
}
