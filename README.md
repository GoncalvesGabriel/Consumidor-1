# Consumidor-1

### Objetivo
- Consumidor de dados do arquivo do bolsa família. 
Essa aplicação é responsável por receber os registros de um topic que recebe informações de um producer responsável por parsear o arquivo. 
Essa aplicação consolida os valores de cada estado presente no arquivo do bolsa familia e imprime no console os resultados parciais a cada registro lido no seguinte layout:

*[UF] + [somar da parcela] + [qtd de beneficiários]*

### Como executar

- Para executar o sistema recomendamos utilizar o docker e o arquivo docker-compose.yml presente no projeto, nesse arquivo além de ter o start dassa aplicação, também inícia o produtor e outros dois consumidores.
Nesse arquivo é necessário editar as variaveis de path da pasta de localização do arquivo atravez da variavel FILE_PATH
