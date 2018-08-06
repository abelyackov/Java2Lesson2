public enum DayOfWeek {
    MONDAY("Понедельник", 40),
    TUESDAY("Вторник", 32),
    WEDNESDAY("Среда", 24),
    THURSDAY("Четверг", 16),
    FRIDAY("Пятница", 8),
    SATURDAY("Суббота", 0),
    SUNDAY("Воскресенье", 0);

    private String rusName;
    private int hours;

    DayOfWeek(String rusName, int hours) {
        this.rusName = rusName;
        this.hours = hours;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }

    public int getHours() {
        return hours;
    }
}


