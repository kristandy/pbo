package minggu5;

import java.util.logging.*;

public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static final int MAX_MENU_ITEMS = 10;
    private static int id = 0;

    Logger logger
            = Logger.getLogger(
                Restaurant.class.getName());

    public Restaurant() {
        namaMakanan = new String[MAX_MENU_ITEMS];
        hargaMakanan = new double[MAX_MENU_ITEMS];
        stok = new int[MAX_MENU_ITEMS];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (id < MAX_MENU_ITEMS) {
            namaMakanan[id] = nama;
            hargaMakanan[id] = harga;
            this.stok[id] = stok;
            id++;
        } else {
            logger.info("Menu penuh, tidak bisa menambahkan lagi.");
        }
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                logger.info(String.format("%s[%d]\tRp. %.2f", namaMakanan[i], stok[i], hargaMakanan[i]));
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public static void nextId() {
        id++;
    }
}