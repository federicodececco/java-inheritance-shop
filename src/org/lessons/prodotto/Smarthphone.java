package org.lessons.prodotto;

import java.math.BigDecimal;

public class Smarthphone extends Prodotto {
    private long imeiCode;
    private short rom;

    public Smarthphone(String nome, String marca, BigDecimal prezzo, int iva, long imeiCode, short rom) {
        this.imeiCode=imeiCode;
        this.rom=rom;
        super(nome,marca,prezzo,iva);
    }
}
