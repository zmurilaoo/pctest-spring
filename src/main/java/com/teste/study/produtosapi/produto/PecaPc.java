package com.teste.study.produtosapi.produto;

public class PecaPc {
    private String placaMae;
    private String processador;
    private Integer penteMemoria;
    private Integer coller;
    private String fonte;
    private String placaVideo;

    public PecaPc() {

    }

    public PecaPc(String placaMae, Integer penteMemoria, Integer coller, String fonte, String placaVideo) {
        this.placaMae = placaMae;
        this.penteMemoria = penteMemoria;
        this.coller = coller;
        this.fonte = fonte;
        this.placaVideo = placaVideo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public Integer getPenteMemoria() {
        return penteMemoria;
    }

    public void setPenteMemoria(Integer penteMemoria) {
        this.penteMemoria = penteMemoria;
    }

    public Integer getColler() {
        return coller;
    }

    public void setColler(Integer coller) {
        this.coller = coller;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    @Override
    public String toString() {
        return  "Placa Mãe: " + getPlacaMae() + ", Processador: " + getProcessador() + ", Pente de Memória: " + getPenteMemoria() + ", Coller: " + getColler() +
                ", Fonte: " + getFonte() + ", Placa de Vídeo: " + getPlacaVideo();
    }
}
