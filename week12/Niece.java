package week12;

public class Niece {

    private String name;
    private int birthdayDay;
    private int birthdayMonth;

    Niece(String name, int day, int month) {
        this.name = name;
        this.birthdayDay = day;
        this.birthdayMonth = month;
    }

    public String getName() {
        return name;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public int clearPresents(Family family) {
        int removedPresents = family.getPresents().get(this).size();
        family.getPresents().get(this).clear();
        return removedPresents;
    }

    @Override
    public String toString() {
        return "Niece{" +
                "name='" + name + '\'' +
                ", birthdayDay=" + birthdayDay +
                ", birthdayMonth=" + birthdayMonth +
                '}';
    }
}
