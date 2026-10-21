public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent es=new EngineeringStudent();
        es.markAttendence();
        es.labAttendence();
    }
}

class Student {
    String name;
    int age;

    void markAttendence() {
        System.out.println("Attendence Marked");
    }
}

class EngineeringStudent extends Student{
    void labAttendence() {
        System.out.println("lab attended");
    }
}
