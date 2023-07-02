package vini.pcm.Efeitos;

public class Eff implements Efct {
    private Target target ;

    public Eff(Target target){
        this.target = target;
    }
    

    @Override
    public void ativarEfeito() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ativarEfeito'");
    }

    @Override
    public void aplicarEfeito() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicarEfeito'");
    }

    @Override
    public void desfazerEfeito() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desfazerEfeito'");
    }

    @Override
    public boolean podeAtivar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'podeAtivar'");
    }


    public Target getTarget() {
        return target;
    }


    public void setTarget(Target target) {
        this.target = target;
    }

}
