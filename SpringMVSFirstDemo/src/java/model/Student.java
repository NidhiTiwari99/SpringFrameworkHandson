
package model;


public class Student {
    
    private int rno;
    private String Name;
    private String qualification;
    private float percentage;

    public Student() {
    }

    public Student(int rno, String Name, String qualification, float percentage) {
        this.rno = rno;
        this.Name = Name;
        this.qualification = qualification;
        this.percentage = percentage;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
