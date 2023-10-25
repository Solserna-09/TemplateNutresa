Feature: : Me Encunetro en la pagina de caja menor

  @CajaMenor

  Scenario Outline: Quiero ingresar a la web
    Given Ingreso a la web '<url>'
    When  Me este registrando
      | valor   | motivo   |
      | <valor> | <motivo> |
    Then   Quiero validar que este dentro
    Examples:
      | url                                           | valor | motivo |
##@externaldata@parametros/DatosCajaMenor.xlsx@Anticipo
   |https://cajamenorqa.gruponutresa.com/advances    |50000   |PruebaAutomatizada|
   |https://cajamenorqa.gruponutresa.com/advances    |430043   |PruebaAutomatizada|
