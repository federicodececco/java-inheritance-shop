
package org.lessons.prodotto;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {

        Smarthphone incredibile = new Smarthphone("cellualre", "telefono", new BigDecimal(30.00), 10, (long) 123123,
                (short) 10);
        System.out.println(incredibile.getCodice());

        Televisore bello = new Televisore("tele", "certo", new BigDecimal(299), (short) 10, false, 31.2);
        System.out.println(bello.getCodice());
        Cuffie magiche = new Cuffie("stupende", "marcona", new BigDecimal(120), (short) 22, true, "biancops");
        System.out.println(magiche.getCodice());
    }
}
