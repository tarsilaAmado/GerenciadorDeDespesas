package main.java;

public class Despesa extends Transacao {
    public Despesa(String descricao, double valor, String data) {
        super(descricao, valor, data);
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "descricao='" + getDescricao() + '\'' +
                ", valor=" + getValor() +
                ", data='" + getData() + '\'' +
                '}';
    }
}
