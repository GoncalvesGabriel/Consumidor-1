package br.com.fiap.consumidorone.services;

import java.math.BigDecimal;

public class SomaBolsaFamilia {

  private BigDecimal somaParcelas = BigDecimal.ZERO;

  private Long totalBenificiarios = 0L;

  public BigDecimal getSomaParcelas() {
    return somaParcelas;
  }

  public Long getTotalBenificiarios() {
    return totalBenificiarios;
  }

  public void somaValorParcela(BigDecimal valor) {
    this.somaParcelas = this.somaParcelas.add(valor);
    this.totalBenificiarios += 1;
  }
}
