 <h1>📱 iPhone UML Model - Em desenvolvimento</h1>

    <p>
        Este projeto em Java foi desenvolvido para conclusão de módulo do Bootcamp da DIO e representa a modelagem UML de um iPhone, implementando funcionalidades de um <strong>Navegador de Internet</strong>, <strong>Reprodutor Musical</strong> e <strong>Aparelho Telefônico</strong>.
    </p>

    <h2>🚀 Funcionalidades</h2>
    <ul>
        <li><strong>Navegador de Internet:</strong> Abrir páginas, atualizar, navegar para URLs específicas, voltar e avançar.</li>
        <li><strong>Reprodutor Musical:</strong> Reproduzir, pausar, parar músicas e controlar faixas.</li>
        <li><strong>Aparelho Telefônico:</strong> Fazer chamadas, atender, encerrar e recusar chamadas.</li>
    </ul>

    <h2>📂 Estrutura do Projeto</h2>
    <pre>
    ├── src
    │   └── main
    │       └── java
    │           └── com
    │               └── dio
    │                   └── iPhone
    │                       ├── AparelhoTelefonico.java
    │                       ├── iPhone.java
    │                       ├── Main.java
    │                       ├── NavegadorInternet.java
    │                       └── ReprodutorMusical.java
    └── pom.xml
    </pre>

    <h2>🔧 Configuração e Execução</h2>

    <h3>Pré-requisitos</h3>
    <ul>
        <li>Java 8 ou superior</li>
        <li>Maven</li>
    </ul>

    <h3>Passos para Configuração</h3>
    <ol>
        <li>Clone o repositório: <code>git clone https://github.com/vmendesdev/bootcamp-dio.git</code></li>
        <li>Navegue até o diretório do projeto: <code>cd iPhoneUMLModel</code></li>
        <li>Compile o projeto: <code>mvn compile</code></li>
    </ol>

    <h3>Executando o Projeto</h3>
    <p>Para executar o projeto, use o seguinte comando:</p>
    <pre><code>mvn exec:java -Dexec.mainClass="com.dio.iPhone.Main"</code></pre>

    <h2>🖥️ Diagrama UML</h2>
    <p>O projeto inclui um diagrama UML que representa a arquitetura das classes.</p>
    <img src="https://github.com/vmendesdev/bootcamp-dio/blob/task-1/out/iPhone/diagrama/diagrama.png" alt="Diagrama UML do iPhone">

    <h2>📄 Licença</h2>
    <p>Este projeto está licenciado sob a <a href="https://opensource.org/licenses/MIT">Licença MIT</a>.</p>
