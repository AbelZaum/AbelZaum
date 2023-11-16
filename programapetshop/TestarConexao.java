package programapetshop;

import java.sql.Connection;

public class TestarConexao {

    public static void main(String[] args) {
        try {
            Connection connection = ConnectionFactory.getConnection();

            if (connection != null) {
                System.out.println("Conexão bem-sucedida!");
                ConnectionFactory.closeConnection(connection); // isso fecha a conexão :)
            } else {
                System.out.println("Falha na conexão.");
            }
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao Banco de Dados: " + e.getMessage());
        }
    }
}


