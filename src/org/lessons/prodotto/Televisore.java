package org.lessons.prodotto;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    private boolean smart;
    private double dimensions;

    public Televisore(String nome, String marca, BigDecimal prezzo, int iva, boolean smart, double dimensions) {
        super(nome, marca, prezzo, iva);
        this.dimensions = dimensions;
        this.smart = smart;
    }

    // getters
    public boolean getSmart() {
        return this.smart;
    }

    public double getDimensions() {
        return this.dimensions;
    }

    // settergs
    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        String toFormat = "%s %s %s$ %d smart:%b %s";
        return String.format(toFormat, nome, marca, prezzo.toString(), iva, smart, String.valueOf(dimensions));

    }
}
