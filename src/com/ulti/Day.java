package com.ulti;

public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        public static Day getDay(int day) {
                switch (day) {
                        case 1:
                                return MONDAY;
                        case 2:
                                return TUESDAY;
                        case 3:
                                return WEDNESDAY;
                        case 4:
                                return THURSDAY;
                        case 5:
                                return FRIDAY;
                        case 6:
                                return SATURDAY;
                        case 7:
                                return SUNDAY;
                }

                throw new IllegalArgumentException("Invalid day: " + day);
        }
}
