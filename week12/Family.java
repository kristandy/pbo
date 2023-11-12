package week12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Family {

    private List<Uncle> uncles;
    private List<Niece> nieces;
    private Map<Niece, Map<Uncle, String>> presents;

    public Family() {
        uncles = new ArrayList<>();
        nieces = new ArrayList<>();
        presents = new HashMap<>();
    }

    public boolean addNiece(String name, int day, int month) {
        if (findNiece(name) != null) {
            return false;
        }
        Niece niece = new Niece(name, day, month);
        nieces.add(niece);
        presents.put(niece, new HashMap<>());
        sortNiecesByBirthday();
        return true;
    }

    public boolean addUncle(String string) {
        if (findUncle(string) != null) {
            return false;
        }
        Uncle uncle = new Uncle(string);
        uncles.add(uncle);
        sortUnclesByName();
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        System.out.println("List of nieces:");
        for (Niece niece : nieces) {
            System.out.println(niece);
        }
    }

    public void listUncles() {
        System.out.println("List of uncles:");
        for (Uncle uncle : uncles) {
            System.out.println(uncle);
        }
    }

    private void sortNiecesByBirthday() {
        nieces.sort(Comparator.comparingInt(Niece::getBirthdayMonth)
                .thenComparingInt(Niece::getBirthdayDay));
    }

    private void sortUnclesByName() {
        uncles.sort(Comparator.comparing(Uncle::getName));
    }

    public Map<Niece, Map<Uncle, String>> getPresents() {
        return presents;
    }
}
