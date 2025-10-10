package models;

import java.sql.Connection;
import java.sql.DriverManager;


public class connectionDB {

    private static final String URL = "jdbc:sqlserver://localhost:1433;database=UniversidadeTexas;user=sa;password=root;encrypt=false";

    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar com o Banco de Dados devido: "+ e.getMessage());
        }
        return conn;
    }
}
