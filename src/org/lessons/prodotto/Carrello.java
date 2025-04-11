
package org.lessons.prodotto;

import java.util.Scanner;
import java.math.BigDecimal;

public class Carrello {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("Possiedi la carta fedeltà? (Y/N):");
        boolean fedeltà;
        if (in.nextLine().toLowerCase().equals("y"))
            fedeltà = true;
        else
            fedeltà = false;
        Prodotto[] cart = new Prodotto[1];
        // String entry = in.nextLine().toLowerCase();
        for (int i = 0; i < cart.length; i++) {

            System.out.println("Inserire nome del prodotto:");
            String nome = in.nextLine().toLowerCase();

            System.out.println("Inserire marca del prodotto:");
            String marca = in.nextLine().toLowerCase();

            System.out.println("Inserire prezzo del prodotto:");
            BigDecimal prezzo = BigDecimal.valueOf(Double.valueOf(in.nextLine()));

            System.out.println("Inserire iva del prodotto:");
            int iva = in.nextInt();
            in.nextLine();

            System.out.println("Inserire tipologia di prodotto (smartphone,televisore o cuffie): ");
            String prod = in.nextLine().toLowerCase();

            switch (prod) {
                case "smartphone":
                    System.out.println("Inserire codice IMEI dello smarthphone:");
                    long imeiCode = in.nextLong();
                    in.nextLine();
                    System.out.println("Inserire ROM dello smartphone:");
                    short rom = in.nextShort();
                    in.nextLine();
                    Smarthphone cell = new Smarthphone(nome, marca, prezzo, iva, imeiCode, rom);
                    cart[i] = cell;
                    break;
                case "televisore":
                    System.out.println("Il televisore è smart? (Y/N):");
                    boolean smart;
                    if (in.nextLine().toLowerCase().equals("y"))
                        smart = true;
                    else
                        smart = false;
                    System.out.println("Inserire dimensioni in pollici del prodotto:");
                    double dimensioni = Double.valueOf(in.nextLine());
                    Televisore tele = new Televisore(nome, marca, prezzo, iva, smart, dimensioni);
                    cart[i] = tele;
                    break;

                case "cuffie":
                    System.out.println("Le cuffie sono wirless? (Y/N):");
                    boolean wirless;
                    if (in.nextLine().toLowerCase().equals("y"))
                        wirless = true;
                    else
                        wirless = false;
                    System.out.println("Inserire il colore delle cuffie:");
                    String colore = in.nextLine();
                    Cuffie headphones = new Cuffie(nome, marca, prezzo, iva, wirless, colore);
                    cart[i] = headphones;
                    break;
                default:
                    System.out.println("Tipologia di prodotto non riconosciuta");
            }
        }
        BigDecimal tot = BigDecimal.valueOf(0);
        for (int i = 0; i < cart.length; i++) {
            System.out.println(cart[i].toString());
            if (fedeltà)
                tot.add(cart[i].discountPrice());

            else
                tot.add(cart[i].getPrezzo());
        }
        System.out.printf("prezzo finale: %s", tot.toString());
        in.close();

    }
}
