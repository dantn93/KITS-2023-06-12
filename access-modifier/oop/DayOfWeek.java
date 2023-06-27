package oop;

public enum DayOfWeek {
    MONDAY(1, "Thu hai"),
    TUESDAY(2, "Thu ba");
    // WEDNESDAY(3),
    // THURSDAY(4),
    // FRIDAY(5),
    // SATURDAY(6),
    // SUNDAY(7);

    private final int dayNumber;
    private final String vnLang;

    private DayOfWeek(int dayNumber, String vnLang) {
        System.out.println("Constructor: " + dayNumber + " -- " + vnLang);
        this.dayNumber = dayNumber;
        this.vnLang = vnLang;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
