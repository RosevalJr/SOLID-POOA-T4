# Trabalho 04 - Princípios SOLID
- Universidade Federal de São Carlos - Departamento de Computação
- Programação Orientada a Objetos Avançada
- Aluno: Roseval Donisete Malaquias Junior - RA: 758597
- Professor: Delano Medeiros Beder

---

# Introdução

A arquiteturação de projetos de software em larga escala é uma atividade complexa, que exige planejamento e coordenação entre o grupo de desenvolvedores a fim de evitar recursos desprendidos desnecessariamente, durante a manutenção destes artefatos de código. Segundo Sommerville (2011), em média, cerca de dois terços dos recursos investidos em um projeto de software são direcionados às atividades de manutenção deste software [1]. Neste contexto, é natural que sejam estudadas e desenvolvidas técnicas e convenções para aprimorar a manutenibilidade e extensibilidade destes softwares. Diante disso, Robert C. Martin (Uncle Bob), em seu artigo "The Principles of OOD", propôs 5 princípios de design de programas orientados a objetos [2]. Michael Feathers observou estes 5 princípios de design de software orientados a objetos e os agrupou em um acrônimo, originando então o famoso acrônimo SOLID. Cada um desses princípios de design de software utilizam os paradigmas de orientação a objetos para auxiliar a produção de artefatos de código robustos, extensíveis e de fácil manutenção. Dessa forma, artefatos de código produzidos com estes padrões apresentam baixo acoplamento entre as classes presentes, funcionalidades focalizadas, facilmente testáveis e robustas. Neste acrônimo são representados 5 princípios de design de software orientado a objetos para cada uma de suas letras.

- **S** -- Single Responsibility Principle (SRP)
- **O** -- Open-Closed Principle (OCP)
- **L** -- Liskov Substitution Principle (LSP)
- **I** -- Interface Segregation Principle (ISP)
- **D** -- Dependency Inversion Principle (DIP)

Neste artigo será feito a definição de cada um dos princípios SOLID, e em seguida, a discussão sobre a relação entre os conceitos de inversão de controle, inversão de dependências e injeção de dependência. Por fim, será feita a apresentação de um projeto de software que aplica todos os conceitos definidos neste artigo.

# Single Responsability Principle [S]

> "Uma classe deve ter apenas um motivo para mudar." [3]

O SRP dita que todo módulo de código deve possuir apenas uma responsabilidade com relação às funcionalidades de um projeto de software, e sendo assim, apresentar apenas um vetor de mudança. Caso todo módulo de código de um projeto de software apresente apenas uma responsabilidade, o projeto como um todo apresentará baixo acoplamento e alta coesão, dado que as funcionalidades do programa estarão altamente focalizadas em cada módulo. Portanto, os sistemas que adotam a utilização deste princípio possuem alta manutenabilidade. Esse comportamento é apresentando devido a baixa dependência entre os diversos módulos de código e focalização de cada módulo de código. Por exemplo, durante a fase de testes deste projeto de software, ao encontrar um defeito, os desenvolvedores terão fortes indícios de qual módulo de software deverá ser trabalhado para consertar tal defeito. Além disso, esse módulos podem ser reutilizados, apresentando baixas chances de encadeamento de erros, sendo que o código é organizado em módulos robustos e bem definidos. 

Para aplicar este princípio, é indicado que seja pensado no todo de uma aplicação, respondendo a seguinte pergunta: "Dentro do time de desenvolvimento, quem seria responsável por este módulo de código?". Caso a resposta desta pergunta resulte em mais de um grupo de pessoas, há fortes indícios que este módulo de código apresenta mais de uma responsabilidade, e deve ser refatorado para respeitar o SRP. Embora a aplicação deste princípio possa parecer simples, ela requer alto entendimento do contexto da aplicação e experiência em programação. Por exemplo, um programador pouco experiente, ou que está a pouco tempo em contato com um projeto, pode não visualizar completamente o escopo de uma aplicação. Isso pode levar a identificação de apenas uma única responsabilidade, onde na verdade para alguém experiente que já conhece a muito tempo o produto, tenha múltiplas responsabilidades. Essa quebra do SRP gerará classes com múltiplas responsabilidades com alto acoplamento e baixa coesão, dificultando a manutenção do sistema como um todo.

