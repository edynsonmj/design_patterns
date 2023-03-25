/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unicauca.patrones.creacionales.metodo_fabrica.eje1_factory_method;

import java.util.Scanner;

/**
 *
 * @author edyns
 */
public class LoggerTest {
    public static void main(String[] args){
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe al sistema");
        logger.log(sc.nextLine());
    }
}
