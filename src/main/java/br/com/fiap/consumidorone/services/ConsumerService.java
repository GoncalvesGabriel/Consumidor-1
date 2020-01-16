package br.com.fiap.consumidorone.services;

import br.com.fiap.consumidorone.domain.BolsaFamiliaModel;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

  Map<String, SomaBolsaFamilia> valueMapByUF = new HashMap();

  public void consume(BolsaFamiliaModel model) {
    String uf = model.getUf();
    String value = model.getValorParcela();
    BigDecimal valor = new BigDecimal(value.replace(',', '.'));
    if(!valueMapByUF.containsKey(uf)) {
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
