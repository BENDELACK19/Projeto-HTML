package RPG;

class Mago extends Personagem {
    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void atacar(Personagem inimigo) {
        int dano = this.ataque;
        System.out.println("\n" + this.nome + " lançou um feitiço em " + inimigo.nome + " e causou " + dano + " de dano!");
        inimigo.receberDano(dano);
    }

    public void mostraInfo() {
        System.out.println("Mago: " + this.nome + " | Vida: " + this.vida + " | Ataque: " + this.ataque + " | Defesa: " + this.defesa);
    }
}