# Open-Closed Principle [O]

> "As entidades de software (classes, módulos, funções etc.) devem ser abertas para
ampliação, mas fechadas para modificação." [3] 

O desenvolvimento de software é cíclico e pode perdurar por diversas iterações. Dessa forma, é esperado que os projetos de software sejam adaptados às novas necessidades de seus usuários, dado a natureza evolutiva do mercado. Entretanto, a extensão de softwares "fracos" e idealizados sem um padrão em mente pelos desenvolvedores, implica na modificação de código já implementado, possivelmente, produzindo comportamentos não esperados pelo software resultante. Diante deste comportamento que pode produzir defeitos que dificultam a manutenção do software e sua extensão, foi proposto o OCP.

O OCP dita que os módulos de software devem ser abertos para ampliação, mas fechados para a modificação. Diante disso, o desenvolvimento dos módulos de software deve ser feito esperando que sejam feitas ampliações em sua funcionalidade. Entretanto, a aplicação destas ampliações nas funcionalidades do software, não deve implicar na alteração de código já implementado, pois isso pode resultar em comportamentos não esperados pelos desenvolvedores. Para aplicar este princípio no desenvolvimento de software, é utilizado o paradigma de abstração da orientação a objetos. Esse paradigma possibilita que sejam definidos os métodos e atributos que uma classe deve implementar para poder ser utilizada. Sendo assim, a extensão pode ser definida com a implementação de uma nova classe abstrata, implementando os métodos abstratos da classe abstrata herdada. A utilização desta ideia fará com que o software possa ser estendido pelos desenvolvedores. Entretanto, a aplicação desta extensão não implicará na modificação de código já implementado, mas sim a implementação de novo código para a extensão. Dessa forma, os módulos de software respeitaram o OCP, sendo abertos para ampliação, porém fechados para modificação.

Embora esse princípio possa resolver muitos dos problemas ligados à manutenção de software, ele não deve ser aplicado sem um planejamento prévio. A aplicação deste princípio deve ser o resultado de uma observação de necessidade de ampliação de uma funcionalidade específica de um sistema, ou uma extensão já especificada pelo documento de requisitos do sistema. Dessa forma, é evitado o Design Especulativo que desprende recursos de maneira desnecessária no desenvolvimento de software, implementando código esperando que uma necessidade surja.

# Liskov Substitution Principle [L]

> "Os subtipos devem ser substituíveis pelos seus tipos de base." [3]

O polimorfismo é um dos principais paradigmas da programação orientada a objetos. Esse paradigma possibilita que duas ou mais classes derivadas de uma classe base possam chamar um método com a mesma assinatura, porém com comportamentos diferentes. Neste contexto, é importante que as classes derivadas sejam substituíveis pela classe base, para que as funcionalidades disponibilizadas por essas classes mantenham o mesmo comportamento no ponto de vista do cliente. Isso evita que seja necessária a modificação de código já implementado para adequar-se às individualidades de uma determinada classe derivada. Sendo assim, a fim de evitar esse comportamento prejudicial à manutenção do código, foi idealizado o princípio de LSP. Esse princípio diz que toda classe derivada deve poder ser substituída pela sua classe base. Essencialmente, obrigando que todos os relacionamentos de herança enquadram-se no comportamento de “substituível”, evitando comportamentos inesperados em tempo de execução, gerados pela aplicação errada desse paradigma de programação orientada a objetos.

