package exercicioUm;

public class Cozinha {
    Geladeira geladeira = new Geladeira();
    Liquidificador liquidificador = new Liquidificador();
    Microondas microondas = new Microondas();
    
    public void ligarTudo(){
        geladeira.ligar();
        microondas.ligar();
        liquidificador.ligar();
    }
    public void desligarTudo(){
        geladeira.desligar();
        liquidificador.desligar();
        microondas.desligar();
    }

    public class Main {
        public static void main(String[] args) {
            Geladeira geladeira = new Geladeira();
            Liquidificador liquidificador = new Liquidificador();
            Microondas microondas = new Microondas();
            
            geladeira.ligar();
            System.out.println("geladeira está ligado? " + geladeira.isLigado());
            geladeira.desligar();
            System.out.println("geladeira está ligado? " + geladeira.isLigado());

            microondas.ligar();
            System.out.println("microondas está ligado? " + microondas.isLigado());
            microondas.desligar();
            System.out.println("microondas está ligado? " + microondas.isLigado());

            liquidificador.ligar();
            System.out.println("liquidificador está ligado? " + liquidificador.isLigado());
            liquidificador.desligar();
            System.out.println("liquidificador está ligado? " + liquidificador.isLigado());
        }
    }
}