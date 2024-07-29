```markdown
# Calculadora Spring Boot com Chat GPT

## 📒 Descrição
Para a realização deste projeto utilizei a IA do Chat GPT para a geração do código fonte do projeto, sendo uma classe Calculadora com as operações aritméticas para adicionar, subtrair, multiplicar e dividir, com seu respectivo teste de unidade e também um Controller Rest (CalculadoraController) com um método GET que recebe os dois números e a operação a ser realizada, trazendo como retorno o resultado da operação realizada pela Calculadora.

OBS: Projeto criado para fins didáticos, não levando em conta as boas práticas de desenvolvimento, organização de projeto, etc.

## 🤖 Tecnologias Utilizadas
Chat GPT, Eclipse IDE, Chrome.

## 🧐 Processo de Criação
Criei um roteiro seguindo promps solicitados ao Chat GPT na seguinte ordem:
Criação de um arquivo pom.xml adicionando como dependência o framework Spring Boot e também a dependência do JUnit.

## 🚀 Resultados
O teste do projeto foi executado com sucesso, porém teve alguns momentos que devido ao prompt não ter sido criado da melhor forma, com o contexto bem explicado ou informando mais detalhadamente qual dependencia deveria ser utilizada, o Chat GPT gerou código que necessitaram alguns ajustes pontuais, como:
Adicionar a informação do parent com a versão do Spring Boot e também utilizar dependencias antigas do JUnit, sendo necessário solicitar posteriormente para alterar para a dependencia de teste do próprio Spring Boot.
Ao gerar o Controller o Chat GPT reescreveu a lógica da Calculadora no Controller ao invés de utilizar a classe existente, sendo necessário enviar novo prompt para utilizá-la.

OBS: Além de gerar o código, o Chat GPT já gerou também os comandos para serem executados para utilizar a Calculadora utilizando o Controller criado.

"Aqui estão alguns exemplos de URLs para testar:
Adicionar: http://localhost:8080/calcular?primeiroNumero=10&segundoNumero=5&operacao=adicionar
Subtrair: http://localhost:8080/calcular?primeiroNumero=10&segundoNumero=5&operacao=subtrair
Multiplicar: http://localhost:8080/calcular?primeiroNumero=10&segundoNumero=5&operacao=multiplicar
Dividir: http://localhost:8080/calcular?primeiroNumero=10&segundoNumero=5&operacao=dividir
Divisão por zero: http://localhost:8080/calcular?primeiroNumero=10&segundoNumero=0&operacao=dividir
Operação inválida: http://localhost:8080/calcular?primeiroNumero=10&segundoNumero=5&operacao=invalidar"

## 💭 Reflexão 
O Chat GPT se mostra uma ferramenta poderosa também para a criação de código, otimizando o tempo de desenvolvimento, porém para tanto, é necessário que a pessoa tenha um conhecimento mínimo sobre desenvolvimento, frameworks e também os termos técnicos para conseguir gerar prompts assertivos e corrigir eventuais bugs ou informações geradas de forma errônea pelo Chat GPT.
```

### Prompts Utilizados
1) Olá, sou um desenvolvedor Java e estou criando um projeto, você poderia me gerar um arquivo pom.xml contendo dependencias do framework Spring Boot, incluindo a ferramenta de testes JUnit e também adicionando como dependencia o spring web para posteriormente utilizar para a criação de um controler.
2) Pretendo criar uma classe Java para realizar as operações matemáticas de adicionar, subtrair, multiplicar e dividir, você poderia gerar uma classe contendo métodos estáticos que recebam dois parâmetros, sendo um método para cada uma destas funções.
3) Pretendo realizar os testes com JUnit, você poderia gerar também a classe de testes de unidade para a classe Calculadora?
4) Poderia passar qual é a dependencia para usar o spring-boot-starter-test ao invés de direto as dependencias do Junit?
5) Agora gostaria de criar um Controller, CalculadoraController, utilizando RestController do Spring Boot e um método Get que receba dois números via URL, como queryparam, primeiroNumero e segundoNumero por exemplo e também qual a operação que deve ser executada, adicionar, subtrair, multiplicar ou dividir.
6) Você poderia reescrever a classe acima, utilizando a classe Calculadora que criamos para efetuar as operações?
