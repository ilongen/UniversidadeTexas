package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class connectionDB {
    // ESSA CONEXÃO É APENAS PARA APRENDIZADO E UTILIZAÇÃO DA PRÓPRIA APLICAÇÃO LOCAL.
    // CASO TENTE UTILIZAR TERÁ QUE BAIXAR O SQL SERVER E EXECUTAR sql/database.sql
    // E DEPOIS EXECUTAR AS PROCEDURES
    private String URL = "jdbc:sqlserver://localhost:1433;database=UniversidadeTexas;user=sa;password=root;encrypt=false";
    public connectionDB(){
        try {
            Connection conn = DriverManager.getConnection(URL);
            System.out.println("Conectado com sucesso!");
            closeConnection(conn);
        } catch (SQLException e){
            System.out.println("Erro ao conectar com o Banco de Dados devido: "+ e.getMessage());
        }
    }
    public Boolean setUrl(String URL){
        this.URL = URL;
        return true;
    }
    public String getURL(){
        return this.URL;
    }
    public void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }
}
