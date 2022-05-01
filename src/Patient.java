public class Patient {

        String name;
        String email;
        String address;
        String phone;
        String birthday;

        Double height;
        Double weight;

        String blood;

        Doctor doctor;

        Patient(String name, String Email) {
                this.name = name;
                this.email = Email;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public void setBirthday(String birthday) {
                this.birthday = birthday;
        }

        public void setHeight(Double height) {
                this.height = height;
        }

        public void setWeight(Double weight) {
                this.weight = weight;
        }

        public void setBlood(String blood) {
                this.blood = blood;
        }

        public void setDoctor(Doctor doctor) {
                this.doctor = doctor;
        }

        public String getName() {
                return name;
        }

        public String getEmail() {
                return email;
        }

        public String getAddress() {
                return address;
        }

        public String getPhone() {
                return phone;
        }

        public String getBirthday() {
                return birthday;
        }

        public Double getHeight() {
                return height;
        }

        public Double getWeight() {
                return weight;
        }

        public String getBlood() {
                return blood;
        }

        public Doctor getDoctor() {
                return doctor;
        }

        public String toString() {
                return "Patient [name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone
                                + ", birthday=" + birthday + ", height=" + height + ", weight=" + weight + ", blood="
                                + blood
                                + ", doctor=" + doctor.ID + "]";
        }

        public void print() {
                System.out.println(toString());
        }

        public void printDoctor() {
                System.out.println(doctor.toString());
        }
}
