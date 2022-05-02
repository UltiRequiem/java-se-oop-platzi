import java.util.ArrayList;
import com.ulti.Utils;

public class Doctor {
        int ID;
        String name;
        String speciality;

        ArrayList<Patient> patients;

        Doctor(String name, String speciality) {
                this.name = name;
                this.speciality = speciality;
                this.ID = Utils.randomNumber();
                this.patients = new ArrayList<>();
        }

        public void showName() {
                System.out.printf("Name -> %s", name);
                System.out.println();
        }

        public void showID() {
                System.out.printf("ID -> %d", ID);
                System.out.println();
        }

        public void addPatient(Patient patient) {
                patients.add(patient);
        }

        public void showPatients() {
                for (Patient patient : patients) {
                        System.out.printf("Patient -> %s", patient.name);
                        System.out.println();
                }
        }

        static void showDoctor(Doctor doctor) {
                doctor.showName();
                doctor.showID();
        }

}
