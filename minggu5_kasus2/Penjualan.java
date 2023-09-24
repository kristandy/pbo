package minggu5;

class Penjualan {
    private String namaProduk;
    private int quantity;
    private int hargaTotal;

    public Penjualan(String namaProduk, int quantity, int hargaTotal) {
        this.namaProduk = namaProduk;
        this.quantity = quantity;
        this.hargaTotal = hargaTotal;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }
}