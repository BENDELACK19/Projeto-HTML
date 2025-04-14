package RPG;

class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println("\n" + this.nome + " avança com fúria contra " + inimigo.nome + "!");

        boolean golpeDuplo = Math.random() < 0.5; // 50% de chance

        int danoBase = this.ataque - inimigo.defesa;
        if (danoBase < 0) danoBase = 0;

        // Primeiro golpe
        System.out.println("\n" + this.nome + " desferiu um golpe e causou " + danoBase + " de dano!");
        inimigo.receberDano(danoBase);

        if (golpeDuplo) {
            System.out.println("\n" + this.nome + " fez um GOLPE DUPLO!");
            System.out.println("\n" + this.nome + " desferiu outro golpe e causou " + danoBase + " de dano!");
            inimigo.receberDano(danoBase);
        }
    }

    public void mostraInfo() {
        System.out.println("Guerreiro: " + this.nome + "| Vida: " + this.vida + " | Ataque: " + this.ataque + " | Defesa: " + this.defesa);
    }
}