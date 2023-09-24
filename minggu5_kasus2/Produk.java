package minggu5;

class Produk {
    private String namaProduk;
    private int harga;
    private int qty;
    private int stok;  // Menambahkan atribut stok

    public Produk(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = 0;
        this.stok = stok;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public int getStok() {
        return stok;
    }

    public void tambahQty(int jumlah) {
        qty += jumlah;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
}