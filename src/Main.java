import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    private static final NumberFormat MOEDA = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

    public static void main(String[] args) {
        Relatorios relatorio = new Relatorios();

        exibirRelatorio(
                2024,
                relatorio.calcularAtivoTotal2024(),
                relatorio.calcularPassivoTotal2024(),
                relatorio.calcularSituacaoLiquida2024(),
                relatorio.calcularReceitaLiquida2024(),
                relatorio.calcularMargemContribuicao2024(),
                relatorio.calcularEBITDA2024()
        );

        exibirRelatorio(
                2025,
                relatorio.calcularAtivoTotal2025(),
                relatorio.calcularPassivoTotal2025(),
                relatorio.calcularSituacaoLiquida2025(),
                relatorio.calcularReceitaLiquida2025(),
                relatorio.calcularMargemContribuicao2025(),
                relatorio.calcularEBITDA2025()
        );
    }

    private static void exibirRelatorio(
            int ano,
            double ativoTotal,
            double passivoTotal,
            double situacaoLiquida,
            double receitaLiquida,
            double margemContribuicao,
            double ebitda
    ) {
        System.out.println("\n========== RELATÓRIO " + ano + " ==========");
        imprimirLinha("Ativo Total", ativoTotal);
        imprimirLinha("Passivo Total", passivoTotal);
        imprimirLinha("Situação Líquida", situacaoLiquida);
        imprimirLinha("Receita Líquida", receitaLiquida);
        imprimirLinha("Margem de Contribuição", margemContribuicao);
        imprimirLinha("EBITDA", ebitda);
    }

    private static void imprimirLinha(String titulo, double valor) {
        System.out.println(titulo + ": " + MOEDA.format(valor));
    }
}
