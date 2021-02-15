Feature: cliente
  Scenario: cliente faz lista todos os clientes cadastrados  GET /clientes
    When o cliente chama /clientes
    Then o cliente recebe um codigo de status de 200
    And O cliente recebe uma lista de clientes