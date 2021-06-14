package lesson05;

import lesson05.model.Student;
import lesson05.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        // 1. Создать базу данных Student с полями id, name, mark.
        // 2. Создать сущность Student и добавить в нее аннотации. Поле id должно заполняться автоматически.
        // 3. Создать конфигурационный файл hibernate.cfg.xml, в котором указать свойства для подключения к БД и список классов с аннотациями Entity.
        // 4. Создать класс со статическим методом, который возвращает объект SessionFactory.
        // 5. Создать DAO-слой с операциями добавления, удаления, изменения сущности, выборки записи по ID и всех записей.
        // 6. Добавить 1000 записей в таблицу Student.
        // 7. Проверить работоспособность приложения,
        // выполнить методы по удалению,
        // изменению,
        // добавлению записей,
        // а также выборки одной и всех записей.

        StudentService studentService = new StudentService();
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i <= 1000; i++) {
            studentList.add(new Student("Student_" + i, (int) (Math.random() * 4) +2));
        }

    //   for (Student s:studentList) {
    //       System.out.println(s);
    //   }
        for (Student s:studentList) {
            studentService.save(s);
        }
        studentList.get(666).setMark(666);
        studentService.update(studentList.get(666));

     //  Studenе student_deleted  = new Student("deleted", 5);
     //  studentService.save(student_deleted);
     //  System.out.println(studentService.findById(1004));
      // studentService.delete(student_deleted);
      // System.out.println(studentService.findById(1004));



    }
}
