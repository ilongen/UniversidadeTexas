package dbClasses;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class connDatabase {
    private String URL = "jdbc:mysql://localhost:1433/UniversidadeTexas";
    private String user = "";
    private String password = "";

    public connDatabase(){
        try {
            Connection conn = DriverManager.getConnection(URL,user,password);
            System.out.println("Conectado com sucesso!");
            conn.close();
        } catch (SQLException e){
            System.out.println("Erro ao conectar com o Banco de Dados!"+ e.getMessage());
        }
    }
}
