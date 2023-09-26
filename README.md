# Trabalho Prático 01

*Valor: 20 pontos*

*Trabalho em dupla*

## Sistema de Bilheteria

O objetivo deste trabalho prático é criar um sistema de gerenciamento de bilheteria em Java, que será integrado a um sistema de bilheteria de cinema ou teatro. O sistema de gerenciamento de bilheteria deve incorporar os conceitos de classes e métodos, arrays, herança e polimorfismo, classe Object, classes abstratas, e interfaces.


### Funcionalidades

O sistema deverá implementar as seguintes funcionalidades:

1. **Cadastro de Eventos:** Permitir a criação de eventos, como filmes, espetáculos de teatro, concertos, etc. Registrar informações sobre o nome do evento, data, horário, preço do ingresso, e outros detalhes relevantes.
3. **Venda de Ingressos:** Permitir a venda de ingressos para um evento específico. Verificar a disponibilidade de ingressos e calcular o valor total da venda.
4. **Gerenciamento de Receita:** Calcular a receita total gerada pela venda de ingressos para cada evento. 
5. **Exibição de Eventos:** Listar os eventos criados, incluindo nome, data, horário e receita total gerada. Listar a quantidade de ingressos vendidos e disponíveis para cada evento. Exibir a receita total acumulada de todos os eventos
6. **Exibição de Ingressos:** Para um evento específico, realizar o levantamento dos ingressos 
vendidos, exibindo a data de venda, o tipo do ingresso, e seu valor. Exibir a receita total gerada pela venda de ingressos para o evento.


### Observações

- O sistema deverá suportar três tipos de ingresso: normal, meia entrada, e VIP. O valor do ingresso VIP é o dobro do valor do ingresso normal. O valor do ingresso de meia entrada é 50% do valor do ingresso normal.
- O sistema deverá suportar três tipos de evento: filme, teatro e concerto. O filme tem capacidade de 200 ingressos, o teatro 250, e o concerto 150.
- Um evento é composto por, pelo menos, nome, data e hora, e preço do ingresso.
- Um ingresso é composto por, pelo menos, data de venda, tipo de ingresso e valor.


### Requisitos Técnicos

- Utilize herança e polimorfismo para simplificar o código e reutilizar funcionalidades comuns.
- Sobrecarregue os métodos da classe Object para fornecer representações adequadas em formato de `string` dos objetos criados.
- Utilize classes abstratas e interfaces para melhor estruturar a relação entre as classes do sistema.
- Crie uma classe principal que demonstre o funcionamento do sistema, incluindo a criação de eventos, venda de ingressos, exibição de informações e impressão de detalhes.
- Utilize os diálogos (`JOptionPane`) como interface de comunicação com o usuário.


## Avaliação

O trabalho deverá ser apresentado para o professor no dia 09/10/2023, em uma entrevista com duração de 15 minutos. 
É imprescindível a presença da dupla no dia da apresentação.