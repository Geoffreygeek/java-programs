public class StudentRegMain {
    public static void main(String[] args) {
        System.out.println("\n=========using new Course==========");

        // Create StudentCourse objects with new Course objects
        StudentCourse dan = new StudentCourse("G127/001/2023", "Daniel Nzioki", new Course("SCI220", "Programming in Python"));
        StudentCourse kip = new StudentCourse("G127/2234/2023", "Kipkirui Jang", new Course("SCI303", "Web Programming"));

        System.out.println("\n___________________________\n");
        System.out.println(dan.toString());
        System.out.println("_____________________________");
        System.out.println(kip.toString());

        System.out.println("\n================================");
        System.out.println("=====CREATE OBJECT FIRST========");

        // Create Course objects first and then use them in StudentCourse objects
        Course a = new Course("SCI220", "Programming in Python");
        Course b = new Course("SCI303", "Web Programming");

        StudentCourse dann = new StudentCourse("G127/001/2023", "Daniel Nzioki", a);
        System.out.println(dann.toSZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZtring());
        System.out.println("_____________________________");

        StudentCourse kipp = new StudentCourse("G127/2234/2023", "Kipkirui Jang", b);
        System.out.println(kipp.toString());

        System.out.println("================================");
    }
}