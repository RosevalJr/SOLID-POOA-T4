package br.ufscar.dc.pooa.solidmvc;

import br.ufscar.dc.pooa.controller.ControllerCrud;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Classe main responsavel por inicializar o arquivo de configuracoes do spring
// para que entao o framework realize as injeções de dependencias necessarias, e 
// faz a chamada para execução do strategy do controller.
public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
                ControllerCrud controller = ctx.getBean(ControllerCrud.class);
                // Executa strategy.
                controller.runStrategyModel(); 
	}
}