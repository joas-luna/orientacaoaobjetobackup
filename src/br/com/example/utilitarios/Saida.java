package br.com.example.utilitarios;

public final class Saida {

    private Saida() {}

    // CORES

    public static String vermelho(String str) {
        return "\u001B[1;31m%s\u001B[m".formatted(str);
    }

    public static String verde(String str) {
        return "\u001B[1;32m%s\u001B[m".formatted(str);
    }

    public static String amarelo(String str) {
        return "\u001B[1;33m%s\u001B[m".formatted(str);
    }

    public static String lilas(String str) {
        return "\u001B[1;34m%s\u001B[m".formatted(str);
    }

    public static String rosa(String str) {
        return "\u001B[1;35m%s\u001B[m".formatted(str);
    }

    public static String ciano(String str) {
        return "\u001B[1;36m%s\u001B[m".formatted(str);
    }

    // CURSOR E LIMPEZA

    public static void limparTerminal() {
        System.out.print("\001B[2J\001B[3J\001B[H");
    }
}
