package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* Estudiante: Jose Megun Cama La Madrid */

/**
 *
 * @author jose_
 */
public class Conexion {
    
    Connection con;
    
    public Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/general?characterEncoding=UTF-8", "root", "jmegun23");
        } catch (Exception e){
            System.out.println("Error de conexion " + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    /*
    public static void main(String[] args) {
        
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;
        
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from Persons");
            while (rs.next()) {
                System.out.println("id: "+rs.getInt("id")+" nombre: " + rs.getString("nombre"));
            }
            cn.con.close();
        } catch (Exception e) {
            System.out.println("Error conexion main " + e);
        }
    } */

}

