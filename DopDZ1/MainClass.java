class MainClass {
    public static void main(String[] args) {
        checkDay(DayOfWeek.THURSDAY);

    }

    public static void checkDay(DayOfWeek value) {
        for (DayOfWeek d : DayOfWeek.values()) {
            switch (value) {
                case MONDAY: {
                    System.out.println("До конца рабочей недели " + DayOfWeek.MONDAY.getHours());
                    break;
                }
                case TUESDAY: {
                    System.out.println("До конца рабочей недели " + DayOfWeek.TUESDAY.getHours());
                    break;
                }
                case WEDNESDAY: {
                    System.out.println("До конца рабочей недели " + DayOfWeek.WEDNESDAY.getHours());
                    break;
                }
                case THURSDAY: {
                    System.out.println("До конца рабочей недели " + DayOfWeek.THURSDAY.getHours());
                    break;
                }
                case FRIDAY: {
                    System.out.println("До конца рабочей недели " + DayOfWeek.FRIDAY.getHours());
                    break;
                }
                case SATURDAY: {
                    System.out.println("Выходной день");
                    break;
                }
                case SUNDAY: {
                    System.out.println("Выходной день");
                    break;
                }

            }
            break;
        }

    }
}