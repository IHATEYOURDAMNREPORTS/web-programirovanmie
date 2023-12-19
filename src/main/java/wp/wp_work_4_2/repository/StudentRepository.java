package wp.wp_work_4_2.repository;

import org.springframework.data.repository.CrudRepository;
import wp.wp_work_4_2.entity.Student;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    public List<Student> findAll();
//    public Student findStudentByFirstNameAndLastNameAndMiddleName(
//            String firstName,
//            String lastName,
//            String middleName
//    );
}