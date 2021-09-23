#Person API

##Gerenciamento de pessoas em API REST - Desafio de projeto da Digital Innovation One

###Features 
- cadastro de pessoa
- remoção de usuário
- atualização de cadastro
- consulta (de todos os usuários ou de apenas determinado id)

A aplicação foi desenvolvida com Spring Boot, tendo Deploy na nuvem (Heroku).
Link Heroku: https://apipeopledio.herokuapp.com/

###Mais detalhes
Seguem algumas anotações sobre os pacotes que fiz ao longo do projeto. Como sou iniciante, foi muito bom para organizar as ideias.

####Pacotes:
1 - controller
    Classe PersonController - é aqui que dizemos o que fazer para o http. Nesse caso, é onde passamos os métodos HTTP para criar, remover, atualizar...
    Usamos a anotação @Controller.

2 - dto
    DTO - Data Transfer Object. Usado aqui para validar as informações do banco de dados. É um padrão de projetos. Parte View do MVC.
    Não é recomendado validar informações na classe da entidade. Pos isso criamos classes DTO.
    Temos os pacotes:
    2.1 - request
        Classes PersonDTO e PhoneDTO, que validam atributos de Person e Phone.
    2.2 - response
        Classe MessageResponseDTO - usada para deixar uma resposta mais "elegante" para o usuário.

3 - entity
    Entidades do banco de dados 
    Classes Person e Phone

4 - enums
    Classe separada - helper
    Enum PhoneType

5 - exception
    Classe separada - helper
    Classe PersonNotFoundException
6 - mapper
    Interface PersonMapper, usada para converter Person em PersonDTO, e viceversa. Usamos o Mapstruct para facilitar isso

7 - repository
    Interface PersonRepository. Extende de JpaRepository e é muito usada nos métodos da classe PersonService.

8 - service
    Classe PersonService. É a classe que fica com toda a implementação do Controller, que apenas chama os métodos. O "trabalho" - regras de negócio" -  fica todo para a classe PersonService.
    Utilizamos, para isso, a anotação @Service.