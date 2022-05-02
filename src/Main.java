public class Main {
        public static void main(String[] args) {
                final var juan = new Doctor("Juan Jose", "Pediatrician");

                Doctor.showDoctor(juan);

                final var rosa = new Patient("Rosa Solis", "rosa.solis@johannesgutenberg.org");

                rosa.setDoctor(juan);

                rosa.print();

                juan.showPatients();
        }

}
