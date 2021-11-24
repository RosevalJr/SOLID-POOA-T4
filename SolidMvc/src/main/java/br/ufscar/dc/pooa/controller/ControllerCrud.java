package br.ufscar.dc.pooa.controller;

import br.ufscar.dc.pooa.model.IModel;
import br.ufscar.dc.pooa.view.IView;

// Desconhece os outros dois?
// Controller é o injetor?
public class ControllerCrud implements IController{

    IView view;
    IModel model;
    
    
    @Override
    public void runStrategyModel() {
    }
    
}
