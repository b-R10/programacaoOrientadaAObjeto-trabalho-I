package exercicioDois;

public class NoBreak {
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
            return "O Nobreak está ligado";
        } else {
            return "O Nobreak está desligado";
        }
    }
}
