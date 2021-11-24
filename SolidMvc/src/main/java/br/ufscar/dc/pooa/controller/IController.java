package br.ufscar.dc.pooa.controller;

// Classe interface utilizada para definir o método strategy de um modulo
// CONTROLLER de uma arquitetura MVC. A implementação desta classe utiliza 
// IView e IController para possibilitar o CRUD de cliente pelo terminal.
public interface IController {
    
    public void runStrategyModel();
}
