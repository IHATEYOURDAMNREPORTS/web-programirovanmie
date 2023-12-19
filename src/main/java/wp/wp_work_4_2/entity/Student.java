package wp.wp_work_4_2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", insertable=false, updatable=false)
    private Long id;

    @Column(columnDefinition = "credit_card", nullable = false)
    @Comment(value = "Номер зачетной книжки")
    private String creditCard;

    @Column(columnDefinition = "first_name", nullable = false)
    @Comment(value = "Имя студента")
    private String firstName;

    @Column(columnDefinition = "last_name", nullable = false)
    @Comment(value = "Фамилия студента")
    private String lastName;

    @Column(columnDefinition = "middle_name", nullable = false)
    @Comment(value = "Отчество студента")
    private String middleName;

    @OneToMany(mappedBy =  "student")
    private Set<Execution> executions = new HashSet<>();
}
