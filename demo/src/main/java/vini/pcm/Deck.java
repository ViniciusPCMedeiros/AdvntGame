package vini.pcm;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Carta> cartas;

    public Deck() {
        this.cartas = new ArrayList<>();
    }

    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void removerCarta(Carta carta) {
        cartas.remove(carta);
    }

    // Outros métodos relevantes para o deck

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
}