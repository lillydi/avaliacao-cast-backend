# avaliacao-cast-backend
Parte back-end do sistema Cast Cursos. 

Até o momento foram implementadas a listagem e gravação de cursos.

É necessário criar o arquivo application.properties passando as configurações do banco de dados a ser utilizado. Nesse projeto foi utilizado o PostgreSQL. Segue abaixo um exemplo do que deve conter neste arquivo:

spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://[ENDERECO_BANCO]/[NOME_BANCO]
spring.datasource.username=[USUARIO]
spring.datasource.password=[SENHA]
spring.jpa.show-sql=true

O script de criação das tabelas encontra-se na pasta sql.
