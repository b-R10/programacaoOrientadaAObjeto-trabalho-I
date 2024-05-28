package exercicioDois;

public class Monitor {
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
            return "O Monitor está ligado";
        } else {
            return "O Monitor está desligado";
        }
    }
}
