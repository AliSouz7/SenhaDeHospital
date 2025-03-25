# Gerenciador de Senhas Hospitalares

Este projeto implementa um **sistema de controle de senhas** para hospitais, utilizando Java e a estrutura de dados `Queue` para garantir a ordem de atendimento dos pacientes.

## 📌 Funcionalidades

- **Gerar Senha**: Adiciona um novo paciente à fila.
- **Chamar Próximo**: Remove a senha da fila e a adiciona ao histórico de atendimento.
- **Consultar Histórico**: Lista todas as senhas chamadas até o momento.
- **Resetar Fila**: Limpa a fila e reinicia a contagem de senhas.

## 🛠 Tecnologias Utilizadas

- Java
- Estruturas de dados (`Queue` para fila de senhas)
- Paradigma de Programação Orientada a Objetos (POO)

## 📂 Estrutura do Projeto

gerenciador-senhas-hospital/ 
│── src/ │ 
├── Main.java │ 
├── Senha.java │
├── GerenciadorSenhas.java 
│── README.md 
│── .gitignore


## 🚀 Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/gerenciador-senhas-hospital.git
   cd gerenciador-senhas-hospital
Compile e execute o código Java:
javac src/*.java
java src.Main

📝 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para utilizá-lo e modificá-lo conforme necessário.
