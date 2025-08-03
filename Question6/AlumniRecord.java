package Question6;

public class AlumniRecord {
    private int studentID;
    private String name;
    private String major;
    private int graduationYear;


    public AlumniRecord(int id,String name,String major,int year){
        this.studentID=id;
        this.name=name;
        this.major=major;
        this.graduationYear=year;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