Importante destacar que, o princípio de LSP é um dos principais possibilitadores de aplicação do princípio OCP. Sendo que, quando uma classe derivada é substituível por sua classe base, não será necessário a modificação de código já implementado para adequar-se a individualidades dos subtipos, dado uma possível quebra do princípio de LSP. Dessa forma, a aplicação do LSP possibilita que o projeto seja extensível, sem a aplicação de modificações em código já implementado, mostrando-se extremamente importante para a aplicação do OCP e assim a manutenibilidade de um projeto.

# Interface Segregation Principle [I]

> "Os clientes não devem ser obrigados a depender de métodos que não utilizam." [3]

Em muitos casos, é tentador produzir interfaces grandes que englobam múltiplas funcionalidades, sendo responsabilidade das classes derivadas, implementar devidamente os métodos que serão utilizados. Entretanto, isso é uma má prática de programação, sendo que outros desenvolvedores podem não ter conhecimento que nem todos os métodos de uma classe estão implementados corretamente. Esses desenvolvedores podem utilizar esses métodos falhos, ocasionando erros de execução que podem demorar para serem corrigidos em sua manutenção. A fim de evitar esses tipos de defeitos no desenvolvimento de softwares orientados a objetos, foi proposto o ISP. Esse princípio diz que classes clientes não devem depender de métodos que não utilizam. Sendo assim, uma classe que herda de uma classe interface, deve implementar apenas os métodos que irá utilizar. Caso haja métodos que não serão utilizados na interface pela classe, a interface deve ser segregada em múltiplas interfaces, para que as classes derivadas sejam obrigadas a implementar apenas aquilo que irão utilizar. Com isso, não há a possibilidade dos clientes utilizarem métodos que não foram devidamente implementados. Também, o código resultante estará melhor modularizado, facilitando a manutenção.

# Dependency Inversion Principle [D]

>" A. Módulos de alto nível não devem depender de módulos de baixo nível. Ambos
devem depender de abstrações." [3]

>" B. As abstrações não devem depender de detalhes. Os detalhes devem depender
das abstrações." [3]

Normalmente, em métodos procedurais é observado o comportamento de produção de artefatos de software, que contém módulos de alto nível que dependem de módulos de baixo nível. Entretanto, isso mostra-se problemático, visto que os módulos de alto nível são aqueles que carregam as regras de negócio de um sistema. A fim de produzir código com baixo acoplamento, e assim robusto, é desejável que esses módulos de código sejam independentes aos módulos de código de baixo nível. Dessa forma, esses módulos de alto nível podem ser reutilizados em outras partes do código também. Diante disso, foi criado o DIP, que "inverte" esse comportamento recorrente de métodos procedurais. Este princípio reza que os módulos de alto e baixo nível devem depender apenas de abstrações, e as abstrações não devem depender de detalhes, os detalhes devem depender das abstrações. A aplicação deste princípio em um projeto de software pode ser mensurado, segundo a heurística "depender de abstrações". Nesta heurística é definido as seguintes métricas segundo [3]:

- "Nenhuma variável deve conter uma referência para uma classe concreta.";
- "Nenhuma classe deve derivar de uma classe concreta.";
- "Nenhum método deve sobrescrever um método implementado de qualquer uma de
suas classes base.".

É possível observar que nesta heurística tudo realmente depende de abstrações. Entretanto, sabe-se que alguma entidade de código de um projeto estará responsável por instanciar as classes concretas, e os módulos que necessitem dessas instâncias deverão depender desta entidade. Neste caso, é recomendado que seja usado o padrão de projeto "Factory", que já define um design de software que respeita o SOLID, e implica em um código robusto, modularizado e coeso. Também, existem casos de instâncias de classe concreta não voláteis como "string". Entretanto, classes não voláteis não apresentam problema neste sentido para a quebra deste princípio.


# Injeção de Dependências, Inversão de Dependência e Inversão de Controle

