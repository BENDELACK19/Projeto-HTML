package RPG;

public class Monstro extends Personagem {
    public Monstro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = this.ataque - inimigo.defesa;
        if (dano < 0) dano = 0;

        System.out.println("\n" + this.nome + " atacou " + inimigo.nome + " e causou " + dano + " de dano!");
        inimigo.receberDano(dano);

        if (Math.random() < 0.2) {
            System.out.println("\n" + inimigo.nome + " foi envenenado e perdeu mais 10 de vida!");
            inimigo.receberDano(10);
        }
    }

    @Override
    public void mostraInfo() {
        System.out.println("Monstro: " + nome + " | Vida: " + vida + " | Ataque: " + ataque + " | Defesa: " + defesa);
    }
}

