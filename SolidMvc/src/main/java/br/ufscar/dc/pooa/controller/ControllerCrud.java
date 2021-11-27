package br.ufscar.dc.pooa.controller;

import br.ufscar.dc.pooa.model.Client;
import br.ufscar.dc.pooa.model.IModel;
import br.ufscar.dc.pooa.view.IView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Classe que implementa a interface de IController, implementando o metodo
// strategy desta interface a fim de realizar o CRUD de client pelo terminal.
@Component
public class ControllerCrud implements IController{

    // Modulo View.
    @Autowired
    IView view;
    // Modulo model.
    @Autowired
    IModel model;
    
    // Implementacao do metodo strategy de CRUD de clients.
    @Override
    public void runStrategyModel() {
        
        // Envia mensagem inicial com comandos para controlar.
        view.sendMessageUser("Bem-vindo ao sistema de CRUD de clientes!\n"
                + "Opções: \n"
                + "C (inserção de cliente no banco)\n"
                + "R (leitura de cliente no banco)\n"
                + "U (atualização de cliente no banco)\n"
                + "D (exclusão de cliente no banco)\n"
                + "exit (fecha o sistema)\n"
                + "> ");
        
        // Solicita a entrada do usuario pelo view.
        String comand = (String)view.getMessageUser();
        while(!comand.equals("exit")){
            // Create.
            if(comand.equals("C"))
                comandC();
            else if(comand.equals("R")) // Read.
                    comandR();
            else if(comand.equals("U")) // Update.
                    comandU();
            else if(comand.equals("D")) // Delete.
                    comandD();
            else if(comand.equals("exit")) // Sair.
                System.exit(0);
            else
                view.sendMessageUser("Comando inválido!\n"
                        + "> ");
            
            // Solicita a entrada do usuario pelo view novamente.
            comand = (String)view.getMessageUser();
        }
        
        // Caso comando "exit" programa deve fechar.
        if(comand.equals("exit"))
            System.exit(0);
    }
    
    // Insercao de cliente no banco.
    private void comandC(){
        Client client = new Client();
        
        // Recebe as entradas do usuario pelo view.
        view.sendMessageUser("Inserção de cliente!\n");
        view.sendMessageUser("> CPF: ");
        client.setCpf((String)view.getMessageUser());
        view.sendMessageUser("> NOME: ");
        client.setNome((String)view.getMessageUser());
        view.sendMessageUser("> EMAIL: ");
        client.setEmail((String)view.getMessageUser());
        
        // Envia ao model o cliente.
        model.create(client);
        
        view.sendMessageUser("> Inserção concluida! \n"
                + "> ");
    }
    
    // Leitura de cliente no banco.
    private void comandR(){
        Client client = new Client();
        view.sendMessageUser("Leitura de cliente!\n"
            + "> ID(id do cliente a ser acessado): ");
        
        // Recebe o ID do cliente
        String id = (String) view.getMessageUser();
        client.setId(Integer.parseInt(id));
        
        // Solicita ao model o client com o respectivo id passado.
        Client receivedClient = (Client) model.read(client);
        
        // Envia ao usuario as informacoes do client.
        view.sendMessageUser("> ID: " + String.valueOf(receivedClient.getId()) + "\n");
        view.sendMessageUser("> CPF: " + receivedClient.getCpf() + "\n");
        view.sendMessageUser("> NOME: " + receivedClient.getNome() + "\n");
        view.sendMessageUser("> EMAIL: " + receivedClient.getEmail() + "\n"
                + "> ");
    }
    
    // Atualização de cliente no banco.
    private void comandU(){
        Client client = new Client();
        view.sendMessageUser("Atualização de cliente!\n"
            + "> ID(id do cliente a ser atualizado): ");
        
        // Recebe o ID do cliente
        String id = (String) view.getMessageUser();
        client.setId(Integer.parseInt(id));
        view.sendMessageUser("> CPF: ");
        client.setCpf((String)view.getMessageUser());
        view.sendMessageUser("> NOME: ");
        client.setNome((String)view.getMessageUser());
        view.sendMessageUser("> EMAIL: ");
        client.setEmail((String)view.getMessageUser());
        
        // Solicita ao model a atualização do cliente do respectivo id passado.
        model.update(client);
        
        view.sendMessageUser("> Atualização concluida! \n"
        + "> ");
    }
    
    // Exclusão de cliente no banco.
    private void comandD(){
        Client client = new Client();
        view.sendMessageUser("Exclusão de cliente!\n"
            + "> ID(id do cliente a ser excluido): ");
        
        // Recebe o ID do cliente
        String id = (String) view.getMessageUser();
        client.setId(Integer.parseInt(id));
        
        // Solicita ao model a exclusão do cliente do respectivo id passado.
        model.delete(client);
        
        view.sendMessageUser("> Exclusão concluida! \n"
        + "> ");
    }
}