Naturalmente, muitas pessoas confundem os termos inversão de dependência, inversão de controle e injeção de dependência, dado suas correlações de tema e aplicações. Entretanto, esses termos referem-se a padrões e técnicas diferentes para atingir objetivos interligados. O termo injeção de dependência refere-se a um padrão de projeto, que implica em um design que reduz ou remove a acoplação entre classes. Ao invés dos dependentes de uma classe serem instanciados de maneira estática, ou diretamente, os colaboradores são "injetados" na classe como dependência, sem que essa classe tenha conhecimento da instância que foi injetada (devido a abstração). Essa injeção de dependência, normalmente, é feita de 3 formas diferentes, sendo elas a injeção por construtor, injeção por setter e injeção por método. Neste contexto, é possível observar que a aplicação deste de padrão de projeto, implica na concordância com o princípio de inversão de dependência. Esse princípio reza que os artefatos de código de um projeto de software devem depender de uma abstração e não de uma implementação. Através deste princípio, classes implementam dependências através de abstrações, sem necessariamente saber como os dependentes serão implementados. Isso auxilia na produção de projetos de código com alta coesão e baixo acoplamento, facilitando a manutenção e extensão do projeto. Mesmo havendo a possibilidade de aplicação do padrão de projeto de injeção de dependência, dado os 3 métodos citados, é interessante modularizar esse processo, produzindo um artefato de código que o seu único papel é a injeção de dependências. Em sua maioria esses artefatos são chamados de classes “Factory”. Entretanto, também são chamados de repositórios de “inversão de controle “ (IoC), devido a inversão de controle de execução do código, sendo que esses repositórios ficam responsáveis por fornecer instâncias de tipos (injeção de dependências), sem que a classe precise solicitar essas instâncias [4]. Portanto, a inversão de controle está totalmente relacionada à injeção de dependências, sendo designado o papel de injetor de dependências para classes "Factory" ou frameworks, ao invés da própria classe que recebe as dependências [5].

# Ferramenta SolidMvc

Para demonstrar a aplicação de todos os princípios do acrônimo SOLID, foi produzido um projeto maven com arquitetura MVC, utilizando os padrões de projeto DAO e Strategy. Essa ferramenta produzida foi nomeada de SolidMvc, e possibilita a extensão de cada um dos módulos do MVC, adicionando novas funcionalidades à ferramenta sem alterar código já implementado. As classes implementadas no exemplo apresentado do projeto, realiza o CRUD de clientes em um banco de dados mySql, apresentando resultados e requisições no terminal. Como pode ser observado na Figura 1, foi produzido um diagrama com a Unified Modeling Language (UML) com relações e modularizações produzidas.

