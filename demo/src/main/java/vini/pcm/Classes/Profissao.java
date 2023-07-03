package vini.pcm;

import java.util.HashMap;
import java.util.Map;

public class Profissao {
    private int vida;
    private Map<Mecanic, Integer> quantidadeCartas;

    public Profissao(int vida, Map<Mecanic, Integer> quantidadeCartas) {
        this.vida = vida;
        this.quantidadeCartas = quantidadeCartas;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getQuantidadeCartas(Mecanic mecanic) {
        return quantidadeCartas.getOrDefault(mecanic, 0);
    }

    public void setQuantidadeCartas(Mecanic mecanic, int quantidade) {
        quantidadeCartas.put(mecanic, quantidade);
    }

    public Map<Mecanic, Integer> getQuantidadeCartas() {
        return quantidadeCartas;
    }

    public void setQuantidadeCartas(Map<Mecanic, Integer> quantidadeCartas) {
        this.quantidadeCartas = quantidadeCartas;
    }
