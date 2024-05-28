package exercicioUm;

public class Geladeira {
    private boolean ligado;
    
    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){
        return ligado;
    }

    public String observar(){
        if (ligado) {
            return "Geladeira ligado";
        } else {
            return "Geladeira desligado";
        }
    }
}