![Figura 1](https://github.com/RosevalJr/SOLID-POOA-T4/blob/main/imgUML/umlSolidMvc.jpeg)
<div align="center">
  <b>Figura 1: Diagrama UML da ferramenta SolidMvc, apresentando seus módulos, classes e relacionamentos.</b>
</div>

Na Figura 1 é possível observar que o projeto foi divido em módulos ``Model``, ``View`` e ``Controller``, aplicando os princípios SOLID a fim de possibilitar que estes módulos sejam independentes, possibilitando sua aplicação em diferentes contextos. Dessa forma, através da abstração todos os módulos podem ser utilizados em outros projetos em contextos diferentes, possivelmente, até mesmo como um framework para outro projeto.

## Por Que Este Projeto Respeita os Princípios SOLID?

Esse projeto respeita todos os princípios SOLID, tendo em vista que ele foi produzido segundo o padrão arquitetural "Model View Controller" (MVC), agrupando as principais funcionalidades do programa em grupos de artefatos de código com funcionalidades em mesmo escopo. Além disso, foi aplicado os padrões de projeto de Injeção de Dependência com o ``Spring Framework``a fim de reduzir ao máximo o acoplamento entre classes, deixando as classes dependentes apenas de abstrações e não implementações. Também, foi aplicado o padrão de projeto "Data Access Object" (DAO) a fim de modularizar as responsabilidades de encapsulamento dos dados do módulo ``Model`` e acesso e conexão ao banco de dados. Por fim, foi aplicado o padrão de projeto "Strategy" nos artefatos de código dos módulos ``Controller``, ``Model`` e ``View`` a fim de possibilitar a extensão dos módulos sem resultar em alterações em código  já implementado, pois este padrão de projeto fornece uma classe interface com um método Strategy, que pode ser implementado segundo a extensão desejada.

Inicialmente, é importante destacar que para todas as classes produzidas neste projeto, há a documentação explicando suas funcionalidades e responsabilidade. Para cada um dos módulos idealizados pelo autor, foi produzida uma classe interface que define métodos Strategyss que serão implementados pelas classes que implementam essa classe interface. Diante disso, o projeto respeita o SRP, como pode ser visualizado na Figura 1, a classe ``IView`` é responsável por servir como modelo para a produção de objetos utilizados como a camada ``View`` do MVC, fornecendo duas assinaturas de métodos que deverão ser implementados para fornecer as funcionalidades a camada ``Controller``. Além disso, ela utiliza o "Generic types" para possibilitar a implementação de métodos que enviam e recebem mensagens do usuário em diferentes formatos. A classe que realiza a implementação desta classe interface é a classe ``ViewTerminal``. Essa classe é responsável por implementar os métodos de ``IView`` a fim de possibilitar a comunicação com usuário por meio de um Terminal com mensagens de texto de entrada e saída. As classes deste módulo respeitam o OCP, sendo que é possível realizar a extensão da funcionalidade do módulo ``View`` apenas criando uma nova classe que implemente a classe interface ``IView``, produzindo um novo meio de comunicação com o usuário. Também, respeita o LSP, sendo que a classe derivada ``ViewTerminal`` pode ser substituída por sua classe base ``IView``. Além disso, respeita o ISP, sendo que as classes que implementam classes interface, implementam apenas os métodos que utilizam. Por fim, também respeita o DIP, sendo que todas as classes dependem de abstrações e não de implementações, como pode ser visualizado na Figura 1.

Com relação ao módulo ``Model``, ele também respeita os princípios SOLID. Neste módulo o SRP é respeitado, pois há 3 classes neste módulo que apresentam apenas 1 responsabilidade cada uma. A classe ``IModel`` é responsável por especificar as assinaturas dos métodos que serão utilizadas pelos clientes deste módulo, com relação a acessar o módulo ``Model`` e acessando os dados que foram armazenados. A classe ``ModelClientDAO`` implementa a classe interface ``IModel``, sendo responsável por conectar no banco de dados e realizar as operações de acesso ao banco (Queries). Por fim, a classe ``Client`` é a classe "Domain" do padrão de projeto DAO, sendo responsável por encapsular as informações de cliente. Esse módulo também respeita o OCP, pois a funcionalidade do módulo ``Model`` pode ser estendida, implementando a classe interface ``IModel``. Diante disso, é possível alterar como os dados são acessados, armazenados e que tipo de dados serão modelados Um exemplo de extensão seria alterar o modelo de persistência dos dados, modificando o banco de dados utilizado. Além disso, este módulo também respeita o LSP, sendo que a classe derivada ``ModelClientDAO`` pode ser substituída por sua classe base. Também, respeita o ISP, pois as classes que implementam interfaces precisam implementar apenas  os métodos que utilizam. Por fim, esse módulo também respeita o DIP, sendo que é utilizado o ``Spring Framework`` que realiza as injeções das dependências necessárias do projeto, diminuindo o acoplamento entre as classes. Além disso, todas as classes dependem de abstrações e não de implementações.

O módulo ``Controller`` também respeita os princípios SOLID. Ele respeita o SRP, apresentando apenas uma responsabilidade para cada uma das duas classes pertencentes a esse módulo. A classe ``IController`` é responsável por especificar as assinaturas do métodos Strategy de execução de um Controller. A classe ``ControllerCrud`` fica responsável por implementar a classe interface ``ÌController`` e seu método Strategy, definindo as regras de negócio para a execução de um CRUD de cliente. Esse módulo também respeita o OCP, sendo possível realizar a sua extensão, apenas sendo necessária a implementação de uma nova classe que implementa a classe interface do módulo, definindo as regras de negócio desejadas em sua implementação do método Strategy. Também, respeita o LSP, sendo que a classe ``ControllerCrud`` pode ser substituída por sua classe base ``IController``. Também respeita o ISP, sendo que as classes derivadas de classes interfaces são obrigadas a implementar apenas os métodos que utilizam. Por fim, também respeita o DIP, sendo neste módulo demonstrado, como pode ser visualizado na Figura 1, que todas as classes dependem apenas de abstrações, em destaque a classe ``ControllerCrud`` depende das duas interfaces do módulo view (``IView``) e módulo model (``IModel``).

Por fim, a classe ``Main`` está de acordo com os princípios SOLID, apresentando a responsabilidade de realizar a chamada do método Strategy da classe ``IController`` para iniciar sua rotina. Entretanto, inicialmente ela instancia o arquivo de configurações do ``Spring Framework`` para possibilitar a injeção de dependências no projeto.


## Como Executar o Projeto SolidMvc?

As funcionalidades implementadas da ferramenta podem ser testadas, através da execução do comando `` $ maven exec:java
`` na pasta raiz do projeto. Entretanto, é necessário a instação do **MySql Server** e sua devida configuração para a execução de todas as funcionalidades do projeto. Dessa forma, o autor utilizou o tutorial disponibilizado em [6], que demonstra um passo a passo para instalação e configuração do server mySql. Importante destacar que, o server deve possuir o acesso ao usuário ``root`` através da senha ``root``. Além disso, deve ser feita a execução do script de inicialização do banco de dados, que pode ser encontrado na pasta ``scriptBD``.

"jdbc:mysql://localhost:3306/CLIENT", "solid", "123abcABC!@#"
# Conclusão

Concluir com aquele pensamento de aprendizado. Falar o quão importante é o estudo dos princípios SOLID e ainda mais sua aplicação, sendo que o estudo de casos e aplicações de padrões de projeto podem ajudar na habituação de aplicação destes projetos. Mesmo durante a máteria de POOA o autor deste artigo já percebeu sua evolução na aplicação destes pricípios e, assim, aprimorando sua habilidade de projeão de artefatos de código com alta coesão e baixo acoplamento, auxiliando em possíveis manutenções e extensões destes artefatos. 

# Referências
> O estudo realizado para produção deste artigo foi feito, majoriatariamente, em livros e artigos indicados pelo professor. Entretanto, também foram utilizados alguns *White Papers* a fim de obter outras visões sobre os termos apresentados neste artigo.

**[1]** Sommerville, Ian. "Software engineering 9th Edition." ISBN-10 137035152 (2011): 18.

**[2]** http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod

**[3]** Robert Martin, Micah Martin, Princípios, Padrões e Práticas Ágeis em C#,  Bookman Editora, 2009 Martin Fowler. Inversion of Control. martinfowler.com, 2005.

**[4]** Martin Fowler. Inversion of Control. martinfowler.com, 2005.

**[5]** Martin Fowler. Inversion of Control Containers and the Dependency Injection pattern. martinfowler.com, 2004.

**[6]** https://martinfowler.com/articles/injection.html

**[7]** https://www.devmedia.com.br/conheca-os-padroes-de-projeto/957

**[8]** https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530

**[9]** https://www.eduardopires.net.br/2013/04/orientacao-a-objeto-solid/

**[10]** https://www.treinaweb.com.br/blog/introducao-aos-principios-solid

**[11]** https://martinfowler.com/bliki/InversionOfControl.html

Tudo esta complementamente desconectado mas o controlador parece estar errado;
 -- Ele obrigatoriamente precisa saber alguma coisa do view e controller para poder aplicar as regras de negócio.
Precisa realizar a implementação de outra extensão do sistema?
Duvida no bufferedwirtter e reader... -> Entretanto, classes não voláteis não apresentam problema neste sentido para a quebra deste princípio.
