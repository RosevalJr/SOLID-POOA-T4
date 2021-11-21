# Trabalho 04 - Princípios SOLID
- Universidade Federal de São Carlos - Departamento de Computação
- Programação Orientada a Objetos Avançada
- Aluno: Roseval Donisete Malaquias Junior - RA: 758597
- Professor: Delano Medeiros Beder

---

# Introdução

A arquiteturação de projetos de software em larga escala é uma atividade complexa, que exige planejamento e coordenação entre o grupo de desenvolvedores a fim de evitar recursos desprendidos desnecessariamente durante a manutenção destes artefatos de código. Segundo Sommerville (2011), em média, cerca de dois terços dos recursos investidos em um projeto de software são direcionados às atividades de manutenção deste software [1]. Neste contexto, é natural que sejam estudadas e desenvolvidas técnicas e convenções para aprimorar a manutenibilidade e extensibilidade destes softwares. Diante disso, Robert C. Martin (Uncle Bob), em seu artigo "The Principles of OOD", propôs 5 princípios de design de programas orientados a objetos [2]. Michael Feathers observou estes 5 princípios de design de software orientados a objetos e os agrupou em um acrônimo, originando então o famoso acrônimo SOLID. Cada um desses princípios de design de software utilizam os paradigmas de orientação a objetos para a produção de artefatos de código robusto, extensível e de fácil manutenção. Dessa forma, artefatos de código produzidos com este padrão apresentam baixo acoplamento entre as classes presentes, funcionalidades focalizadas, facilmente testáveis e robustas. Neste acrônimo são representados 5 princípios de design de software orientado a objetos para cada uma de suas letras.

- **S** -- Single Responsibility Principle (SRP)
- **O** -- Open-Closed Principle (OCP)
- **L** -- Liskov Substitution Principle (LSP)
- **I** -- Interface Segregation Principle (ISP)
- **D** -- Dependency Inversion Principle (DIP)

Neste artigo será feito a definição de cada um dos princípios SOLID, e em seguida, discussão sobre sobre a relação entre os conceitos de inversão de controle, inversão de dependências e injeção de dependência. Por fim, será feita a apresentação de um projeto de software que aplica todos os conceitos definidos neste artigo. 

# Single Responsability Principle [S]

> "Uma classe deve ter apenas um motivo para mudar." [3]

O SRP dita que todo módulo de código deva possuir apenas uma responsabilidade com relação às funcionalidades de um projeto de software, e sendo assim, apresentar apenas um vetor de mudança. Caso todo módulo de código de um projeto de software apresente apenas uma responsabilidade, o projeto como um todo apresentará baixo acoplamento e alta coesão, dado que as funcionalidades do programa estarão altamente focalizadas em cada módulo. Portanto, os sistemas que adotam a utilização deste princípio possuem alta manutenabilidade. Esse comportamento é apresentando devido a baixa dependência entre os diversos módulos de código e focalização de cada módulo de código. Por exemplo, durante a fase de testes deste projeto de software, ao encontrar um defeito, os desenvolvedores terão fortes indícios de qual módulo de software deverá ser trabalhado para consertar tal defeito. Além disso, esse módulos podem ser reutilizados, apresentando baixas chances de encadeamento de erros, sendo que o código é organizado em módulos robustos e bem definidos. 

Para aplicar este princípio, é indicado que seja pensado no todo de uma aplicação, respondendo a seguinte pergunta: "Dentro do time de desenvolvimento, quem seria responsável por este módulo de código?". Caso a resposta desta pergunta resulte em mais de um grupo de pessoas, há fortes indícios que este módulo de código apresenta mais de uma responsabilidade, e deve ser refatorado para respeitar o SRP. Embora a aplicação deste princípio possa parecer simples, ela requer alto entendimento do contexto da aplicação e experiência em programação. Por exemplo, um programador pouco experiente, ou que está a pouco tempo em contato com um projeto, pode não visualizar completamente o escopo de uma aplicação. Isso pode levar a identificação de apenas uma única responsabilidade, onde na verdade para alguém experiente que já conhece a muito tempo o produto, tenha múltiplas responsabilidades. Essa quebra do SRP gerará classes com múltiplas responsabilidades com alto acoplamento e baixa coesão, dificultando a manutenção do sistema como um todo.

# Open-Closed Principle [O]

> "As entidades de software (classes, módulos, funções etc.) devem ser abertas para
ampliação, mas fechadas para modificação." [3] 

