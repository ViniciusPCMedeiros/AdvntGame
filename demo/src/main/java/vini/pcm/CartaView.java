package vini.pcm;

import javafx.scene.image.ImageView;

public class CartaView extends ImageView {
    private Carta carta;

    public CartaView(Carta carta, Image imagem) {
        super(imagem);
        this.carta = carta;

        // Configurar interações com a carta, como cliques e arrastar e soltar
        setOnMouseClicked(event -> {
            // Lógica para quando a carta for clicada
            // Exemplo: exibir detalhes da carta, ativar efeitos, etc.
            carta.ativarEfeitos();
        });

        // Configurar outros eventos e lógica de interação com a carta
    }

    // Métodos e lógica adicionais da CartaView
}