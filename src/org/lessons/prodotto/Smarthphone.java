package org.lessons.prodotto;

import java.math.BigDecimal;

public class Smarthphone extends Prodotto {
    private long imeiCode;
    private short rom;

    public Smarthphone(String nome, String marca, BigDecimal prezzo, int iva, long imeiCode, short rom) {
        this.imeiCode = imeiCode;
        this.rom = rom;
        super(nome, marca, prezzo, iva);
    }
    // getter

    public long getImeiCode() {
        return this.imeiCode;
    }

    public short getRom() {
        return this.rom;
    }

    // setter
    public void setImeiCode(long imeiCode) {
        this.imeiCode = imeiCode;
    }

    public void setRom(short rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        String toFormat = "%s %s %s$ %d %d %d";
        String test = String.format(toFormat, nome, marca, prezzo.toString(), iva, imeiCode, rom);
        return test;
    }
}
