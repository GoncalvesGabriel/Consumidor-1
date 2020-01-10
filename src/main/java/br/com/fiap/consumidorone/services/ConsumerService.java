package br.com.fiap.consumidorone.services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

  Map<String, SomaBolsaFamilia> valueMapByUF = new HashMap();

  public void consume(String line) throws Exception {
    String newLine = line.replace('"', ' ').replace(',', '.');
    String[] lineParse = newLine.split(";");
    String uf = lineParse[2].trim();
    String value = lineParse[7].trim();
    BigDecimal valor = new BigDecimal(value);
    if(!valueMapByUF.containsKey(uf)){
        valueMapByUF.put(uf, new SomaBolsaFamilia());
    }

    SomaBolsaFamilia somaBolsaFamilia = valueMapByUF.get(uf);
    somaBolsaFamilia.somaValorParcela(valor);

    for (String key : valueMapByUF.keySet()) {
      somaBolsaFamilia = valueMapByUF.get(key);
      System.out.println(key + " " + somaBolsaFamilia.getSomaParcelas() + " " + somaBolsaFamilia.getTotalBenificiarios());
    }

    System.out.println("<<========================================================================================>>");
    System.out.println("");
  }

}
