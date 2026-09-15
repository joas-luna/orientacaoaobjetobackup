package br.com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.example.servicos.ClinicaServico;


final class Menus {

    private Menus() {}

    public static final HashMap<String, String> MENUS = new HashMap<>(
        Map.of(
        "main", """
                === CLÍNICA VIDAPLENA ===
                1 - Pacientes
                2 - Profissionais
                3 - Consultas
                4 - Atendimentos
                5 - Pagamentos
                6 - Relatórios
                0 - Sair
                
                Escolher: """,
        "pacientes", """
                --- PACIENTES ---
                1 - Cadastrar
                2 - Complementar cadastro
                3 - Buscar por CPF
                4 - Listar todos
                5 - Desativar
                0 - Voltar
                
                Escolher: """,
        "profissionais", """
                --- PROFISSIONAIS ---
                1 - Cadastrar
                2 - Atualizar cadastro
                3 - Listar todos
                4 - Filtrar por especialidade
                0 - Voltar
                
                Escolher: """,
        "consultas", """
                --- CONSULTAS ---
                1 - Agendar (escolher profissional)
                2 - Agendar (busca por especialidade)
                3 - Cancelar
                4 - Remarcar
                5 - Listar todas
                6 - Buscar por CPF
                0 - Voltar
                
                Escolher: """,
        "atendimentos", """
                --- ATENDIMENTOS ---
                1 - Registrar
                2 - Listar todos
                3 - Buscar por CPF
                0 - Voltar
                
                Escolher: """,
        "pagamentos", """
                --- PAGAMENTOS ---
                1 - Registrar pagamento
                2 - Listar todos
                3 - Buscar por CPF
                0 - Voltar
                
                Escolher: """,
        "relatorios", """
                --- RELATÓRIOS ---
                1 - Gerar relatório de pacientes
                2 - Gerar relatório de profissionais
                3 - Gerar relatório de consultas
                4 - Gerar relatório de atendimentos
                5 - Gerar relatório de pagamentos
                0 - Voltar
                
                Escolher: """
        )
    );
}

public class Main {

    public static final HashMap<String, String> MENUS = Menus.MENUS;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for(int op = -1; op != 0;) {
            System.out.print(MENUS.get("main"));
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1: menuPacientes(); break;
                case 2: menuProfissionais(); break;
                case 3: menuConsultas(); break;
                case 4: menuAtendimentos(); break;
                case 5: menuPagamentos(); break;
                case 6: menuRelatorios(); break;
                case 0: break;
                default: System.out.println("Opcao invalida!"); break;
            }
        }

        sc.close();
        System.out.println("Sistema encerrado.");
    }

    public static void menuPacientes() {
        for(int op = -1; op != 0;) {
            System.out.print(MENUS.get("pacientes"));
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1: ClinicaServico.cadastrarPaciente(); break;
                case 2: ClinicaServico.complementarPaciente(); break;
                case 3: ClinicaServico.buscarPaciente(); break;
                case 4: ClinicaServico.listarPacientes(); break;
                case 5: ClinicaServico.desativarPaciente(); break;
                case 0: break;
                default: System.out.println("Opcao invalida!"); break;
            }
        }
    }

    public static void menuProfissionais() {
        for(int op = -1; op != 0;) {
            System.out.print(MENUS.get("profissionais"));
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1: ClinicaServico.cadastrarProfissional(); break;
                case 2: ClinicaServico.atualizarProfissional(); break;
                case 3: ClinicaServico.listarProfissionais(); break;
                case 4: ClinicaServico.filtrarProfissionais(); break;
                case 0: break;
                default: System.out.println("Opcao invalida!"); break;
            }
        }
    }
    
    public static void menuConsultas() {
        for(int op = -1; op != 0;) {
            System.out.print(MENUS.get("consultas"));
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1: ClinicaServico.agendarComProfissional(); break;
                case 2: ClinicaServico.agendarPorEspecialidade(); break;
                case 3: ClinicaServico.cancelarConsulta(); break;
                case 4: ClinicaServico.remarcarConsulta(); break;
                case 5: ClinicaServico.listarConsultas(); break;
                case 6: ClinicaServico.buscarConsultasPorPaciente(); break;
                case 0: break;
                default: System.out.println("Opcao invalida!"); break;
            }
        }
    }

    public static void menuAtendimentos() {
        for(int op = -1; op != 0;) {
            System.out.print(MENUS.get("atendimentos"));
            op = Integer.parseInt(sc.nextLine());

            if (op == 1) ClinicaServico.registrarAtendimento();
        }
    }

    public static void menuPagamentos() {
        for(int op = -1; op != 0;) {
            System.out.print(MENUS.get("pagamentos"));
            op = Integer.parseInt(sc.nextLine());

            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1: ClinicaServico.pagamentoDireto(); break;
                case 2: ClinicaServico.pagamentoAutomatico(); break;
                case 3: ClinicaServico.listarPagamentos(); break;
                case 0: break;
                default: System.out.println("Opcao invalida!"); break;
            }
        }
    }

    public static void menuRelatorios() {
        for(int op = -1; op != 0;) {
            System.out.print(MENUS.get("relatorios"));
            op = Integer.parseInt(sc.nextLine());

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
                case 0: break;
                default: System.out.println("Opcao invalida!"); break;
            }
        }
    }
}
 