package br.ufscar.dc.pooa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// Classe DAO responsavel por realizar o acesso aos dados de client no banco de
// dados mysql, possibilitando o CRUD.
public class ModelClientDAO implements IModel<Client> {
    
    public ModelClientDAO(){
        // Tenta acessar o conector jdbc para o banco em mysql
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
        }
    }

    // Metodo privado para retornar a conexao com o banco.
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/CLIENT", "root", "root");
    }
        
    // Insercao de objeto no modelo.
    @Override
    public void create(Client client){
        // String da query a ser realizada no banco.
        String query = "INSERT INTO CLIENT (CPF ,NOME , EMAIL) VALUES(?, ?, ?)";

        try {
                Connection conn = this.getConnection(); // Conecta
                PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

                statement = conn.prepareStatement(query);
                statement.setString(1, client.getCpf());
                statement.setString(2, client.getNome());
                statement.setString(3, client.getEmail());
                statement.executeUpdate(); // Realiza a query

                statement.close();
                conn.close(); // Fecha conexao
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }
        
    // Leitora de um objeto armazenado no modelo.
    // Necessario passar um objeto cliente criado com o ID SETADO.
    @Override
    public Client read(Client clientID){
        // String da query a ser realizada no banco.
        String sql = "SELECT ID, CPF, NOME, EMAIL FROM CLIENT WHERE ID = ?";
        String cpf = null, nome = null, email = null;

        try {
                Connection conn = this.getConnection(); // Conext
                PreparedStatement statement = conn.prepareStatement(sql);

                statement.setLong(1, clientID.getId()); // Seta ID de busca.
                ResultSet resultSet = statement.executeQuery(); // Executa query.

                if (resultSet.next()) {
                        cpf = resultSet.getString("cpf");
                        nome = resultSet.getString("nome");
                        email = resultSet.getString("email");
                }

                resultSet.close();
                statement.close();
                conn.close(); // Fecha conexao
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }

        return new Client(clientID.getId(), cpf, nome, email);
    }
    
    // Atualização de objeto no modelo.
    // Atualização sera feita, acessando o client de id client.id, e depois atualizando
    // com as informacoes novas contidas no objeto de entrada.
    @Override
    public void update(Client client){
        // String da query a ser realizada no banco.
        String sql = "UPDATE CLIENT SET CPF = ? ,NOME = ?, EMAIL = ? WHERE ID = ?";

        try {
                Connection conn = this.getConnection(); // Conecta.
                PreparedStatement statement = conn.prepareStatement(sql);

                statement.setString(1, client.getCpf());
                statement.setString(2, client.getNome());
                statement.setString(3, client.getEmail());
                statement.setLong(4, client.getId());
                statement.executeUpdate(); // Efetua a query.

                statement.close();
                conn.close(); // Fecha conexao.
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }
    // Exclusão de objeto no modelo.
    // Exclusão é feita acessando o valor do campo id do objeto de entrada. 
    // E entao definindo uma query DELETE do campo com o id passado.
    @Override
    public void delete(Client client){
        // String da query a ser realizada no banco.
        String query = "DELETE FROM CLIENT WHERE ID = ?";

        try {
                Connection conn = this.getConnection(); // Conecta.
                PreparedStatement statement = conn.prepareStatement(query);

                statement.setLong(1, client.getId());
                statement.executeUpdate(); // Executa query.

                statement.close();
                conn.close(); // Fecha conexao.
        } catch (SQLException e) {
        }
    }
}