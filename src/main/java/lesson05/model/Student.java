package lesson05.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;


@Entity
@Table(name = "student_table")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_student")
    private String name;

    @Column(name = "mark")
    private int mark;


    public Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }


}
