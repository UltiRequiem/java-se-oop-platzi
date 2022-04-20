public class Doctor {
    int ID;
    String name;
    String speciality;

    Doctor(String name,String speciality){
        this.name = name;
        this.speciality = speciality;
        this.ID = (int) (Math.random() * 49 + 1);
    }

    public void showName(){
        System.out.println(name + " : " + speciality);
    }

    public void showID(){
        System.out.println("ID:" + ID);
    }
}
