package br.com.fiap.consumidorone.domain;

import java.math.BigDecimal;

public class BolsaFamiliaModel {

  private String mesReferencia;

  private String mesCompetencia;

  private String estado;

  private String codigoMunicipio;

  private String municipio;

  private String nisFavoricido;

  private String favorecido;

  private BigDecimal valorParcela;

  public String getMesReferencia() {
    return mesReferencia;
  }

  public void setMesReferencia(String mesReferencia) {
    this.mesReferencia = mesReferencia;
  }

  public String getMesCompetencia() {
    return mesCompetencia;
  }

  public void setMesCompetencia(String mesCompetencia) {
    this.mesCompetencia = mesCompetencia;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCodigoMunicipio() {
    return codigoMunicipio;
  }

  public void setCodigoMunicipio(String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
  }

  public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public String getNisFavoricido() {
    return nisFavoricido;
  }

  public void setNisFavoricido(String nisFavoricido) {
    this.nisFavoricido = nisFavoricido;
  }

  public String getFavorecido() {
    return favorecido;
  }

  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  public BigDecimal getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }
}
