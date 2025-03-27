package Quiz;

public class Employee {
    private String nameSurname;
    private int idNumber;
    private String department;
    private String position;

    public Employee() {

        nameSurname = "";
        idNumber = 9999;
        department = "";
        position = "";
    }

    public Employee(String nameSurname, int idNumber, String department, String position) {
        this.nameSurname = nameSurname;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public String getAdSoyad() {
        return nameSurname;
    }

    public void setAdSoyad(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getKurumSicilNo() {
        return idNumber;
    }

    public void setKurumSicilNo(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartman() {
        return department;
    }

    public void setDepartman(String department) {
        this.department = department;
    }

    public String getPozisyon() {
        return position;
    }

    public void setPozisyon(String position) {
        this.position = position;
    }

    public String toString() {
        return "Name Surname: " + nameSurname + " - ID Number: " + idNumber +
                " - Department: " + department + " - Position: " + position;
    }
}


