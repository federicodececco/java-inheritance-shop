
package org.lessons.prodotto;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {

        Smarthphone telefono = new Smarthphone("cellualre", "telefono", new BigDecimal(30.00), 10, (long) 123123,
                (short) 10);
        System.out.println(telefono.getCodice());
    }
}
