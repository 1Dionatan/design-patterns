package designpattern;

public class RelatorioConfig {
    
    private final String titulo;
    private final String usuario;
    private final String subtitulo;
    private final boolean incluirCabecalho;
    private final boolean incluirRodape;
    private final String orientacao;

    private RelatorioConfig(Builder builder) {
        this.titulo = builder.titulo;
        this.usuario = builder.usuario;
        this.subtitulo = builder.subtitulo;
        this.incluirCabecalho = builder.incluirCabecalho;
        this.incluirRodape = builder.incluirRodape;
        this.orientacao = builder.orientacao;
    }

    public static class Builder {
        private final String titulo;
        private final String usuario;
        
        private String subtitulo = null;
        private boolean incluirCabecalho = true;
        private boolean incluirRodape = true;
        private String orientacao = "RETRATO";

        public Builder(String titulo, String usuario) {
            this.titulo = titulo;
            this.usuario = usuario;
        }

        public Builder subtitulo(String subtitulo) {
            this.subtitulo = subtitulo;
            return this;
        }

        public Builder incluirCabecalho(boolean incluirCabecalho) {
            this.incluirCabecalho = incluirCabecalho;
            return this;
        }

        public Builder incluirRodape(boolean incluirRodape) {
            this.incluirRodape = incluirRodape;
            return this;
        }

        public Builder orientacao(String orientacao) {
            this.orientacao = orientacao;
            return this;
        }

        public RelatorioConfig build() {
            return new RelatorioConfig(this);
        }

    }

    @Override
    public String toString(){
        return "Relatorio Config["+
                "titulo=" + titulo + '\''+
                ", subtitulo=" + subtitulo + '\''+
                ", incluirCabecalho=" + incluirCabecalho +
                ", incluirRodape=" + incluirRodape +
                ", orientacao=" + orientacao + '\''+
                ", usuario=" + usuario + '\''+
                "]";
    }
}
