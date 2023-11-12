package week12;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        // Menambahkan paman
        family.addUncle("John");
        family.addUncle("Mike");

        // Menambahkan keponakan
        family.addNiece("Alice", 10, 5);
        family.addNiece("Bob", 5, 8);

        // List paman dan keponakan
        family.listUncles();
        family.listNieces();

        // Menambahkan hadiah
        Uncle john = family.findUncle("John");
        john.setFamily(family);
        john.addPresent(family.findNiece("Alice"), "Barbie");

        Uncle mike = family.findUncle("Mike");
        mike.setFamily(family);
        mike.addPresent(family.findNiece("Bob"), "Book");

        // List hadiah
        john.listPresents();
        mike.listPresents();

        // Mencoba memberi hadiah sama
        john.addPresent(family.findNiece("Alice"), "Barbie"); // akan gagal

        // Menghapus hadiah keponakan
        Niece alice = family.findNiece("Alice");
        alice.clearPresents(family);

        // List hadiah setelah penghapusan
        john.listPresents();

        // Paman memberi hadian kepada ponakan
        john.addPresent(family.findNiece("Bob"), "Batman Comic");
        mike.addPresent(family.findNiece("Alice"), "RTX 4090");

        // list hadiah setealah pamah memberi hadiah
        john.listPresents();
        mike.listPresents();
    }
}
