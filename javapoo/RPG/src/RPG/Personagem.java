package RPG;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int vidaMaxima;
    protected int ataque;
    protected int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public void curar() {
        int cura = 30;
        this.vida += cura;
        if (this.vida > this.vidaMaxima) {
            this.vida = this.vidaMaxima;
        }
        System.out.println("\n" + this.nome + " se curou e agora tem " + this.vida + " de vida!");
    }

    public abstract void atacar(Personagem inimigo);


    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }

        System.out.println("\n" + this.nome + " agora tem " + this.vida + " de vida.");
    }

    public abstract void mostraInfo();
}
