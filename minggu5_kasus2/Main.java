package minggu5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produk> daftarMenu = new ArrayList<>();
        ArrayList<Penjualan> daftarPesanan = new ArrayList<>();

        daftarMenu.add(new Produk("Batagor", 5000, 15)); 
        daftarMenu.add(new Produk("Roti Bakar", 20000, 15));
        daftarMenu.add(new Produk("Indomie + Telor", 7000, 20));
        daftarMenu.add(new Produk("Nasi Goreng", 10000, 90));

        boolean selesai = false;
        while (!selesai) {
            System.out.println("Daftar Menu Makanan:");
            for (int i = 0; i < daftarMenu.size(); i++) {
                Produk produk = daftarMenu.get(i);
                System.out.println((i + 1) + ". " + produk.getNamaProduk() + " - Rp " + produk.getHarga()
                        + " (Stok: " + produk.getStok() + ")");
            }

            System.out.print("Pilih nomor menu yang ingin dipesan (0 untuk selesai): ");
            int pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= daftarMenu.size()) {
                Produk produkDipesan = daftarMenu.get(pilihan - 1);

                if (produkDipesan.getStok() > 0) {
                    System.out.print("Masukkan jumlah yang ingin dipesan: ");
                    int jumlah = input.nextInt();

                    if (jumlah <= produkDipesan.getStok()) {
                        produkDipesan.tambahQty(jumlah);
                        int hargaTotalItem = produkDipesan.getHarga() * jumlah;
                        daftarPesanan.add(new Penjualan(produkDipesan.getNamaProduk(), jumlah, hargaTotalItem));

                        produkDipesan.kurangiStok(jumlah);

                        System.out.print("Item telah ditambahkan ke pesanan. Ingin memesan item lain? (ya/tidak): ");
                        String jawaban = input.next();
                        if (!jawaban.equalsIgnoreCase("ya")) {
                            selesai = true;
                        }
                    } else {
                        System.out.println("Stok tidak cukup. Stok tersedia: " + produkDipesan.getStok());
                    }
                } else {
                    System.out.println("Maaf, produk ini sudah habis. Silakan pilih yang lain.");
                }
            } else if (pilihan == 0) {
                selesai = true;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        System.out.println("Pesanan Anda:");
      
        int totalBayar = 0;
        for (Penjualan pesanan : daftarPesanan) {
        	int hargaPerItem = pesanan.getHargaTotal() / pesanan.getQuantity();
            System.out.println(pesanan.getNamaProduk() + " - " + pesanan.getQuantity() + " x Rp " + hargaPerItem);
            totalBayar += pesanan.getHargaTotal();
        }
        System.out.println("Total Bayar: Rp " + totalBayar);

        input.close();
    }
}