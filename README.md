# Consumidor-1

### Objetivo
- Consumidor de dados do arquivo do bolsa família. 
Essa aplicação é responsável por receber os registros de um topic que recebe informações de um producer responsável por parsear o arquivo. 
Essa aplicação consolida os valores de cada estado presente no arquivo do bolsa familia e imprime no console os resultados parciais a cada registro lido no seguinte layout:

   *[UF] + [somar da parcela] + [qtd de beneficiários]*

### Como executar

- Para executar o sistema recomendamos utilizar o docker e o arquivo docker-compose.yml presente no projeto, nesse arquivo além de ter o start dassa aplicação, também inícia o produtor e outros dois consumidores.
Nesse arquivo é necessário editar as variaveis de path da pasta de localização do arquivo atravez da variavel FILE_PATH e FILE_NAME com o nome do arquivo para o kafka-producer.

- Para os consumidores devem ser editados as seguintes variáveis: 
  KAFKA_HOST: Host onde está disponível o serviço do kafka, incluindo a porta. Por default o arquivo está configurado para acessar a imagem que também será instânciada pelo arquivo docker-compose.yml
  KAFKA_GROUP_ID: group id para acessar o topic do kafka. Deve ser diferente em cada um dos consumers para que todos recebam todas as mensagens.
  TOPIC_BOLSA: Nome do topic de onde serão consumidas as mensagens. Por default vem com o nome BOLSA_FAMILIA. Deve seguir o mesmo nome que está definido na variavel KAFKA_CREATE_TOPICS da definição da container do kafka.

### Executar na IDE

Alterar o arquivo application.properties substituindo as mesmas variáveis que estão definidas no docker-compose.yml que foram mencionadas acima. 
