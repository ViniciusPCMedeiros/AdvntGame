package vini.pcm;

import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import vini.pcm.Efeitos.Eff;

public class Carta {
    private String nome;
    private String tipo;
    private String descricao;
    private String efeito;
    private Image imagem;
    private List<Eff> efeitos;
  

    public Carta(String nome, String tipo, String descricao, String efeito, String imagemPath,List<Eff> efeitos) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.efeito = efeito;
        this.imagem = new Image(imagemPath);
        this.efeitos = efeitos;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEfeito() {
        return efeito;
    }

    public ImageView getImageView() {
        ImageView imageView = new ImageView(imagem);
        imageView.setFitWidth(200); // Ajuste a largura conforme necessário
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + "): " + descricao + "\nEfeito: " + efeito;
    }
}