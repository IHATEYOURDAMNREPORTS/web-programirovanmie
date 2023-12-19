package wp.wp_work_4_2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "executions")
@Data
@NoArgsConstructor
public class Execution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", insertable=false, updatable=false)
    private Long id;
    @Column(columnDefinition = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(columnDefinition = "student_id", nullable = false)
    private Student student;
    @ManyToOne
    @JoinColumn(columnDefinition = "work_id", nullable = false)
    private Work work;
}
