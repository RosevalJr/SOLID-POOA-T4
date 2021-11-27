package br.ufscar.dc.pooa.model;

// Classe interface que serve como modelo para a producao de objetos utilizados
// como "model". A implementação feita desta interface utiliza o padrao de projeto DAO.
// OBS: Utiliza generic type para possibilitar o controle de diferentes tipos de 
// dados dependendo da implementacao feita.
public interface IModel <Element>{
    
    // Insercao de elemento no model.
    public void create(Element el);
    // Leitura de um elemento armazenado no model.
    public Element read(Element el);
    // Atualização de elemento no model.
    public void update(Element el);
    // Exclusão de elemento no model.
    public void delete(Element el);
}