package skillsup.hometask1;

import skillsup.hometask1.Performance;
import skillsup.hometask1.SchoolClass;
import skillsup.hometask1.Student;
import java.util.*;

/**
 * Created by Нина on 14.09.2014.
 */
public interface MusicSchoolOrganizer {
    void addNewStudent(Student student, SchoolClass schoolClass);
    void deleteStudentFromClass(Student student, SchoolClass schoolClass);
    List<Student> getAllStudents();
    List<Student> getStudentsFromClass(SchoolClass schoolClass);
    void schedulePerformance(Performance performance);
}
