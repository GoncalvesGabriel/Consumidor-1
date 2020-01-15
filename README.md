# Consumidor-1
Consumidor de dados do arquivo do bolsa família. 
Essa aplicação é responsável por receber os registros de um topic que recebe informações de um producer responsável por parsear o arquivo. 
Essa aplicação consolida os valores de cada estado presente no arquivo do bolsa familia e imprime no console os resultados parciais a cada registro lido no seguinte layout:

*[UF] + [somar da parcela] + [qtd de beneficiários]*
