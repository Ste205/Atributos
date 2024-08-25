public class Moto {
    
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean ligado;

    public Moto(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
        this.ligado = false;
    }


    
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("A moto está ligada.");
        } else {
            System.out.println("A moto já está ligada.");
        }
    }

    
    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidadeAtual = 0.0;
            System.out.println("A moto está desligada.");
        } else {
            System.out.println("A moto já está desligada.");
        }
    }

    
    public void acelerar(double aumento) {
        if (ligado) {
            velocidadeAtual += aumento;
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("A moto está desligada. Ligue a moto antes de acelerar.");
        }
    }


    public void frear(double reducao) {
        if (ligado) {
            velocidadeAtual -= reducao;
            if (velocidadeAtual < 0) velocidadeAtual = 0;
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("A moto está desligada. Ligue a moto antes de frear.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }


    public static void main(String[] args) {
        Moto minhaMoto = new Moto("Yamaha", "MT-07", 2024);
        minhaMoto.mostrarInformacoes();
        minhaMoto.ligar();
        minhaMoto.acelerar(50);
        minhaMoto.frear(20);
        minhaMoto.desligar();
    }
}
