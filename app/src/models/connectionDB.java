package models;

import java.sql.*;


public class connectionDB {

    private String URL = "jdbc:sqlserver://localhost:1433;database=UniversidadeTexas;user=sa;password=root;encrypt=false";
    private Connection conn = null;

    public connectionDB(){
        try {
            this.conn = DriverManager.getConnection(URL);
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar com o Banco de Dados devido: "+ e.getMessage());
        }
    }

    public Boolean setUrl(String URL){
        try{this.URL = URL; return true;}
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getURL(){
        return this.URL;
    }

    public boolean closeConnection(){
        try{conn.close(); return true;} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
