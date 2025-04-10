package org.lessons.prodotto;

import java.math.*;
import java.util.Random;

public class Prodotto {
    Random r = new Random();

    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected int iva;

    public Prodotto(String nome, String marca, BigDecimal prezzo, int iva) {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = Math.abs(r.nextInt());
    }

    public Prodotto() {

    }

    // getters
    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public int getIva() {
        return this.iva;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

}
