package new_branch;

public class newbranch {
    int roll;
    String name;
    float cgpa;

    public newbranch(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
