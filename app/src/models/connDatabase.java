package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class connDatabase {
    // ESSA CONEXÃO É APENAS PARA APRENDIZADO E UTILIZAÇÃO DA PRÓPRIA APLICAÇÃO LOCAL.
    // CASO TENTE UTILIZAR TERÁ QUE BAIXAR O SQL SERVER E EXECUTAR sql/database.sql
    // E DEPOIS EXECUTAR AS PROCEDURES
    public connDatabase(){
        try {
            String password = "root";
            String user = "sa";
            String URL = "jdbc:sqlserver://localhost:1433/UniversidadeTexas";
            Connection conn = DriverManager.getConnection(URL, user, password);
            System.out.println("Conectado com sucesso!");
            conn.close();
        } catch (SQLException e){
            System.out.println("Erro ao conectar com o Banco de Dados!"+ e.getMessage());
        }
    }
}
