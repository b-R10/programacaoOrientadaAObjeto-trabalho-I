package exercicioUm;
public class Liquidificador {
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
            return "Liquidificador ligado";
        } else {
            return "Liquidificador desligado";
        }
    }
}