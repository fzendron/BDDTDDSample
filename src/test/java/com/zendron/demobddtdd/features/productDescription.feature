Feature: Um produto só pode ser salvo se tiver um nome maior que 3 caracteres
    Scenario: Dado que o usuário tenha digitado exatamente 3 caracteres no nome
        When the users try to save a product with only 3 characters
        Then we have to show an error message