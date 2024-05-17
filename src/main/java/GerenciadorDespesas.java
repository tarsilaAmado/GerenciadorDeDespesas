package main.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GerenciadorDespesas {
    private ArrayList<Transacao> transacoes;
    private final String arquivo = "transacoes.dat";

    public GerenciadorDespesas() {
        this.transacoes = new ArrayList<>();
        carregarTransacoes();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
        salvarTransacoes();
    }

    public void removerTransacao(Transacao transacao) {
        transacoes.remove(transacao);
        salvarTransacoes();
    }

    public ArrayList<Transacao> listarTransacoes() {
        return transacoes;
    }

    public double calcularTotalDespesas() {
        double total = 0;
        for (Transacao transacao : transacoes) {
            if (transacao instanceof Despesa) {
                total += transacao.getValor();
            }
        }
        return total;
    }

    public double calcularTotalReceitas() {
        double total = 0;
        for (Transacao transacao : transacoes) {
            if (transacao instanceof Receita) {
                total += transacao.getValor();
            }
        }
        return total;
    }

    private void salvarTransacoes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(transacoes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carregarTransacoes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            transacoes = (ArrayList<Transacao>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            transacoes = new ArrayList<>();
        }
    }
}
