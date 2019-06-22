Feature: Um desconto só deve ser aplicado se o preço for maior que R$ 50.00
    Scenario: Verificar se o valor é maior que 50.00
        When the price is above than 50.00
        Then apply the discount