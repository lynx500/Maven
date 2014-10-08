package skillsup.hometask1.Implementation;

import skillsup.hometask1.API.jarFiles.MusicSchoolOrganizer;
import skillsup.hometask1.API.jarFiles.Performance;
import skillsup.hometask1.API.jarFiles.SchoolClass;
import skillsup.hometask1.API.jarFiles.Student;

import java.util.ArrayList;
import java.util.List;

public class Implementation implements MusicSchoolOrganizer {

    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
    ArrayList<Performance> schedule = new ArrayList<Performance>();

    @Override
    public void addNewStudent(Student student, SchoolClass schoolClass) {
        students.add(student);
        schoolClasses.add(schoolClass);
    }

    @Override
    public void deleteStudentFromClass(Student student, SchoolClass schoolClass) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(student)) {
                for (int j = 0; j < schoolClasses.size(); j++) {
                    if (schoolClasses.get(j).equals(schoolClass)) {
                        students.remove(i);
                    }
                }
            }
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public List<Student> getStudentsFromClass(SchoolClass schoolClass) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < schoolClasses.size(); i++) {
            if (schoolClasses.get(i).equals(schoolClass)) {
                list.add(i);
                System.out.println(students.get(i));
            }
        }
        return list;
    }

    @Override
    public void schedulePerformance(Performance performance) {
        schedule.add(performance);
    }
}
