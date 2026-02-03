/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva: Vámosi László Ádám, 2026-02-03, II-N
 */

public class Cost {
    Double delivery;
    Double business;
    Double repair;

    public Cost(String delivery, String business, String repair) {
        this.delivery = Double.parseDouble(delivery);
        this.business = Double.parseDouble(business);
        this.repair = Double.parseDouble(repair);
    }
}
