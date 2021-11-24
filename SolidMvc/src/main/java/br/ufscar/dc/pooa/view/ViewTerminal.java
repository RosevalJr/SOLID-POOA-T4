// Em producao.
package br.ufscar.dc.pooa.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

// Classe responsável por por implementar os métodos de IView a fim de possibilitar
// a comunicacao com usuario por meio de um Terminal.
public class ViewTerminal implements IView<String>{

    /*// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        System.out.println(name);*/
    
    BufferedReader buffIn;
    //BufferedWriter buffOut;
    
    // Inicilizar o buffer de leitura.
    // Injecao de dependencia por construtor.
    ViewTerminal(BufferedReader buffIn){
        this.buffIn = buffIn; //= new BufferedReader(new InputStreamReader(System.in));
        // buffOut
    }
    
    // Recebe a mensagem do usuario por meio do buffer de leitura do terminal.
    @Override
    public String getMessageUser(){
        try {
            return buffIn.readLine();
        } catch (IOException ex) {
            return null;
        }
    }

    // Envia a mensagem ao usuario pelo terminal.
    @Override
    public void sendMessageUser(String msg) {
        System.out.println(msg);
    }
    
}
