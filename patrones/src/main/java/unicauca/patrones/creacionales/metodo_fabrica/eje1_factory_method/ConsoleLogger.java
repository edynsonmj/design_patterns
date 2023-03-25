/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unicauca.patrones.creacionales.metodo_fabrica.eje1_factory_method;

/**
 * registra mensajes en consola.
 * @author edyns
 */
public class ConsoleLogger implements Logger{

    /***
     * registra mensajes en consola
     * @param msg mensaje a registrar
     */
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
    
}
