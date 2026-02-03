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
        fw.write(cost.delivery.toString());
        fw.write(":");
        fw.write(cost.business.toString());
        fw.write(":");
        fw.write(cost.repair.toString());
        fw.write("\n");
        fw.close();
    }
}
