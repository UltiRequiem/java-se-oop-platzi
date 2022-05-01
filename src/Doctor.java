public class Doctor {
        int ID;
        String name;
        String speciality;

        Doctor(String name, String speciality) {
                this.name = name;
                this.speciality = speciality;
                this.ID = Utils.randomNumber();
        }

        public void showName() {
                System.out.printf("Name -> %s", name);
                System.out.println();
        }

        public void showID() {
                System.out.printf("ID -> %d", ID);
                System.out.println();
        }

        static void showDoctor(Doctor doctor) {
                doctor.showName();
                doctor.showID();
        }
}
