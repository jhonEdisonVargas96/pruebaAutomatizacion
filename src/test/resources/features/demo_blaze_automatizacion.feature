# Created by Jhon Osorio at 21/05/2024
  # language: es
  # encoding: UTF-8
Característica: Automatización flujo página demoblaze

  Escenario: Realizar un registro e inicio de sesión
    Dado que me conecto a la pagina "https://www.demoblaze.com/index.html"
    Cuando me registro con "jhonedison" y "1234"
    Y me logueo con los datos
    Entonces puedo ver el mensaje "Welcome jhonedison"