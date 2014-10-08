package skillsup.hometask1.Implementation;

import skillsup.hometask1.API.jarFiles.Performance;
import skillsup.hometask1.API.jarFiles.SchoolClass;
import skillsup.hometask1.API.jarFiles.Student;

public class Main {
    public static void main(String[] args) {
        Implementation impl = new Implementation();
        impl.addNewStudent(new Student("Nika"), new SchoolClass("violin"));
        impl.addNewStudent(new Student("Jack"), new SchoolClass("piano"));
        impl.getAllStudents();
        impl.schedulePerformance(new Performance("24th of October"));
    }
}
