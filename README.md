# Consulta de CEP - API ViaCEP

Projeto Java que consome a API [ViaCEP](https://viacep.com.br/) para consultar informações de endereços a partir de um CEP (Código de Endereçamento Postal).

## 📋 Descrição

Este é um projeto simples desenvolvido em Java que demonstra como consumir uma API externa utilizando `HttpClient` e deserializar JSON com Jackson. O projeto permite consultar informações completas de um endereço brasileiro fornecendo apenas o CEP.

## 🚀 Funcionalidades

- Consulta de endereços através do CEP utilizando a API ViaCEP
- Deserialização automática de JSON para objetos Java
- Tratamento de erros e exceções
- Suporte a todos os campos retornados pela API ViaCEP

## 🛠️ Tecnologias Utilizadas

- **Java 23** - Linguagem de programação
- **Maven** - Gerenciamento de dependências e build
- **Jackson Databind 3.2.3** - Biblioteca para processamento de JSON
- **HttpClient** - Cliente HTTP nativo do Java para requisições HTTP

## 📦 Estrutura do Projeto

```
api/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── application/
│                   ├── Main.java                    # Classe principal
│                   ├── dto/
│                   │   └── EnderecoDto.java          # DTO para mapeamento do JSON
│                   └── service/
│                       └── ApiServico.java          # Serviço de consulta à API
├── pom.xml                                          # Configuração do Maven
└── README.md                                        # Documentação
```

## 🔧 Pré-requisitos

- Java 23 ou superior instalado
- Maven 3.6+ instalado
- Conexão com a internet (para acessar a API ViaCEP)

## 📥 Instalação

1. Clone este repositório:
```bash
git clone <url-do-repositorio>
cd api
```

2. Compile o projeto com Maven:
```bash
mvn clean compile
```

## ▶️ Como Executar

### Executar via Maven

```bash
mvn exec:java -Dexec.mainClass="org.application.Main"
```

### Executar via IDE

Importe o projeto em sua IDE favorita (IntelliJ IDEA, Eclipse, VS Code) e execute a classe `Main.java`.

### Personalizar o CEP

Para consultar um CEP diferente, edite o arquivo `src/main/java/org/application/Main.java` e altere o CEP na linha 14:

```java
EnderecoDto enderecoDto = apiServico.getEndereco("SEU_CEP_AQUI");
```

## 📄 Exemplo de Uso

Ao executar o projeto com o CEP `38740596`, o retorno será:

```
EnderecoDto{
  cep='38740-596',
  logradouro='Rua João Rodrigues de Melo',
  complemento='',
  bairro='Conjunto Habitacional Frei Chico',
  localidade='Patos de Minas',
  uf='MG',
  ibge='3148005',
  gia='',
  ddd='34',
  siafi='0687'
}
```

## 🔍 Campos Retornados

A API ViaCEP retorna os seguintes campos:

- **cep**: Código de Endereçamento Postal
- **logradouro**: Nome da rua/avenida
- **complemento**: Informações adicionais do endereço
- **bairro**: Bairro
- **localidade**: Cidade
- **uf**: Unidade Federativa (estado)
- **ibge**: Código IBGE do município
- **gia**: Código GIA (apenas para São Paulo)
- **ddd**: Código DDD da região
- **siafi**: Código SIAFI

## 🌐 API ViaCEP

Este projeto utiliza a API pública [ViaCEP](https://viacep.com.br/), que é gratuita e não requer autenticação.

**Endpoint utilizado:**
```
GET https://viacep.com.br/ws/{cep}/json/
```

Mais informações: [Documentação ViaCEP](https://viacep.com.br/)

## 📝 Detalhes Técnicos

### HttpClient

O projeto utiliza o `HttpClient` introduzido no Java 11, que oferece uma API moderna e eficiente para fazer requisições HTTP síncronas e assíncronas.

### Jackson

A biblioteca Jackson é utilizada para deserializar o JSON retornado pela API diretamente em objetos Java através do `ObjectMapper`.

### DTO Pattern

O padrão DTO (Data Transfer Object) é utilizado para representar os dados do endereço, facilitando o mapeamento e manipulação das informações.

## 🐛 Troubleshooting

### Erro: "CEP não encontrado"

Certifique-se de que o CEP informado é válido e existe na base de dados do ViaCEP.

### Erro de conexão

Verifique sua conexão com a internet e se a API ViaCEP está acessível.

### Erro de compilação

Certifique-se de que possui o Java 23 instalado e configurado corretamente:
```bash
java -version
mvn -version
```
