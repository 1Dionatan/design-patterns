package designpattern;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Configurando Relatorio 1:");
        
        RelatorioConfig relatorio1  = new RelatorioConfig.Builder("Vendas 2024", "Admin")
            .subtitulo("Resumo de Vendas por Regiâo")
            .incluirCabecalho(true)
            .incluirRodape(false)
            .orientacao("PAISAGEM")
            .build();

        System.out.println(relatorio1);

        System.out.println("\nConfigurando Relatorio 2");

        RelatorioConfig relatorio2 = new RelatorioConfig.Builder("Estoque", "guest")
            .subtitulo("Itens por Categoria")
            .build();

            System.out.println(relatorio2); 

    }
}

//O QUE FIZEMOS 
//Removemos a confusão dos construtores múltiplos
//Centralizamos a lógica de construção no Builder
//Permitimos configurar apenas o que for necessário
//Tornamos o código legível e fácil de manter
