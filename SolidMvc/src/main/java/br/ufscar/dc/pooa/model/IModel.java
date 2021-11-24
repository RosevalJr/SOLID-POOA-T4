package br.ufscar.dc.pooa.model;

// Classe interface que serve como modelo para a producao de objetos utilizados
// como "model". A implementação desta classe utiliza o padrao de projeto DAO.
public interface IModel <Element>{
    
    // Insercao de elemento no modelo.
    public void create(Element el);
    // Leitora de um elemento armazenado no modelo.
    public Element read(Element el);
    // Atualização de elemento no modelo.
    public void update(Element el);
    // Exclusão de elemento no modelo.
    public void delete(Element el);
}