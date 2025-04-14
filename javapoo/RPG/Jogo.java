package RPG;

import java.util.Scanner;
import java.util.Random;

public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Personagem jogador = null;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Escolha eu personagem");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        int escolha = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();

        switch (escolha) {
            case 1:
                jogador = new Guerreiro(nome, 250, 90, 50);
                break;
            case 2:
                jogador = new Mago(nome, 200, 120, 30);
                break;
            case 3:
                jogador = new Arqueiro(nome, 220, 100, 40);
                break;
            default:
                System.out.println("Opção inválida. Você será um Guerreiro por padrão.");
                jogador = new Guerreiro(nome, 250, 90, 50);
        }

        Personagem inimigo = new Monstro("Azazel", 300, 100, 30);

        System.out.println("\n--- BATALHA INICIADA ---");
        jogador.mostraInfo();
        inimigo.mostraInfo();

        while (jogador.vida > 0 && inimigo.vida > 0) {
            System.out.println("\nSua vez! Escolha uma ação: ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Ver status");
            System.out.println("3 - Curar");
            int acao = scanner.nextInt();

            if (acao == 1) {
                jogador.atacar(inimigo);
            } else if (acao == 2){
                jogador.mostraInfo();
                inimigo.mostraInfo();
                continue;
            } else if (acao == 3) {
                jogador.curar();
            } else {
                System.out.println("Ação invalida! Você perdeu a vez.");
            }

            if (inimigo.vida > 0) {
                System.out.println("\nTurno do inimigo...");
                inimigo.atacar(jogador);
            }
        }

        System.out.println("\n--- FIM DE JOGO ---");
        if (jogador.vida > 0) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você foi derrotado... :(");
        }

        scanner.close();

    }
}
