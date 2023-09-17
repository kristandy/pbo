package minggu4;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    //constructor
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int x) {
        if ( x >= 0 ){
            stok += x;
        } else {
            System.out.println("Stok hanya bisa ditambah!");
        }
    }
}