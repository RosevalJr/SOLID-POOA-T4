package br.ufscar.dc.pooa.view;

// Classe interface que serve como modelo para a producao de objetos utilizados
// como "view". A implementação feita desta interface utiliza o Terminal 
// como meio de comunicacao com o usuario.
public interface IView <Message> {
    public Message getMessageUser();
    public void sendMessageUser(Message msg);
}
