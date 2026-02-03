/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva: Vámosi László Ádám, 2026-02-03, II-N
 */

import java.io.FileWriter;
import java.io.IOException;

public class Filehandler {
    public void writeCostToFile(Cost cost) {
        try {
            tryWriteCostToFile(cost);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void tryWriteCostToFile(Cost cost) throws IOException {
        FileWriter fw = new FileWriter("adat.txt", true);
        fw.write(genRow(cost));
        fw.close();
    }

    private String genRow(Cost cost) {
        StringBuilder sb = new StringBuilder();
        sb.append(cost.delivery.toString());
        sb.append(":");
        sb.append(cost.business.toString());
        sb.append(":");
        sb.append(cost.repair.toString());
        sb.append("\n");
        return sb.toString();
    }
}
