package exercicioDois;

public class Computador {
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
        if(ligado){
            return "O computador está ligado";
        } else {
            return "O computador está desligado";
        }
    }
}