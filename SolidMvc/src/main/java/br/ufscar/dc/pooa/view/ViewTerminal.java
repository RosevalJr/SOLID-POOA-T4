package br.ufscar.dc.pooa.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

// Classe responsavel por implementar os metodos de IView a fim de possibilitar
// a comunicacao com usuario por meio de um Terminal.
@Component
public class ViewTerminal implements IView<String>{
    
    BufferedReader buffIn;
    BufferedWriter buffOut; 
    
    // Inicializar o buffer de leitura.
    // Inicializa o buffer de escrita.
    public ViewTerminal(){
        this.buffIn = new BufferedReader(new InputStreamReader(System.in));
        this.buffOut = new BufferedWriter(new OutputStreamWriter(System.out));
    }
    
    // Recebe a mensagem do usuario por meio do buffer de leitura do terminal.
    @Override
    public String getMessageUser(){
        try {
            return buffIn.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ViewTerminal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    // Envia a mensagem ao usuario pelo terminal atraves do buffer de escrita.
    @Override
    public void sendMessageUser(String msg) {
        try {
            buffOut.write(msg);
            buffOut.flush();
        } catch (IOException ex) {
            Logger.getLogger(ViewTerminal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
