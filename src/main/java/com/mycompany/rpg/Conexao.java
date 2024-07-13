
package com.mycompany.rpg;
import java.sql.Connection; // serve para fazer a conexão
import java.sql.DriverManager; // biblioteca 
import java.sql.SQLException; // serve para informar erros

/**
 *
 * @author Natã
 */
public class Conexao {
   private static final String url = "jdbc:mysql://localhost:3306/rpg";
   private static final String user = "root";
   private static final String password = "senacrs";
   
   private static Connection conn;
   
   public static Connection getConexao() throws SQLException{
       try{
           if(conn == null){
           conn = DriverManager.getConnection(url,user,password);
           return conn;
           }else{
           return conn;        
           }
       }catch(SQLException e){
           e.printStackTrace();
           return null;
       }
   }
}
