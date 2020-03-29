package builder;

import builder.types.Carne;
import builder.types.Pao;
import builder.types.Queijo;

public class ItemPrincipal {
    private boolean hasSalada;
    private Carne carne;
    private Queijo queijo;
    private Pao pao;
    private boolean hasMolho;

    static class Builder {
        private boolean hasSalada = true;
        private Carne carne = Carne.CARNE;
        private Queijo queijo = Queijo.PRATO;
        private Pao pao = Pao.ARABE;
        private boolean hasMolho = true;

        public Builder setHasSalada(boolean hasSalada) {
            this.hasSalada = hasSalada;
            return this;
        }

        public Builder setCarne(Carne carne) {
            this.carne = carne;
            return this;
        }

        public Builder setQueijo(Queijo queijo) {
            this.queijo = queijo;
            return this;
        }

        public Builder setPao(Pao pao) {
            this.pao = pao;
            return this;
        }

        public Builder setHasMolho(boolean hasMolho) {
            this.hasMolho = hasMolho;
            return this;
        }

        public ItemPrincipal build() {
            return new ItemPrincipal(this);
        }
    }

    private ItemPrincipal(Builder builder) {
        this.hasSalada = builder.hasSalada;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.pao = builder.pao;
        this.hasMolho = builder.hasMolho;
    }

    @Override
    public String toString() {
        return "{" +
                "\n        hasSalada = " + hasSalada +
                "\n        carne = " + carne +
                "\n        queijo = " + queijo +
                "\n        pao = " + pao +
                "\n        hasMolho = " + hasMolho +
                "\n    }";
    }
}
