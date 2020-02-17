package br.edu.infnet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("[1] Registrar as notas de um novo aluno.");
        System.out.println("[2] Consultar boletim de um aluno.");
        System.out.println("[3] Consultar notas da turma.");
        System.out.println("[4] Sair.");

        var scanner = new Scanner(System.in);
        var answer = Integer.parseInt(scanner.nextLine());

        if (answer == 4) System.exit(0);

        if (answer == 1) {
            System.out.println("Digite o nome do estudante:");
            var studentName = String.valueOf(new Scanner(System.in));

            System.out.println("Digite a nota da AV1:");
            var studentAV1 = Integer.parseInt(String.valueOf(new Scanner(System.in)));

            System.out.println("Digite a nota da AV2:");
            var studentAV2 = Integer.parseInt(String.valueOf(new Scanner(System.in)));
        }
    }
}
