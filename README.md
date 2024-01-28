# README

Este é um projeto Spring Boot com um banco de dados H2 em memória, criado para gerenciar informações sobre veículos e estabelecimentos. Ele oferece operações básicas, como criação, listagem e manipulação desses dados. Ele foi baseado no desafio back end https://github.com/fcamarasantos/backend-test-java

## Endpoints

### Veículos

#### GET `/vehicles`

Retorna todos os veículos cadastrados.

#### POST /vehicle

Cria um novo veículo com os seguintes parâmetros no formato JSON:

```
{
  "marca": "Nome da Marca",
  "modelo": "Nome do Modelo",
  "cor": "Cor do Veículo",
  "placa": "Placa do Veículo",
  "tipoVeiculo": "CARRO" ou "MOTO"
}
```

### Estabelecimentos

#### GET `/establishments`

Retorna todos os estabelecimentos cadastrados.

#### POST /establishment

Cria um novo estabelecimento com os seguintes parâmetros no formato JSON:

```
{
  "nome": "Nome do Estabelecimento",
  "cnpj": "Número do CNPJ",
  "endereco": "Endereço do Estabelecimento",
  "telefone": "Número de Telefone",
  "vagaMoto": "Número de Vagas para Motos",
  "vagaCarro": "Número de Vagas para Carros"
}
```

#### POST /establishment/add-vehicle
Adiciona um veículo para uma vaga de um estabelecimento. Os parâmetros devem ser enviados no formato JSON:

```
{
  "id_establishment": "ID do Estabelecimento",
  "id_vehicle": "ID do Veículo"
}
``` 

#### POST /establishment/remove-vehicle

Remove um veículo de uma vaga em um estabelecimento. Os parâmetros devem ser enviados no formato JSON:

```
{
  "id_establishment": "ID do Estabelecimento",
  "id_vehicle": "ID do Veículo"
}
```
