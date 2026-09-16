package br.com.example.utilitarios;

import java.util.HashMap;
import java.util.Map;


public class Menus {

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
