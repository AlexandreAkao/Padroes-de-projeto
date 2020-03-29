package builder;

import builder.types.Bebida;
import builder.types.Brinquedo;
import builder.types.ItemSecundario;

public class RefeicaoCrianca {

    private ItemPrincipal itemPrincipal;
    private ItemSecundario itemSecundario;
    private Bebida bebida;
    private Brinquedo brinquedo;

    static class Builder {
        private ItemPrincipal itemPrincipal = new ItemPrincipal.Builder().build();
        private ItemSecundario itemSecundario = ItemSecundario.NONE;
        private Bebida bebida = Bebida.NONE;
        private Brinquedo brinquedo = Brinquedo.NONE;

        public Builder setItemPrincipal(ItemPrincipal itemPrincipal) {
            this.itemPrincipal = itemPrincipal;

            return this;
        }

        public Builder setItemSecundario(ItemSecundario itemSecundario) {
            this.itemSecundario = itemSecundario;

            return this;
        }

        public Builder setBebida(Bebida bebida) {
            this.bebida = bebida;

            return this;
        }

        public Builder setBrinquedo(Brinquedo brinquedo) {
            this.brinquedo = brinquedo;

            return this;
        }

        public RefeicaoCrianca build() {
            return new RefeicaoCrianca(this);
        }
    }

    private RefeicaoCrianca(Builder builder) {
        this.itemPrincipal = builder.itemPrincipal;
        this.itemSecundario = builder.itemSecundario;
        this.bebida = builder.bebida;
        this.brinquedo = builder.brinquedo;
    }

    @Override
    public String toString() {
        return "RefeicaoCrianca {" +
                "\n    itemPrincipal = " + itemPrincipal +
                "\n    itemSecundario = " + itemSecundario +
                "\n    bebida = " + bebida +
                "\n    brinquedo = " + brinquedo +
                "\n}";
    }
}
