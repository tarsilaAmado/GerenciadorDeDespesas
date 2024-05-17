package main.java;

public class Receita extends Transacao {
    public Receita(String descricao, double valor, String data) {
        super(descricao, valor, data);
    }

    @Override
    public String toString() {
        return "Receita{" +
                "descricao='" + getDescricao() + '\'' +
                ", valor=" + getValor() +
                ", data='" + getData() + '\'' +
                '}';
    }
}
