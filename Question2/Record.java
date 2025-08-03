package Question2;

public class Record {
    private String studentId;
    private String name;
    private String courseCode;
    private String timestamp;

    public Record(String id,String name,String code,String time){
        this.studentId=id;
        this.name=name;
        this.courseCode=code;
        this.timestamp=time;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString(){
        return "Student ID: "+this.studentId+"\n"+
                "Student Name: "+this.name+"\n"+
                "Course code: "+this.courseCode+"\n"+
                "Timestamp: "+this.timestamp+"\n";
    }
}
