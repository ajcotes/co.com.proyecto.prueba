#Autor: Usuario Base
# languaje:es
@HU01
Feature: Royal Film
  yo como usuario
  Quiero adicionar productos a mi carrito de compra luego de registrarme y loguearme
  para realizar compras
  @scenario_registrarse
  Scenario: registro de usuario
    Given dado que el usuario ingresa a domeblaze
    When ingresa los datos del usuario a crear
    Then obtengo respuesta de mi usuario creado
  @scenario_login
  Scenario: inicio de sesion de usuario
    Given dado que el usuario ingresa a domeblaze
    When ingresa los datos del usuario a loguearse
    Then obtengo respuesta de mi usuario logueado