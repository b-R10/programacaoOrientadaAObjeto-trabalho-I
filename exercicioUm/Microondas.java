package exercicioUm;
public class Microondas {
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
            return "Microondas ligado";
        } else {
            return "Microondas desligado";
        }
    }
}