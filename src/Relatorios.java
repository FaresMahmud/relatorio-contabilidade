public class Relatorios {

    // ATIVO 2024
    private final double caixa2024 = 32000.00;
    private final double aplicacoes2024 = 15000.00;
    private final double clientes2024 = 48000.00;
    private final double estoqueComp2024 = 55000.00;
    private final double estoqueSoft2024 = 12000.00;
    private final double computadores2024 = 40000.00;
    private final double marcas2024 = 25000.00;
    private final double moveis2024 = 4000.00;

    // ATIVO 2025
    private final double caixa2025 = 18500.00;
    private final double aplicacoes2025 = 28000.00;
    private final double clientes2025 = 74000.00;
    private final double estoqueComp2025 = 42300.00;
    private final double estoqueSoft2025 = 18000.00;
    private final double computadores2025 = 55000.00;
    private final double marcas2025 = 25000.00;
    private final double moveis2025 = 7500.00;

    // PASSIVO 2024
    private final double fornecedores2024 = 18000.00;
    private final double emprestimos2024 = 12000.00;
    private final double salarios2024 = 14500.00;
    private final double impostos2024 = 6000.00;
    private final double financiamentos2024 = 20000.00;

    // PASSIVO 2025
    private final double fornecedores2025 = 22500.00;
    private final double emprestimos2025 = 31000.00;
    private final double salarios2025 = 17200.00;
    private final double impostos2025 = 11000.00;
    private final double financiamentos2025 = 10000.00;

    // RECEITAS
    private final double receita2024 = 145000.00;
    private final double receita2025 = 192000.00;

    // IMPOSTOS SOBRE RECEITA
    private final double simples2024 = 15000.00;
    private final double simples2025 = 27000.00;

    // CMV
    private final double cmv2024 = 82000.00;
    private final double cmv2025 = 108000.00;

    // DESPESAS OPERACIONAIS 2024
    private final double despesasAdm2024 = 37500.00;
    private final double energia2024 = 6200.00;
    private final double marketing2024 = 4800.00;
    private final double aluguel2024 = 12000.00;
    private final double terceiros2024 = 8500.00;
    private final double manutencao2024 = 1800.00;

    // DESPESAS OPERACIONAIS 2025
    private final double despesasAdm2025 = 46100.00;
    private final double energia2025 = 8400.00;
    private final double marketing2025 = 7100.00;
    private final double aluguel2025 = 12000.00;
    private final double terceiros2025 = 14300.00;
    private final double manutencao2025 = 2600.00;

    // MÉTODOS 2024
    public double calcularAtivoTotal2024() {
        return caixa2024 +
                aplicacoes2024 +
                clientes2024 +
                estoqueComp2024 +
                estoqueSoft2024 +
                computadores2024 +
                marcas2024 +
                moveis2024;
    }

    public double calcularPassivoTotal2024() {
        return fornecedores2024 +
                emprestimos2024 +
                salarios2024 +
                impostos2024 +
                financiamentos2024;
    }

    public double calcularSituacaoLiquida2024() {
        return calcularAtivoTotal2024() -
                calcularPassivoTotal2024();
    }

    public double calcularReceitaLiquida2024() {
        return receita2024 - simples2024;
    }

    public double calcularMargemContribuicao2024() {
        return calcularReceitaLiquida2024() -
                cmv2024;
    }

    public double calcularDespesasOperacionais2024() {
        return despesasAdm2024 +
                energia2024 +
                marketing2024 +
                aluguel2024 +
                terceiros2024 +
                manutencao2024;
    }

    public double calcularEBITDA2024() {
        return calcularReceitaLiquida2024() -
                cmv2024 -
                calcularDespesasOperacionais2024();
    }

    // MÉTODOS 2025
    public double calcularAtivoTotal2025() {
        return caixa2025 +
                aplicacoes2025 +
                clientes2025 +
                estoqueComp2025 +
                estoqueSoft2025 +
                computadores2025 +
                marcas2025 +
                moveis2025;
    }

    public double calcularPassivoTotal2025() {
        return fornecedores2025 +
                emprestimos2025 +
                salarios2025 +
                impostos2025 +
                financiamentos2025;
    }

    public double calcularSituacaoLiquida2025() {
        return calcularAtivoTotal2025() -
                calcularPassivoTotal2025();
    }

    public double calcularReceitaLiquida2025() {
        return receita2025 - simples2025;
    }

    public double calcularMargemContribuicao2025() {
        return calcularReceitaLiquida2025() -
                cmv2025;
    }

    public double calcularDespesasOperacionais2025() {
        return despesasAdm2025 +
                energia2025 +
                marketing2025 +
                aluguel2025 +
                terceiros2025 +
                manutencao2025;
    }

    public double calcularEBITDA2025() {
        return calcularReceitaLiquida2025() -
                cmv2025 -
                calcularDespesasOperacionais2025();
    }
}
