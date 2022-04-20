public class Doctor {
    int ID;
    String name;
    String speciality;

    Doctor(String name ){
        this.name = name;
        System.out.println("Building a new doctor");
    }

    public  void showName(){
        System.out.println(name);
    }
}
