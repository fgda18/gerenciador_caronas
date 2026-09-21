# Gerenciador de Compartilhamento de Caronas
Base Java orientada ao diagrama solicitado.

Arquitetura: MVC + DAO.
Patterns: Builder, Command e Factory Method.
Automação: ao aceitar uma solicitação, a Carona reduz uma vaga; ao chegar a zero, fica LOTADA. Ao cancelar uma solicitação aceita, a vaga é liberada.

Os DAOs deste exemplo começam em memória para facilitar o estudo. O próximo passo é implementar os DAOs com JDBC/MySQL e conectar os Controllers às páginas HTML/CSS/JavaScript.
