package vini.pcm.Efeitos;

public interface Efct {
    void ativarEfeito();
    void aplicarEfeito();
    void desfazerEfeito();
    boolean podeAtivar();
}
