package org.lessons.prodotto;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String color;
    private boolean wirless;

    public Cuffie(String nome, String marca, BigDecimal prezzo, int iva, boolean wirless, String color) {
        super(nome, marca, prezzo, iva);
        this.color = color;
        this.wirless = wirless;
    }

    // getters
    public String getColor() {
        return this.color;
    }

    public boolean getWirless() {
        return this.wirless;
    }

    // setters
    public void setColor(String color) {
        this.color = color;

    }

    public void setWirless(boolean wirless) {
        this.wirless = wirless;
    }

}
