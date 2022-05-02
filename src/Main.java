import com.ulti.UltiRequiem;
import com.ulti.Day;
import com.ulti.Utils;

public class Main {
        public static void main(String[] args) {
                final var juan = new Doctor("Juan Jose", "Pediatrician");
                Doctor.showDoctor(juan);

                final var rosa = new Patient("Rosa Solis", "rosa.solis@johannesgutenberg.org");

                rosa.setDoctor(juan);

                rosa.print();
                juan.showPatients();

                final var ulti = new UltiRequiem();

                System.out.println(ulti.hello());

                try {
                        new Utils();
                } catch (Exception error) {
                        System.out.println("Error: " + error.getMessage());
                }

                System.out.println(Day.getDay(1));

        }
}
