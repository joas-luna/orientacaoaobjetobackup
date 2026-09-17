package br.com.example;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

import br.com.example.utilitarios.Menus;
import br.com.example.utilitarios.Saida;
import br.com.example.servicos.ClinicaServico;

public class Main {

    public static final HashMap<String, String> MENUS = Menus.MENUS;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opStr;

        for (int op = -1; op != 0;) {
            System.out.print(Saida.ciano(MENUS.get("main")));

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            switch (op) {
                case 1:
                    menuPacientes();
                    break;
                case 2:
                    menuProfissionais();
                    break;
                case 3:
                    menuConsultas();
                    break;
                case 4:
                    menuAtendimentos();
                    break;
                case 5:
                    menuPagamentos();
                    break;
                case 6:
                    menuRelatorios();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }

        sc.close();
        Saida.limparTerminal();
        System.out.println(Saida.amarelo(
                "\n\n======================================= OPERAÇÃO ENCERRADA =======================================\n"));
    }

    public static void menuPacientes() {
        String opStr;

        for (int op = -1; op != 0;) {
            System.out.print(Saida.ciano(MENUS.get("pacientes")));

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            switch (op) {
                case 1:
                    ClinicaServico.cadastrarPaciente();
                    break;
                case 2:
                    ClinicaServico.complementarPaciente();
                    break;
                case 3:
                    ClinicaServico.buscarPaciente();
                    break;
                case 4:
                    ClinicaServico.listarPacientes();
                    break;
                case 5:
                    ClinicaServico.desativarPaciente();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    public static void menuProfissionais() {
        String opStr;

        for (int op = -1; op != 0;) {
            System.out.print(Saida.ciano(MENUS.get("profissionais")));

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            switch (op) {
                case 1:
                    ClinicaServico.cadastrarProfissional();
                    break;
                case 2:
                    ClinicaServico.atualizarProfissional();
                    break;
                case 3:
                    ClinicaServico.listarProfissionais();
                    break;
                case 4:
                    ClinicaServico.filtrarProfissionais();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    public static void menuConsultas() {
        String opStr;

        for (int op = -1; op != 0;) {
            System.out.print(Saida.ciano(MENUS.get("consultas")));

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            switch (op) {
                case 1:
                    ClinicaServico.agendarComProfissional();
                    break;
                case 2:
                    ClinicaServico.agendarPorEspecialidade();
                    break;
                case 3:
                    ClinicaServico.cancelarConsulta();
                    break;
                case 4:
                    ClinicaServico.remarcarConsulta();
                    break;
                case 5:
                    ClinicaServico.listarConsultas();
                    break;
                case 6:
                    ClinicaServico.buscarConsultasPorPaciente();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    public static void menuAtendimentos() {
        String opStr;

        for (int op = -1; op != 0;) {
            System.out.print(Saida.ciano(MENUS.get("atendimentos")));

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            if (op == 1)
                ClinicaServico.registrarAtendimento();
        }
    }

    public static void menuPagamentos() {
        String opStr;

        for (int op = -1; op != 0;) {
            System.out.print(Saida.ciano(MENUS.get("pagamentos")));

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            switch (op) {
                case 1:
                    ClinicaServico.pagamentoDireto();
                    break;
                case 2:
                    ClinicaServico.pagamentoAutomatico();
                    break;
                case 3:
                    ClinicaServico.listarPagamentos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    public static void menuRelatorios() {
        String opStr;

        for (int op = -1; op != 0;) {
            System.out.print(Saida.ciano(MENUS.get("relatorios")));

            try {
                opStr = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            
            if (opStr.isEmpty()) {
                
            }

            opStr = opStr.replaceAll("\\s", "");

            switch (op) {
                case 1:
                    ClinicaServico.gerarRelatorio(true);
                    break;
                case 2:
                    System.out.print("Nome do profissional: ");
                    String nome = sc.nextLine();
                    ClinicaServico.gerarRelatorio(nome);
                    break;
                case 3:
                    System.out.print("Data inicio (DD/MM/AAAA): ");
                    String ini = sc.nextLine();
                    System.out.print("Data fim (DD/MM/AAAA): ");
                    String fim = sc.nextLine();
                    ClinicaServico.gerarRelatorio(ini, fim);
                    break;
                case 4:
                    ClinicaServico.gerarRelatorio(false);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}
