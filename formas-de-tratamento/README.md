# Tarefa de Formas de Tratamento Curso
Crie uma interface chamada FormatadorNome que possui o método String formatarNome(String nome, String sobrenome).

Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma instância de FormatadorNome. Essa classe deve possuir um método getTratamento() que delega a formatação do nome para a instância de FormatadorNome.

Crie a seguintes implementações da interface FormatadorNome:

- Informal: retorna somente o primeiro nome

- Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome

- ComTítulo: deve receber em seu construtor o título e retornar o título seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"

Crie testes de unidade que fazem os testes da classe Autoridade com cada uma das implementações da interface. 

----
![image](https://user-images.githubusercontent.com/96631076/216528007-7ea3f1d4-8206-40e7-bbf9-92bfbe2e0ac5.png)
