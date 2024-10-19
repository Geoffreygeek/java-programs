public class Course {
    private String unitCode;
    private String unitTitle;

    public Course(String unitCode, String unitTitle) {
        this.unitCode = unitCode;
        this.unitTitle = unitTitle;
    }

    // Setters and Getters
    public void setUnitCode(String newUnitCode) {
        this.unitCode = newUnitCode;
    }

    public String getUnitCode() {
        return this.unitCode;
    }

    public void setUnitTitle(String newUnitTitle) {
        this.unitTitle = newUnitTitle;
    }

    public String getUnitTitle() {
        return this.unitTitle;
    }

    @Override
    public String toString() {
        return "UNIT CODE: " + unitCode + "\nUNIT TITLE: " + unitTitle;
    }
}