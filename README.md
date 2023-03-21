# PoC para Clean Architecture

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/josivaldobatista/pesquisa-game/blob/main/LICENSE)
## Clean Architecture

Nesse projeto foi apenas abordado os aspectos relacionados a Clean Architecture, outros temas como segurança, validações e outros não foi implementado.

![Arquitetura](https://github.com/josivaldobatista/clean_architecture_PoC/blob/main/img/CleanArchitecture.jpg) 
## Fluxo do projeto
![Arquitetura](https://github.com/josivaldobatista/clean_architecture_PoC/blob/main/img/Screenshot-from-2020-05-20-23-29-10.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Gradle
- MongoDB
- Kafka
- Spring Cloud OpenFeign
- e outros

# Como executar o projeto
Rodar o docker compose e rodar o projeto

## Back end
- Pré-requisitos: Java 17
- Docker

Após baixar o projeto com o comando ```git clone https://github.com/josivaldobatista/hexagonal_architecture_PoC.git``` vá até a pasta raiz do projeto e rode o comando no terminal ```docker compose up``` com isso irá subir as imagens do docker. Depois disso, ainda na pasta raiz rode o comando ```./gradlew bootRun``` para executar a aplicação.

Foi usado o Wiremock para simular a Api de consulta de endereço e para a validação de CPF publicamos uma mensagem para testar o consumer.
Mensagem enviada logo abaixo. Obs: Adeque a suas necessidades.
```bash
{
	"id": "63fa9aca37d8832eec61ed24",
	"name": "Fulano de Tal",
	"zipCode": "38400000",
	"cpf": "98765432100",
	"validCpf": true
}
```

Comandos:
```bash
docker compose up
```
```bash
./gradlew bootRun
```

Deixei algumas collections na pasta CI que foram feitas no Insomnia pode baixar clicando aqui https://insomnia.rest/download 
