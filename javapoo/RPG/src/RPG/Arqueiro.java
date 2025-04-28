package RPG;

class Arqueiro extends Personagem {
    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = Math.random() < 0.3;
        int dano = this.ataque - inimigo.defesa;
        if (dano < 0) dano = 0;
        if (critico) {
            dano *= 2;
            System.out.println("\n" + this.nome + " acertou um CRÍTICO em " + inimigo.nome + " e causou " + dano + " de dano!");
        } else {
            System.out.println("\n" + this.nome + " atirou uma flecha em " + inimigo.nome + " e causou " + dano + " de dano!");
        }
        inimigo.receberDano(dano);
    }


    public void mostraInfo() {
        System.out.println("Arqueiro: " + this.nome + " | Vida: " + this.vida + " | Ataque: " + this.ataque + " | Defesa: " + this.defesa);
    }
}

