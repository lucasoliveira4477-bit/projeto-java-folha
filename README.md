# Sistema de Folha de Pagamento em Java

Projeto desenvolvido para a disciplina de Programação orientada a Objetos, aplicando conceitos de POO em Java (herança, polimorfismo e sobrescrita de métodos).

## 🛠️ Estrutura do Projeto
O sistema é composto pelas seguintes classes:
- **`Colaborador.java`**: Classe base abstrata/geral com os atributos comuns.
- **`ColaboradorPadrao.java`**: Subclasse para colaboradores com salário base fixo.
- **`ColaboradorComissionado.java`**: Subclasse que calcula salário com base em vendas e comissão.
- **`ColaboradorProducao.java`**: Subclasse que calcula bônus por peças produzidas.
- **`Principal.java`**: Classe de execução com o menu interativo via console (`Scanner` e `ArrayList`).

## 🚀 Como Executar
1. Certifique-se de ter o **JDK (Java Development Kit)** instalado.
2. Compile todos os arquivos `.java` no mesmo diretório:
   ```bash
   javac *.java