O desenvolvimento de software é cíclico e pode perdurar por diversas iterações. Dessa forma, é esperado que os projetos de software sejam adaptados às novas necessidades de seus usuários, dados a natureza evolutiva do mercado. Entretanto, a extensão de softwares "fracos" e idealizados sem um padrão em mente pelos desenvolvedores, implica na modificação de código já implementado, possivelmente, produzindo comportamentos não esperados pelo software resultante. Diante deste comportamento que pode produzir defeitos que dificultam a manutenção do software e sua extensão, foi proposto o OCP.

O OCP dita que os módulos de software devem ser abertos para ampliação, mas fechados para a modificação. Diante disso, o desenvolvimento dos módulos de software deve ser feito esperando que sejam feitas ampliações em sua funcionalidade. Entretanto, a aplicação destas ampliações nas funcionalidades do software, não deve implicar na alteração de código já implementado, pois isso pode resultar em comportamentos não esperados pelos desenvolvedores. Para aplicar este princípio no desenvolvimento de software, é utilizado o paradigma de abstração da orientação a objetos. Esse paradigma possibilita que sejam definidos os métodos e atributos que uma classe deve implementar para poder ser utilizada. Sendo assim, a extensão pode ser definida com a implementação de uma nova classe abstrata, implementando os métodos abstratos da classe abstrata herdada. A utilização desta ideia fará com que o software possa ser estendido pelos desenvolvedores. Entretanto, a aplicação desta extensão não implicará na modificação de código já implementado, mas sim a implementação de novo código para a extensão. Dessa forma, os módulos de software respeitaram o OCP, sendo abertos para ampliação, porém fechados para modificação.

Embora esse princípio possa resolver muitos dos problemas ligados à manutenção de software, ele não deve ser aplicado sem um planejamento prévio. A aplicação deste princípio deve ser resultante de uma observação de necessidade de ampliação de uma funcionalidade específica de um sistema, ou uma extensão já especificada pelo documento de requisitos do sistema. Dessa forma, é evitado o *Design Especulativo* que desprende recursos de maneira desnecessária no desenvolvimento de software, implementando código esperando que uma necessidade surja, sem saber se ela irá surgir realmente.

# Liskov Substitution Principle [L]

> "Os subtipos devem ser substituíveis pelos seus tipos de base." [3]

O polimorfismo é um dos principais paradigmas da programação orientada a objetos. Esse paradigma possibilita que duas ou mais classes derivadas de uma classe base possam chamar um método com a mesma assinatura, porém com comportamentos diferentes. Neste contexto, é importante que as classes derivadas sejam substituíveis pela classe base, para que as funcionalidades disponibilizadas por essas classes mantenham o mesmo comportamento no ponto de vista do cliente. Isso evita que seja necessário a modificação de código já implementado para adequar-se às individualidades de uma determinada classe derivada. Sendo assim, a fim de evitar esse comportamento prejudicial à manutenção do código, foi idealizado o princípio de LSP. Esse princípio diz que toda classe derivada deve poder ser substituída pela sua classe base. Essencialmente, obrigando que todos os relacionamentos de herança enquadram-se no comportamento de “substituível”, evitando comportamento inesperados em tempo de execução, gerados pela aplicação errada desse paradigma de programação orientada a objetos.

Importante destacar que, o princípio de LSP é um dos principais possibilitadores de aplicação do princípio OCP. Sendo que, quando uma classe derivada é substituível por sua classe base, não será necessário a modificação de código já implementado para adequar-se a individualidades dos subtipos, dado uma possível quebra do princípio de LSP. Dessa forma, a aplicação do LSP possibilita que o projeto seja extensível, sem a aplicação de modificações em código já implementado, mostrando-se extremamente importante para a aplicação do OCP e assim a manutenibilidade de um projeto.

# Interface Segregation Principle [I]

> "Os clientes não devem ser obrigados a depender de métodos que não utilizam." [3]

Em muitos casos, é tentador produzir interfaces grandes que englobam múltiplas funcionalidades, sendo responsabilidade das classes derivadas, implementar devidamente os métodos que serão utilizados. Entretanto, isso é uma má prática de programação, sendo que outros desenvolvedores podem não ter conhecimento que nem todos os métodos de uma classe estão implementados corretamente. Esses desenvolvedores podem utilizar esses métodos falhos, ocasionando erros de execução que podem demorar para serem corrigidos em sua manutenção. A fim de evitar esses tipos de defeitos no desenvolvimento de softwares orientados a objetos, foi proposto o ISP. Esse princípio diz que classes clientes não devem depender de métodos que não utilizam. Sendo assim, uma classe que herda de uma classe interface, deve implementar apenas aquilo que irá utilizar. Caso haja métodos que não serão utilizados na interface pela classe, a interface deve ser segregada em múltiplas interfaces, para que as classes derivadas sejam obrigadas a implementar apenas aquilo que irão utilizar. Com isso, não há a possibilidade dos clientes utilizarem métodos que não foram devidamente implementados. Também, o código resultante estará melhor modularizado, facilitando a manutenção.

