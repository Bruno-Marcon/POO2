🏦 Sistema de Liberação de Crédito

Este projeto simula um processo de liberação de crédito em um banco, utilizando o padrão de projeto Chain of Responsibility (Cadeia de Responsabilidade) em Java.

📌 Objetivo

Simular o fluxo de aprovação de crédito de acordo com as seguintes verificações:

Verificação de disponibilidade de crédito;

Verificação se a parcela não ultrapassa 25% da renda mensal;

Verificação de restrições no SPC/SERASA;

Verificação de existência de garantias.

Cada verificação é feita por uma classe específica, encadeada como uma corrente.

🧱 Estrutura dos Arquivos

Cliente.java: classe que armazena os dados do cliente.

Verificacao.java: classe abstrata que define a estrutura da cadeia de verificações.

VerificacaoCredito.java: verifica se o banco tem crédito disponível.

VerificacaoRenda.java: verifica se a parcela não ultrapassa 25% da renda do cliente.

VerificacaoHistorico.java: verifica se o cliente tem restrições no SPC/SERASA.

VerificacaoGarantia.java: verifica se o cliente tem garantias (como bens).

SistemaCreditoBanco.java: classe principal que cria o cliente, monta a cadeia e inicia a verificação.

▶️ Como Executar

Compile os arquivos:

javac *.java

Execute o sistema:

java SistemaCreditoBanco

📥 Explicação da entrada

Abaixo está um exemplo de instância do cliente utilizada no sistema:

Cliente cliente = new Cliente("João", 5000, 12000, false, true);

📊 Tabela de parâmetros

Parâmetro

Valor passado

Significado

nome

"João"

Nome do cliente

rendaMensal

5000

Renda mensal do cliente (em reais)

valorFinanciamento

12000

Valor total do financiamento solicitado

possuiRestricao

false

O cliente não possui restrições no SPC/SERASA

possuiGarantia

true

O cliente possui algum bem que pode ser usado como garantia

Este cliente passará por todas as etapas da cadeia de responsabilidade com sucesso, resultando na aprovação do crédito.

📚 Conceitos Utilizados

Orientação a Objetos (OOP)

Encapsulamento

Herança e Polimorfismo

Padrão de Projeto: Chain of Responsibility