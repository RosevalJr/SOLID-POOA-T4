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


# Single Responsability Principle [S]
> O que é ? (Definição)
> Para atingir ele é preciso fazer o que?
> A sua aplicação resulta no que?

> "Uma classe deve ter apenas um motivo para mudar" [4]

O SRP diz que todo módulo de código deve possuir apenas uma responsabilidade. Isso implica que dado a sua unica responsabilidade ele também terá apenas um eixo de mudança. Sendo que todo módulo de programa de um projeto que aplica o SRP, todo o projeto terá alta coesão e baixo acoplamento, dado que as funcionalidade do programa estarão altamente focalizadas em cada módulo com sua unica responsabilidade para a execução do todo. Sendo assim, caso um defeito seja encontrado no projeto, muito provavelmente os desenvolvedores saberão aonde olhar para concertar tal defeito. Portanto, os sistema que adotam a utilização deste princípio possuem sua manutenção facilitada dado a baixa dependencia entre os diversos módulos de código e focalização de responsabilide de cada módulo de código. Além disos, caso esses módulos precisem ser reutilizados, há a baixa chance de encademento de erros causado por essa decisão, sendo que o código é organizado em módulo robustos e bem definidos. 

Entretanto, a aplicação deste princípio pode parecer simples, entretanto ela requer alto entendimento do contexto da aplicação e programação. Por exemplo, um programador pouco experiente ou que está a pouco tempo em contato com um projeto, pode não ter ainda a visão completa de um projeto, e pode enxergar uma unica responsabilidade, onde na verdade para alguem experiente que já conhece a muito tempo o produto, tenha na verdade multiplas responsabilidades, gerando assim classes com multiplas responsabilidades com alto acoplamento e baixa coesão, dificultanto a manutenção dos sistemas que foi aplicado.
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
