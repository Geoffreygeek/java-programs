public class StudentCourse {
    private String regNo;
    private String fullNames;
    private Course course; // Object of type Course (Aggregation)

    public StudentCourse(String regNo, String fullNames, Course course) {
        this.regNo = regNo;
        this.fullNames = fullNames;
        this.course = course;
    }

    // Setters and Getters
    public void setRegNo(String newReg) {
        this.regNo = newReg;
    }

    public String getRegNo() {
        return this.regNo;
    }

    public void setFullNames(String newName) {
        this.fullNames = newName;
    }

    public String getFullNames() {
        return this.fullNames;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return this.course;
    }

    @Override
    public String toString() {
        return "Full Name: " + fullNames + "\n" + getCourse().toString();
    }
}