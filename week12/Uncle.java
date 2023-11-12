package week12;

import java.util.Map;

public class Uncle {

    private String name;
    private Family family;

    Uncle(String name) {
        this.name = name;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (family == null || family.findNiece(recipient.getName()) == null) {
            return false;
        }

        Map<Uncle, String> niecePresents = family.getPresents().get(recipient);

        if (niecePresents.values().stream()
                .anyMatch(present -> present.equalsIgnoreCase(description))) {
            return false; // Hadiah duplikat dari paman yang sama
        }

        for (Map.Entry<Uncle, String> entry : niecePresents.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(description)) {
                return false; // Hadiah duplikat untuk ponakan yang sama
            }
        }

        niecePresents.put(this, description);
        return true;
    }

    public void listPresents() {
        if (family != null) {
            Map<Niece, Map<Uncle, String>> allPresents = family.getPresents();

            System.out.println("Presents given by uncle " + name + ":");
            for (Map.Entry<Niece, Map<Uncle, String>> nieceEntry : allPresents.entrySet()) {
                Niece niece = nieceEntry.getKey();
                String present = nieceEntry.getValue().get(this);
                if (present != null) {
                    System.out.println("To niece " + niece.getName() + ": " + present);
                } else {
                    System.out.println("No present for niece " + niece.getName());
                }
            }
        } else {
            System.out.println("Uncle " + name + " is not associated with any family.");
        }
    }

    @Override
    public String toString() {
        return "Uncle{" +
                "name='" + name + '\'' +
                '}';
    }
}
