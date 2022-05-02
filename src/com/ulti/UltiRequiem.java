package com.ulti;

import java.util.Calendar;

public class UltiRequiem {

        public String name;
        public int age;

        public UltiRequiem() {
                var currentYear = Calendar.getInstance().get(Calendar.YEAR);

                name = "Eliaz Bobadilla";
                age = currentYear - 2006;
        }

        public String hello() {
                return String.format("My name is %s and I'm %d years old.", name, age);
        }
}
