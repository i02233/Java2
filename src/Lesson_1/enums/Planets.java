package Lesson_1.enums;

public enum Planets {
    Mercury("Меркурий"),
    Venus("Венера"),
    Earth("Земля"),
    Mars("Марс"),
    Jupiter("Юпитер"),
    Saturn("Сатурн"),
    Uranus("Уран"),
    Neptune("Нептун");

    private String rusTitle;

    Planets(String rusTitle) {
        this.rusTitle = rusTitle;
    }


    public String getRusTitle() {
        return rusTitle;
    }
}
