/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva: Vámosi László Ádám, 2026-02-03, II-N
 */

import java.util.Scanner;

public class MainConsole {
    String delivery = "";
    String business = "";
    String repair = "";
    Scanner sc = new Scanner(System.in);

    public MainConsole() {
        printHeader();
        startInput();
        startWriting();
    }
    private void startWriting() {
        Cost cost = new Cost(delivery, business, repair);
        Filehandler filehandler = new Filehandler();
        filehandler.writeCostToFile(cost);
    }
    private void startInput() {
        delivery = input("Szállítási költség");
        business = input("Üzleti költség");
        repair = input("Javítási költség");
    }
    private String input(String message) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(message + ": ");
        return sc.nextLine();
    }
    private void printHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
}
