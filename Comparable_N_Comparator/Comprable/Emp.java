package Comparable_N_Comparator.Comprable;

public class Emp implements Comparable<Emp>{
    @Override
    public int compareTo(Emp o) {
        return this.phone - o.phone;
    }
    private String name;
    private int phone;
    private String email;
    public String getName() {
        return name;
    }
    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Emp(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
