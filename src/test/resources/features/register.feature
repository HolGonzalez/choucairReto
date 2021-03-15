# Autor: Holman Gonzalez
  @stories
  Feature: Reto Tecnico
    @scenario1
    Scenario: Registrar usuario en la plataforma http://demo.automationtesting.in/Register.html
      Given registrar usuario correctamente en la plataforma
      | strName | strLastName | address   | email              | phone       | country                   | password      |
      | Holman  | Gonzalez    | Calle 15  | usuario@gmail.com  | 1234567890  | United States of America  | 1234567Pass   |