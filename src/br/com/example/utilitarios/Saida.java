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

    // CURSOR 
    
    public static void subirLinha() {
        System.out.print("\u001B[A");
    }
    
    public static void subirLinha(int n) {
        System.out.print("\u001B[%dA".formatted(n));
    }

    public static void descerLinha() {
        System.out.print("\u001B[B");
    }

    public static void descerLinha(int n) {
        System.out.print("\u001B[%dB".formatted(n));
    }

    public static void inicioLinhaSuperior() {
        System.out.print("\u001B[1F");
    }

    public static void inicioLinhaSuperior(int n) {
        System.out.print("\u001B[%dF".formatted(n));
    }

    public static void inicioLinhaInferior() {
        System.out.print("\u001B[1E");
    }

    public static void inicioLinhaInferior(int n) {
        System.out.print("\u001B[%dE".formatted(n));
    }

    // LIMPEZA

    public static void limparTerminal() {
        System.out.print("\u001B[2J\u001B[3J\u001B[H");
    }

    public static void limparLinha() {
        System.out.print("\u001B[2K");
    }

    public static void limparDireitaLinha() {
        System.out.print("\u001B[0K");
    }

    public static void limparEsquerdaLinha() {
        System.out.print("\u001B[1K");
    }
}
