package exercicioDois;


public class Laboratório {
    NoBreak nobreak = new NoBreak();
    Computador computador = new Computador();
    Monitor monitor = new Monitor();
    
    public void ligarTudo(){
        nobreak.ligar();
        computador.ligar();
        monitor.ligar();
    }
    public void desligarTudo(){
        nobreak.desligar();
        computador.desligar();
        monitor.desligar();
    }

    public class Main {
        public static void main(String[] args) {
            NoBreak nobreak = new NoBreak();
            Computador computador = new Computador();
            Monitor monitor = new Monitor();
            
            nobreak.ligar();
            System.out.println("Nobreak está ligado? " + nobreak.isLigado());
            nobreak.desligar();
            System.out.println("Nobreak está ligado? " + nobreak.isLigado());

            monitor.ligar();
            System.out.println("Monitor está ligado? " + monitor.isLigado());
            monitor.desligar();
            System.out.println("Monitor está ligado? " + monitor.isLigado());

            computador.ligar();
            System.out.println("Computador está ligado? " + computador.isLigado());
            computador.desligar();
            System.out.println("Computador está ligado? " + computador.isLigado());
        }
    }
}