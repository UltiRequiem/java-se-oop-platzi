public class Main {
    public static void main(String[] args) {
        final var juan = new Doctor("Juan Jose", "Pediatrician");

        juan.showName();
        juan.showID();

        System.out.println("The cool number is" + randomNumber());
    }

    public static int randomNumber(){
        return (int) (Math.random() * 50);
    }
}
