# Relatório Contabilidade

Projeto acadêmico de Contabilidade Gerencial com duas entregas no mesmo repositório:

- um dashboard financeiro web em `index.html`;
- a implementação original dos cálculos em Java na pasta `src/`.

🔗 **Site publicado:** https://faresmahmud.github.io/relatorio-contabilidade/

## Sobre o projeto

O projeto apresenta demonstrações financeiras de uma empresa de tecnologia nos exercícios de 2024 e 2025, com cálculo de indicadores contábeis e comparação entre os dois anos.

## Indicadores calculados

- Ativo total
- Passivo total
- Situação líquida
- Receita líquida
- Margem de contribuição
- Despesas operacionais
- EBITDA
- Índices financeiros no dashboard, como liquidez geral, endividamento, margem EBITDA e ROA

## Estrutura

```text
relatorio-contabilidade/
├── index.html
├── src/
│   ├── Main.java
│   └── Relatorios.java
├── .gitignore
└── README.md
```

## Tecnologias

- Java
- HTML5
- CSS3
- JavaScript
- Chart.js
- GitHub Pages

## Como executar o projeto Java

Requisito:

- Java JDK instalado

Compile:

```bash
javac -encoding UTF-8 -d out/production/Prova_Contabilidade src/Main.java src/Relatorios.java
```

Execute:

```bash
java -cp out/production/Prova_Contabilidade Main
```

## Como abrir o dashboard

Abra o arquivo `index.html` no navegador ou acesse a versão publicada pelo GitHub Pages:

```text
https://faresmahmud.github.io/relatorio-contabilidade/
```

## Resumo dos resultados

| Indicador | 2024 | 2025 |
|---|---:|---:|
| Ativo total | R$ 231.000,00 | R$ 268.300,00 |
| Passivo total | R$ 70.500,00 | R$ 91.700,00 |
| Situação líquida | R$ 160.500,00 | R$ 176.600,00 |
| Receita líquida | R$ 130.000,00 | R$ 165.000,00 |
| Margem de contribuição | R$ 48.000,00 | R$ 57.000,00 |
| EBITDA | -R$ 22.800,00 | -R$ 33.500,00 |

## Observações

- A pasta `out/` contém arquivos gerados pela compilação e não é versionada.
- Arquivos locais de IDE, como `.idea/` e `*.iml`, também ficam fora do Git.

## Autor

Fares Mahmud
