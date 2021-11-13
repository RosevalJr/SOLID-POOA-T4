# Trabalho 04 - Princípios SOLID
- Universidade Federal de São Carlos - Departamento de Computação
- Programação Orientada a Objetos Avançada
- Aluno: Roseval Donisete Malaquias Junior - RA: 758597
- Professor: Delano Medeiros Beder

---

# Introdução

A arquiteturação de projetos de software em larga escala é uma atividade complexa, que exige planejamento e coordenação entre o grupo de desenvolvedores a fim de evitar recursos desprendidos desnecessariamente durante a manutenção destes artefatos de código. Segundo Sommerville (2011), em média, cerca de dois terços dos recursos investidos em um projeto de software são direcionados às atividades de manutenção deste software. Neste contexto, é natural que sejam estudadas e desenvolvidas técnicas e convenções para aprimorar a manutenibilidade e extensibilidade destes softwares. Diante disso, Robert C. Martin (Uncle Bob), em seu artigo "The Principles of OOD", propôs 5 princípios de design de programas orientados a objetos. Michael Feathers observou estes 5 princípios de design de software orientados a objetos e os agrupou em um acrônimo, originando então o famoso acrônimo SOLID. Cada um desses princípios de design de software utilizam os paradigmas de orientação a objetos para a produção de artefatos de código robusto, extensível e de fácil manutenção. Dessa forma, artefatos de código produzidos com este padrão apresentam baixo acoplamento entre as classes presentes, funcionalidades focalizadas, facilmente testáveis e robustas. Neste acrônimo são representados 5 princípios de design de software orientado a objetos para cada uma de suas letras.

- **S** -- Single Responsibility Principle (SRP)
- **O** -- Open-Closed Principle (OCP)
- **L** -- Liskov Substitution Principle (LSP)
- **I** -- Interface Segregation Principle (ISP)
- **D** -- Dependency Inversion Principle (DIP)

Neste artigo será feito a definição de cada um dos princípios SOLID, e em seguida, discussão sobre sobre a relação entre os conceitos de inversão de controle, inversão de dependências e injeção de dependência. Por fim, será feita a apresentação de um projeto de software que aplica todos os conceitos definidos neste artigo. 

((Fazer um item especifico para design de projeto e discutir este tema lá ...))
> O que é ? (Definição)
> Para atingir ele é preciso fazer o que?
> A sua aplicação resulta no que?

# Single Responsability Principle [S]

> "Uma classe deve ter apenas um motivo para mudar" [4]

O SRP dita que todo módulo de código deve possuir apenas uma responsabilidade com relação às funcionalidades de um projeto de software, e sendo assim, apresentar apenas um vetor de mudança. Caso todo módulo de código de um projeto de software apresente apenas uma responsabilidade, o projeto como um todo apresentará baixo acoplamento e alta coesão, dado que as funcionalidades do programa estarão altamente focalizadas em cada módulo. Portanto, os sistemas que adotam a utilização deste princípio possuem sua manutenção facilitada, dado a baixa dependência entre os diversos módulos de código e focalização de cada módulo de código. Sendo assim, durante a fase de testes deste projeto de software, ao encontrar um defeito, os desenvolvedores terão fortes indícios de qual módulo de software deverá ser trabalhado para consertar tal defeito. Além disso, esse módulos podem ser reutilizados, apresentando baixas chances de encadeamento de erros, causado por essa decisão, sendo que o código é organizado em módulos robustos e bem definidos. 

Para aplicar este princípio, é indicado que seja pensado no todo de uma aplicação, respondendo a seguinte pergunta: "Dentro do time de desenvolvimento, quem seria responsável por este módulo de código?". Caso a resposta desta pergunta resulte em mais de um grupo de pessoas, há fortes indícios que este módulo de código apresenta mais de uma responsabilidade, e deve ser refatorado para respeitar o SRP. Embora a aplicação deste princípio possa parecer simples, ela requer alto entendimento do contexto da aplicação e experiência em programação. Por exemplo, um programador pouco experiente, ou que está a pouco tempo em contato com um projeto, pode não visualizar completamente o escopo de uma aplicação. Isso pode levar a identificação de apenas uma única responsabilidade, onde na verdade para alguém experiente que já conhece a muito tempo o produto, tenha na verdade múltiplas responsabilidades. Essa quebra do SRP gerará classes com múltiplas responsabilidades com alto acoplamento e baixa coesão, dificultando a manutenção do sistema como um todo.

# Open-Closed Principle [O]

# Liskov Substitution Principle [L]

# Interface Segregation Principle [I]

# Dependency Inversion Principle [D]

O que é o principio SOLID? 
Quem criou e para o que ele foi criado?
Sua importancia atualmente?
Introduzir que será explicado cada uma das letras do acrônimo SOLID.

https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530
https://www.eduardopires.net.br/2013/04/orientacao-a-objeto-solid/
https://www.treinaweb.com.br/blog/introducao-aos-principios-solid
Robert Martin, Micah Martin, Princípios, Padrões e Práticas Ágeis em C#,  Bookman Editora, 2009