# Dependency Inversion Principle [D]

>" A. Módulos de alto nível não devem depender de módulos de baixo nível. Ambos
devem depender de abstrações." [3]

>" B. As abstrações não devem depender de detalhes. Os detalhes devem depender
das abstrações." [3]

Normalmente, em métodos procedurais é observado o comportamento de produção de artefatos de software, que contém módulos de alto nível que dependem de módulos de baixo nível. Entretanto, isso mostra-se problemático, visto que os módulos de alto nível são aqueles que carregam as regras de negócio de um sistema. A fim de produzir código com baixo acoplamento, e assim robusto, é desejável que esses módulos de código sejam independentes aos módulos de código de baixo nível. Dessa forma, esses módulos de alto nível podem ser reutilizados em outras partes do código também. Diante disso, foi criado o princípio de DIP, que "inverte" esse comportamento recorrente de métodos procedurais. Este princípio reza que os módulos de alto e baixo nível devem depender apenas de abstrações, e as abstrações não devem depender de detalhes, os detalhes devem depender das abstrações. A aplicação deste princípio deste princípio em um projeto de software pode ser mensurado, segundo a heurística "depender de abstrações". Nesta heurística é definido as seguintes métricas segundo [3]:

- "Nenhuma variável deve conter uma referência para uma classe concreta.";
- "Nenhuma classe deve derivar de uma classe concreta.";
- "Nenhum método deve sobrescrever um método implementado de qualquer uma de
suas classes base.".

É possível observar que nesta heurística tudo realmente depende de abstrações. Entretanto, sabe-se que alguma entidade de código de um projeto estará responsável por instanciar as classes concretas, e os módulos que necessitem dessas instâncias deverão depender desta entidade. Neste caso, é recomendado que seja usado o padrão de projeto "Factory", que já define um design de software que respeita o SOLID, e implica em um código robusto, modularizado e coeso. Também, existem casos de instâncias de classe concreta não voláteis como "string". Entretanto, classes não voláteis não apresentam problema neste sentido para a quebra deste princípio.


# Injeção de Dependências, Inversão de Dependência e Inversão de Controle

Naturalmente, muitas pessoas confundem os termos inversão de dependência, inversão de controle e injeção de dependência, dado suas correlações de tema e aplicações. Entretanto, esses termos referem-se a padrões e técnicas diferentes para atingir objetivos interligados. Diante disso, o termo injeção de dependência refere-se a um padrão de projeto, que implica em um design que reduz ou remove a acoplação entre classes. Ao invés dos dependentes de uma classe serem instanciados de maneira estática, ou diretamente, os colaboradores são "injetados" na classe como dependência, sem que essa classe tenha conhecimento da instância que foi injetada (devido a abstração). Essa injeção de dependência, normalmente, é feita de 3 formas diferentes dentro da própria classe, sendo elas a injeção por construtor, injeção por setter e injeção por método. Neste contexto, é possível observar que a aplicação deste de padrão de projeto, implica na concordância com o princípio de inversão de dependência. Esse princípio reza que os artefatos de código de um projeto de software devem depender de uma abstração e não de uma implementação. Através deste princípio, classes implementam dependências através de abstrações, sem necessariamente saber como os dependentes serão implementados. Isso auxilia na produção de projetos de código com alta coesão e baixo acoplamento, facilitando a manutenção e extensão do projeto. Mesmo havendo a possibilidade de aplicação do padrão de projeto de injeção de dependência, dado os 3 métodos citados, é interessante modularizar esse processo, produzindo um artefato de código que o seu único papel é a injeção de dependências. Em sua maioria esses artefatos são chamados de classes “Factory”. Entretanto, também são chamados de repositórios de “inversão de controle “ (IoC), devido a inversão de controle de execução do código, sendo que esses repositórios ficam responsáveis por fornecer instâncias de tipos (injeção de dependências), sem que a classe precise solicitar essas instâncias [4]. Portanto, a inversão de controle está totalmente relacionada à injeção de dependências, sendo designado o papel de injetor de dependências para classes "Factory" ou frameworks, ao invés da própria classe que recebe as dependências [5].


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
