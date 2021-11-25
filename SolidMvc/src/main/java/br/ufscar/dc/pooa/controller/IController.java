package br.ufscar.dc.pooa.controller;

// Classe interface utilizada para definir o método strategy de um modulo
// CONTROLLER de uma arquitetura MVC. A implementação desta classe utiliza 
// IView e IController para possibilitar o CRUD de client pelo terminal.
public interface IController {
    
    // Metodo strategy
    public void runStrategyModel();
}
