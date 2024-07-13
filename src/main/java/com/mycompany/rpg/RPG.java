  
package com.mycompany.rpg;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.DriverManager; // biblioteca 
/**
 *
 * @author Natã
 */
public class RPG {

    public static void main(String[] args) throws SQLException {
        
    Scanner STRING = new Scanner(System.in);
    String a;
    FalsePerson fp = new FalsePerson();
    VedaPerson vp = new VedaPerson();
    Inventario inv = new Inventario();
    vp.setInventario(inv);
    
    //início do código "MENU"
    System.out.println("___________________________________");
    System.out.println("|                                 |");    
    System.out.println("|    Bem-vindo ao VedaPerson!     |");
    System.out.println("|_________________________________|");
    System.out.println("");
    System.out.println("        *[aperte enter]*           ");
    //a = ;
    STRING.nextLine();
    
    //ordem dos acontecimentos
    fp.fallperson();
    vp.xPerson();
    vp.bornPerson();
    }
}
    
    
    
    
    
    
    
    
    
    

    
    
    
    
        



